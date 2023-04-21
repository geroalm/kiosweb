package com.ga.kiosguay.principal.controller;

import com.ga.kiosguay.principal.data.dto.ProductoDTO;
import com.ga.kiosguay.principal.data.entity.CategoriaProducto;
import com.ga.kiosguay.principal.data.entity.Marca;
import com.ga.kiosguay.principal.data.entity.Producto;
import com.ga.kiosguay.principal.service.interfaces.BasicService;
import com.ga.kiosguay.principal.service.interfaces.ProductoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/principal/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private BasicService basicService;


    @GetMapping("listado")
    public ResponseEntity<List<Producto>> getListaProductos(){
        return new ResponseEntity<List<Producto>> (productoService.getAllProductos(),HttpStatus.OK);
    }

    @GetMapping("buscarid/{id}")
    public ResponseEntity<Optional<Producto>> getProductoPorId(@PathVariable("id") Long id) {
        Optional<Producto> producto = productoService.getProductoById(id);
        if (producto.isPresent()) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("add")
    public ResponseEntity crear(@Validated @RequestBody ProductoDTO nuevoProdDTO){
        Producto nuevoProd = new Producto();
        BeanUtils.copyProperties(nuevoProdDTO,nuevoProd);
        Optional OMarca = basicService.getMarcaById(nuevoProdDTO.getMarca());
        Optional OCategoria = basicService.getCategoriaById(nuevoProdDTO.getCategoria());

        if (OMarca.isPresent()) {
            nuevoProd.setMarca((Marca) OMarca.get());
        }
        if (OCategoria.isPresent()) {
            nuevoProd.setCategoria((CategoriaProducto) OCategoria.get());
        }


        return ResponseEntity.ok(productoService.saveProducto(nuevoProd));
    }


    @GetMapping("/buscarcategoria/{categoriaId}")
    public ResponseEntity<List<Producto>> getProductosPorCategoria(@PathVariable("categoriaId") Long categoria){
        CategoriaProducto locCategoria = new CategoriaProducto();
        locCategoria.setId(categoria);
        return new ResponseEntity<List<Producto>>(productoService.findByCategoria(locCategoria),HttpStatus.OK);
    }
    @GetMapping("/buscarmarca/{marcaId}")
    public ResponseEntity<List<Producto>> getProductosPorCategoriaMarca(@PathVariable("marcaId") Long pMarca){
        Marca locMarca = new Marca();
        locMarca.setId(pMarca);
        return new ResponseEntity<List<Producto>>(productoService.findByMarca(locMarca),HttpStatus.OK);
    }
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        String message = "ENTRADA INVALIDA: " + ex.getValue();
        return ResponseEntity.badRequest().body(message);
    }

    @GetMapping("/buscarnombre/{nombre}")
    public ResponseEntity<List<Producto>> getProductosPorMarca(@PathVariable("nombre") String pNombre) {
        return new ResponseEntity<List<Producto>>(productoService.findByNombreContaining(pNombre), HttpStatus.OK);


    }
        @PutMapping ("/update/{id}")
        public ResponseEntity update(@RequestBody ProductoDTO nuevoProdDTO, @PathVariable Long id ){
           //busco el producto
            Optional<Producto> locProd = productoService.getProductoById(id);
            if(!locProd.isPresent()){
                return ResponseEntity.notFound().build();
            }
            Producto prod = locProd.get();
            BeanUtils.copyProperties(nuevoProdDTO,prod,"id");

            Optional<Marca> OMarca = basicService.getMarcaById(nuevoProdDTO.getMarca());
            Optional<CategoriaProducto> OCategoria = basicService.getCategoriaById(nuevoProdDTO.getCategoria());


            OMarca.ifPresent(prod::setMarca);
            OCategoria.ifPresent(prod::setCategoria);

            return ResponseEntity.ok(productoService.saveProducto(prod));
        }
}

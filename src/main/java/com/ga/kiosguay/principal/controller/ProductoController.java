package com.ga.kiosguay.principal.controller;

import com.ga.kiosguay.principal.data.entity.Producto;
import com.ga.kiosguay.principal.service.interfaces.ProductoService;
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


    @GetMapping("listado")
    public ResponseEntity<List<Producto>> getListaProductos(){
        return new ResponseEntity<List<Producto>> (productoService.getAllProductos(),HttpStatus.OK);
    }

    @GetMapping("producto/{id}")
    public ResponseEntity<Optional<Producto>> getProductoPorId(@PathVariable("id") Long id) {
        Optional<Producto> producto = productoService.getProductoPorId(id);
        if (producto.isPresent()) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("producto/add")
    public ResponseEntity create(@Validated @RequestBody Producto nuevoProd){
        return ResponseEntity.ok(productoService.saveProducto(nuevoProd));
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<String> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        String message = "ENTRADA INVALIDA: " + ex.getValue();
        return ResponseEntity.badRequest().body(message);
    }
}

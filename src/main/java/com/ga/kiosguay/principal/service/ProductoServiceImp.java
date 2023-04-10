package com.ga.kiosguay.principal.service;

import com.ga.kiosguay.principal.data.entity.CategoriaProducto;
import com.ga.kiosguay.principal.data.entity.Marca;
import com.ga.kiosguay.principal.data.entity.Producto;
import com.ga.kiosguay.principal.repository.ProductoRepository;
import com.ga.kiosguay.principal.service.interfaces.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository productoRep;

    public List<Producto> getAllProductos(){
        return productoRep.findAll();
    }

    public Optional<Producto> getProductoById(Long id){
        return this.productoRep.findById(id);
    }

    public Producto saveProducto(Producto producto){
        return this.productoRep.save(producto);
    }

    public Producto updateProducto(Producto prod){
     Producto updatedProd = productoRep.save(prod);
      return updatedProd;

    }

    @Override
    public List<Producto> findByCategoria(CategoriaProducto pCategoriaProducto) {
        return productoRep.findByCategoria(pCategoriaProducto);
    }

    @Override
    public List<Producto> findByMarca(Marca pMarca) {
        return productoRep.findByMarca(pMarca);
    }

    @Override
    public List<Producto> findBySerial(String pSerial) {
        return findBySerial(pSerial);
    }

    @Override
    public List<Producto> findByNombre(String pNombre) {
        return productoRep.findByNombre(pNombre);
    }

    @Override
    public List<Producto> findByNombreContaining(String pNombre) {
        return productoRep.findByNombreContaining(pNombre);
    }

    @Override
    public List<Producto> findByCodigo(String pCodigo) {
        return findByCodigo(pCodigo);
    }


}

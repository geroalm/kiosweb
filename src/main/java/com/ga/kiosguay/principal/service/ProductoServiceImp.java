package com.ga.kiosguay.principal.service;

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

    public Optional<Producto> getProductoPorId(Long id){
        return this.productoRep.findById(id);
    }

    public Producto saveProducto(Producto producto){
        return this.productoRep.save(producto);
    }
    public Producto updateProducto(Producto prod){
     Producto updatedProd = productoRep.save(prod);
      return updatedProd;

    }
}

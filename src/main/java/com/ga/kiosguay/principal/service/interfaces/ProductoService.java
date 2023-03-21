package com.ga.kiosguay.principal.service.interfaces;
import com.ga.kiosguay.principal.data.entity.Producto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProductoService {

    public List<Producto> getAllProductos();

    public Optional<Producto> getProductoPorId(Long id);

    public Producto saveProducto(Producto producto);

    public Producto updateProducto(Producto prod);
}

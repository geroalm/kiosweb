package com.ga.kiosguay.principal.service.interfaces;
import com.ga.kiosguay.principal.data.entity.CategoriaProducto;
import com.ga.kiosguay.principal.data.entity.Marca;
import com.ga.kiosguay.principal.data.entity.Producto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProductoService {

    public List<Producto> getAllProductos();

    public Optional<Producto> getProductoById(Long id);

    public Producto saveProducto(Producto producto);

    public Producto updateProducto(Producto prod);

    public List<Producto> findByCategoria(CategoriaProducto pCategoriaProducto);

    public List<Producto> findByMarca (Marca pCategoria);

    public List<Producto> findBySerial (String pSerial);

    public List<Producto> findByNombre (String pNombre);

    public List<Producto> findByCodigo (String pCcodigo);

}

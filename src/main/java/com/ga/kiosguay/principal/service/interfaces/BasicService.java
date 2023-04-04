package com.ga.kiosguay.principal.service.interfaces;

import com.ga.kiosguay.principal.data.entity.CategoriaProducto;
import com.ga.kiosguay.principal.data.entity.Marca;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BasicService {

    public List<CategoriaProducto> getAllCategorias();

    public List<CategoriaProducto> findByCategoriaNombre(String nombre);

    public Optional<CategoriaProducto> getCategoriaById(Long id);

    public CategoriaProducto saveCategoria(CategoriaProducto categoria);

    public CategoriaProducto updateCategoria(CategoriaProducto categoria);

    public List<Marca> getAllMarcas();

    public List<Marca> findByNombre(String nombre);

    public Optional<Marca> getMarcaById(Long id);

    public Marca saveMarca(Marca marca);

    public Marca updateMarca(Marca marca);

}

package com.ga.kiosguay.principal.service;

import com.ga.kiosguay.principal.data.entity.CategoriaProducto;
import com.ga.kiosguay.principal.data.entity.Marca;
import com.ga.kiosguay.principal.repository.CategoriaRepository;
import com.ga.kiosguay.principal.repository.MarcaRepository;
import com.ga.kiosguay.principal.service.interfaces.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BasicServiceImp implements BasicService {
    @Autowired
    CategoriaRepository categoriaRepo;
    @Autowired
    MarcaRepository marcaRepo;

    @Override
    public List<Marca> getAllMarcas() {
        return marcaRepo.findAll();
    }

    @Override
    public List<Marca> findByNombre(String nombre) {
        return marcaRepo.findByNombre(nombre);
    }

    @Override
    public Optional<Marca> getMarcaById(Long pId) {
        return marcaRepo.findById(pId);
    }

    @Override
    public Marca saveMarca(Marca marca) {
        return marcaRepo.save(marca);
    }

    @Override
    public Marca updateMarca(Marca marca) {
        return marcaRepo.save(marca);
    }

    @Override
    public List<CategoriaProducto> getAllCategorias() {
        return categoriaRepo.findAll();
    }

    @Override
    public List<CategoriaProducto> findByCategoriaNombre(String nombre) {
        return categoriaRepo.findByNombre(nombre);
    }


    @Override
    public Optional<CategoriaProducto> getCategoriaById(Long id) {
        return categoriaRepo.findById(id);
    }

    @Override
    public CategoriaProducto saveCategoria(CategoriaProducto categoria) {
        return categoriaRepo.save(categoria);
    }

    @Override
    public CategoriaProducto updateCategoria(CategoriaProducto categoria) {
        return categoriaRepo.save(categoria);
    }


}

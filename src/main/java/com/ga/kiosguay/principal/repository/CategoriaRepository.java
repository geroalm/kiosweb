package com.ga.kiosguay.principal.repository;

import com.ga.kiosguay.principal.data.entity.CategoriaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<CategoriaProducto,Long> {
    public List<CategoriaProducto> findByNombre(String nombre);
}

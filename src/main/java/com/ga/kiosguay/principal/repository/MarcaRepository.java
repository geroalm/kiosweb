package com.ga.kiosguay.principal.repository;

import com.ga.kiosguay.principal.data.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarcaRepository extends JpaRepository<Marca,Long> {
    List<Marca> findByNombre(String nombre);
}

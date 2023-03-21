package com.ga.kiosguay.principal.repository;

import com.ga.kiosguay.principal.data.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductoRepository extends JpaRepository<Producto, Long> {
}

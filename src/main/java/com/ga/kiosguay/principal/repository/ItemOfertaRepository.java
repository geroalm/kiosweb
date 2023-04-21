package com.ga.kiosguay.principal.repository;

import com.ga.kiosguay.principal.data.entity.ItemOferta;
import com.ga.kiosguay.principal.data.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemOfertaRepository extends JpaRepository<ItemOferta,Long> {

    @Query("SELECT i FROM ItemOferta i WHERE i.producto = ?1 AND i.estado = 'ACTIVO'")
    List<ItemOferta> findByProductoAndEstadoActivo(Producto producto);


}

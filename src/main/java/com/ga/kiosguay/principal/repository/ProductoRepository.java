package com.ga.kiosguay.principal.repository;

import com.ga.kiosguay.principal.data.entity.CategoriaProducto;
import com.ga.kiosguay.principal.data.entity.Marca;
import com.ga.kiosguay.principal.data.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface  ProductoRepository extends JpaRepository<Producto, Long> {
    public List<Producto> findByCategoria (CategoriaProducto pCategoria);

 /*   @Query("SELECT p FROM Producto p WHERE p.categoria = :categoria")
    List<Producto> buscarPorCategoria(@Param("categoria") Categoria categoria);*/

    public List<Producto> findByMarca (Marca pMarca);

    public List<Producto> findBySerial (String pSerial);

    public List<Producto> findByNombre (String pNombre);

    public List<Producto> findByNombreContaining(String pNombre);

    public List<Producto> findByCodigo (String pCodigo);

/*    @Query("SELECT p FROM Producto p JOIN p.marca m JOIN p.categoria c " +
            "LEFT JOIN c.subcategorias s WHERE p.nombre = :nombre " +
            "OR m.nombre = :nombre " +
            "OR c.nombre = :nombre " +
            "OR s.nombre = :nombre")
    List<Producto> buscarPorNombreMarcaCategoriaOSubcategoria(@Param("nombre") String nombre);*/


}

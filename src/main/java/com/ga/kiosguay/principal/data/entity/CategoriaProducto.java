package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "CATEGORIA_PRODUCTO")
public class CategoriaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_categoria_producto_id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_categoriaproducto_producto"))
    private CategoriaProducto categoriaPadre;

    @OneToMany(mappedBy = "categoriaPadre")
    private List<CategoriaProducto> subCategorias;
}

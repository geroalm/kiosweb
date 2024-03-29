package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductoTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_productoTag_id")

    private Long id;

    private String tag;

    @ManyToMany(mappedBy = "tags")
    private List<Producto> listaProductos = new ArrayList<Producto>();


}

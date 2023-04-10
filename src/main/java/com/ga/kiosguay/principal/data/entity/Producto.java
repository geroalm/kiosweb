package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Producto {
    public enum Estado{
        ACTIVO,INACTIVO
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "nombre_prod")
    private String nombre;

    @Column(unique = true, name = "codigo_prod")
    private String codigo;

    @Column(unique = true)
    private String serial;

    private long iva;

    @ManyToMany
    @JoinTable(name = "Productos_tags",
            joinColumns = {@JoinColumn(name = "producto_id")},
            inverseJoinColumns = { @JoinColumn(name = "tag_id")}
    )
    private List<ProductoTag> tags = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)

    private Marca marca;

    @ManyToOne(fetch = FetchType.EAGER)
    private CategoriaProducto categoria;

    private String descripcion;

    private double precio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Enumerated(EnumType.ORDINAL)
    private Estado estado = Estado.ACTIVO;


    @PrePersist
    public void prePersist() {
        fechaAlta = new Date();
    }

}

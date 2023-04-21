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
    @PrimaryKeyJoinColumn(name = "pk_producto_id")
    private Long id;

    @Column(unique = true, name = "nombre_prod")
    private String nombre;

    @Column(unique = true, name = "codigo_prod")
    private String codigo;

    @Column(unique = true)
    private String serial;

    private Long iva = 21L;

    @ManyToMany
    @JoinTable(name = "Productos_tags",
            joinColumns = {@JoinColumn(name = "producto_id", foreignKey = @ForeignKey(name = "fk_productostags_producto"))},
            inverseJoinColumns = { @JoinColumn(name = "tag_id", foreignKey = @ForeignKey(name = "fk_productostags_tag"))}
    )
    private List<ProductoTag> tags = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_producto_marca"))
    private Marca marca;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_producto_categoria"))
    private CategoriaProducto categoria;

    private String descripcion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Enumerated(EnumType.ORDINAL)
    private Estado estado = Estado.ACTIVO;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_producto_medida"))
    private Medida medida;

    private long precioLista;

    @OneToOne
    @JoinColumn(name = "stock_id",foreignKey = @ForeignKey(name = "fk_producto_stock"))
    private Stock stock;

    @PrePersist
    public void prePersist() {
        fechaAlta = new Date();
    }


}

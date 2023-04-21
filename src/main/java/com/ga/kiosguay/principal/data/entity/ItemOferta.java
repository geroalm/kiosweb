package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemOferta {
    public enum Estado{
        ACTIVO,INACTIVO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_itemOferta_id")
    private Long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_itemOferta_producto"))
    private Oferta oferta;

    //Cantidad de intem que
    private long cantidad = 1L;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_itemOferta_producto"))
    private Producto producto;


    @Enumerated(EnumType.ORDINAL)
    private Estado estado = Estado.ACTIVO;

}

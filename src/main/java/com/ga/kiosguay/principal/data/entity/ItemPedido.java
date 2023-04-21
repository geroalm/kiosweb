package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_itempedido_id")

    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "id_pedido", foreignKey = @ForeignKey(name = "fk_itempedido_pedido"))
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto",foreignKey = @ForeignKey(name = "fk_itempedido_producto"))
    private Producto producto;

    //precio al momento de la venta
    private Long precio;

    private Long cantidad;


}

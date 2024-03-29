package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_pedido_id")
    private Long id;
    @Column(name = "DETALLE_VENTA")
    private String detallePedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_pedido_cliente"))
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> listaItemsVenta = new ArrayList<ItemPedido>();
}

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
    private Long id;
    @Column(name = "DETALLE_VENTA")
    private String detallePedido;

    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    @OneToMany(mappedBy = "venta")
    private List<ItemVenta> listaItemsVenta = new ArrayList<ItemVenta>();
}

package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "stock")
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_stock_id")
    private Long id;

    private Long cantidad;

    @OneToOne(mappedBy = "stock")
    private Producto producto;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_stock_deposito"))
    private Deposito deposito;



}

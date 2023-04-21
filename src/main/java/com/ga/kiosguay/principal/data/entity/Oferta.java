package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Oferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_oferta_id")
    private Long id;

    @OneToMany(mappedBy = "oferta", fetch = FetchType.LAZY)
    List<ItemOferta> itemsOferta = new ArrayList<ItemOferta>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_oferta-validezOferta"))
    private ValidezOferta validez;

    private String nombre;

    private String detalle;





}

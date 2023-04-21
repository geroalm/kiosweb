package com.ga.kiosguay.principal.data.entity.framework;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_localidad_id")
    private Long id;
    private String nombre;
    private String descripcion;
    private String codigo;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_localidad_provincia"))
    private Provincia provincia;



}
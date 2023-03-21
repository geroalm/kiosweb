package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {
    public enum Estado {
        ACTIVO,
        INACTIVO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String razonSocial;
    private String dni;
    private String direccion;
    private String direccionEntrega;
    private String telefono;
    private String telefonoAlt;
    private String detalle;


    @Enumerated(EnumType.ORDINAL)
    private Estado estado;



}

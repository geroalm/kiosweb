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
    @PrimaryKeyJoinColumn(name = "pk_cliente_id")
    private Long id;
    private String nombre;
    private String apellido;
    private String razonsocial;
    private String dni;
    private String direccion;
    private String direccionentrega;
    private String telefono;
    private String telefonoalt;
    private String detalle;


    @Enumerated(EnumType.ORDINAL)
    private Estado estado;



}

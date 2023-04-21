package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medida {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @PrimaryKeyJoinColumn(name = "pk_medida_id")
        private Long id;
        private String nombre;
        private String detalle;





}

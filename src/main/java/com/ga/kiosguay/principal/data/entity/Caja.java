package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Caja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_caja_id")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAbre;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCierra;


}

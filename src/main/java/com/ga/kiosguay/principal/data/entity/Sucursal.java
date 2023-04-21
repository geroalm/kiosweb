package com.ga.kiosguay.principal.data.entity;

import com.ga.kiosguay.principal.data.entity.framework.Localidad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_sucursal_id")
    private Long id;
    private String nombre;
    private String descripcion;
    private String codigo;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_sucursal_localidad"))
    private Localidad localidad;

}

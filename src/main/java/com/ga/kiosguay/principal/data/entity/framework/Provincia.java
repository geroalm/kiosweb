package com.ga.kiosguay.principal.data.entity.framework;

import com.ga.kiosguay.principal.data.entity.framework.Localidad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provincia{
    @Id
    @PrimaryKeyJoinColumn(name = "pk_provincia_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String codigo;

    @OneToMany(mappedBy = "provincia",fetch = FetchType.LAZY)
    private List<Localidad> localidades;
}

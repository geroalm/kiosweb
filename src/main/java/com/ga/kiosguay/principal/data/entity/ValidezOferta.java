package com.ga.kiosguay.principal.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ValidezOferta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn(name = "pk_validezOferta_id")
    private Long id;
    private String descripcion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Set<DayOfWeek> diasValidos;
    private LocalTime horaInicio;
    private LocalTime horaFin;


    public boolean esValida(LocalDateTime fechaHora) {
        if (fechaHora.isBefore(fechaInicio) || fechaHora.isAfter(fechaFin)) {
            return false;
        }
        if (!diasValidos.contains(fechaHora.getDayOfWeek())) {
            return false;
        }
        if (fechaHora.toLocalTime().isBefore(horaInicio) || fechaHora.toLocalTime().isAfter(horaFin)) {
            return false;
        }
        return true;
    }
}

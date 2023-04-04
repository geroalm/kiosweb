package com.ga.kiosguay.principal.data.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductoDTO {

        public enum Estado{
            ACTIVO,INACTIVO
        }
        private Long id;
        private String nombre;
        private String codigo;
        private String serial;
        private Long marca;
        private Long categoria;
        private String descripcion;
        private double precio;
        private Estado estado = Estado.ACTIVO;




}

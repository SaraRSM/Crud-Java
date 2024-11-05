package com.utng.integradora.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Getter
@Setter
@ToString
public class ProductosDTO {
    private String nombre;
    private Double precio;
    private Integer existencia;
}


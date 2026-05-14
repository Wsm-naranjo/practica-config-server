package com.unibe.productos.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class CategoriaDTO {
    private Long id;
    private String name;
    private String descripcion;
    private String observation;
    private LocalDate createDate;
    private Integer valueCategoria;
    private String slug;
    private Integer priority;
    private String email;

}

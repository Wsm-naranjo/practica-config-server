package com.unibe.productos.dtos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="CATEGORIAS")
public interface CategoriaFeingApi {
    @GetMapping("/api/categorias")
    List<CategoriaDTO> obtenerCategorias();

    @GetMapping("/api/categorias/{id}")
    CategoriaDTO obtenerCategoriaPorId(@PathVariable ("id") Long  id);

}

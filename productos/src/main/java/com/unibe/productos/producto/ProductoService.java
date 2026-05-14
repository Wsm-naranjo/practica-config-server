package com.unibe.productos.producto;

import com.unibe.productos.dtos.CategoriaDTO;
import com.unibe.productos.dtos.CategoriaFeingApi;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepository;
    private final CategoriaFeingApi categoriaFeingApi;

    public List<Producto> findAll(){
        return productoRepository.findAll();
    }

    public Producto findById(Long id){
        return productoRepository.findById(id).orElseThrow(()-> new RuntimeException("Producto no encontrado " + id));
    }

    public Producto save(Producto producto){
        return productoRepository.save(producto);
    }

    //Obtener todas las categorias
    public List<CategoriaDTO> findAllCategorias(){
        return categoriaFeingApi.obtenerCategorias();
    }
    //Obtener una categoria
}

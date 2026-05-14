package com.unibe.productos.producto;

import com.unibe.productos.dtos.CategoriaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoService productoService;

    @GetMapping()
    public List<Producto> findAll(){return productoService.findAll();}

    @GetMapping("{id}")
    public Producto getProductoById(@PathVariable Long id){
        return productoService.findById(id);
    }

    @PostMapping()
    public Producto addProducto(@RequestBody Producto producto){
        return productoService.save(producto);
    }
    //Obtener las categorias
    @GetMapping("/categorias")
    public List<CategoriaDTO> findAllCategorias(){
        return productoService.findAllCategorias();
    }
}

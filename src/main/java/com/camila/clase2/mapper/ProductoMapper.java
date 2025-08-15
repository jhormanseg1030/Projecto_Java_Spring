package com.camila.clase2.mapper;

import java.util.List;

import com.camila.clase2.dto.ProductoDto;
import com.camila.clase2.models.Producto;

public interface ProductoMapper {
    Producto toProducto(ProductoDto productoDto);

    ProductoDto toProductoDto (Producto producto);

    List<ProductoDto> toProductoDtoList(List<Producto>productos);

    void updateProducto(Producto producto, ProductoDto productoDto); // Actualizar un producto existente

    List<ProductoDto> findByCategoria(String categoria);
}


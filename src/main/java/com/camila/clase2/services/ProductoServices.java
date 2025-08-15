package com.camila.clase2.services;

import java.util.List;

import com.camila.clase2.dto.ProductoDto;

public interface ProductoServices {
    public ProductoDto getProducto(Integer id_producto); // Consultar producto por ID

    public ProductoDto saveProducto(ProductoDto productoDto); // Guardar un nuevo producto

    public List<ProductoDto> getProductos(); // Obtener todos los productos

    public ProductoDto deleteProducto(Integer id); // Eliminar un producto por ID

    public ProductoDto updateProducto(Integer id_producto, ProductoDto productoDto);// Actualizar un producto existente

    public List<ProductoDto> getProductoByCategoria(String categoria); // Consultar producto por categoria :D

    
}

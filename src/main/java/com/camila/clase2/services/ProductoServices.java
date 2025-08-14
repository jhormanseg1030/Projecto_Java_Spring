package com.camila.clase2.services;

import com.camila.clase2.dto.ProductoDto;

public interface ProductoServices {
    public ProductoDto getProducto(Integer id_producto); // Consultar producto por ID

    public ProductoDto saveProducto(ProductoDto productoDto); // Guardar un nuevo producto

}

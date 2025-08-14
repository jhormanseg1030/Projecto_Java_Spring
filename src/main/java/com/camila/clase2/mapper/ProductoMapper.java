package com.camila.clase2.mapper;

import com.camila.clase2.dto.ProductoDto;
import com.camila.clase2.models.Producto;

public interface ProductoMapper {
    Producto toProducto(ProductoDto productoDto);

    ProductoDto toProductoDto (Producto producto);

}

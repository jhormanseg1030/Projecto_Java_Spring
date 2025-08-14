package com.camila.clase2.mapper;

import org.springframework.stereotype.Component;

import com.camila.clase2.dto.ProductoDto;
import com.camila.clase2.models.Producto;

@Component
public class ProductoMapperImple implements ProductoMapper {

    @Override
    public Producto toProducto(ProductoDto productoDto){
            if (productoDto == null){
            return null;
        }
        Producto producto = new Producto();
        producto.setId_producto(productoDto.getId());
        producto.setNombre(productoDto.getNom());
        producto.setCategoria(productoDto.getCate());
        producto.setPrecio(productoDto.getPre());
        return producto;
    }
    @Override
    public ProductoDto toProductoDto(Producto producto){
        if (producto == null){
            return null;
        }
        ProductoDto productoDto = new ProductoDto();
        productoDto.setId(producto.getId_producto());
        productoDto.setNom(producto.getNombre());
        productoDto.setCate(producto.getCategoria());
        productoDto.setPre(producto.getPrecio());
        return productoDto;
    }

}

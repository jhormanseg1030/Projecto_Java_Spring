package com.camila.clase2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camila.clase2.dto.ProductoDto;
import com.camila.clase2.mapper.ProductoMapper;
import com.camila.clase2.models.Producto;
import com.camila.clase2.repositoryes.ProductoRepositories;

@Service
public class ProductoServicesImple implements ProductoServices {
    @Autowired
    private ProductoRepositories producRepo;

    @Autowired
    private ProductoMapper producMapper;

    @Override
    public ProductoDto getProducto(Integer id_producto){
        Producto producto = producRepo.findById(id_producto).get();
        return producMapper.toProductoDto(producto);
    }
    @Override
    public ProductoDto saveProducto(ProductoDto productoDto) {
        Producto producto = producMapper.toProducto(productoDto);
        return producMapper.toProductoDto(producRepo.save(producto));
    }
}


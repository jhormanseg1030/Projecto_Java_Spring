package com.camila.clase2.repositoryes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camila.clase2.models.Producto;

public interface ProductoRepositories extends JpaRepository <Producto, Integer> {

   List <Producto> findByCategoria(String categoria);
   List <Producto> findByNombre(String nombre);

}


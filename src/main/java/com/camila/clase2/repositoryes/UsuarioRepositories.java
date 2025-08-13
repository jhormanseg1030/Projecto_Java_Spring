package com.camila.clase2.repositoryes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camila.clase2.models.Usuario;

public interface UsuarioRepositories extends JpaRepository <Usuario, Integer> {
    List <Usuario> findByNombre(String nombre);
}

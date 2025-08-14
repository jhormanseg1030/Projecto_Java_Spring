package com.camila.clase2.services;

import java.util.List;

import com.camila.clase2.dto.UsuarioDto;

public interface UsuarioServices {
    public UsuarioDto getUsuario(Integer id_usuario); // Consultar usuario por ID
    
    public UsuarioDto saveUsuario(UsuarioDto usuarioDto); // Guardar un nuevo usuario

    public List<UsuarioDto> getUsuarios(); // Obtener todos los usuarios

}

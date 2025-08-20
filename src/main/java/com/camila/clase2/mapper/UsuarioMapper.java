package com.camila.clase2.mapper;

import java.util.List;

import com.camila.clase2.dto.UsuarioDto;
import com.camila.clase2.models.Usuario;

public interface UsuarioMapper {

    Usuario toUsuario(UsuarioDto usuarioDto);//consultar usu

    UsuarioDto toUsuarioDto(Usuario usuario);//regitrar usu

    List<UsuarioDto> toUsuarioDtoList(List<Usuario> usuarios); // Convertir lista de Usuario a lista de UsuarioDto

    void updateUsuario(Usuario usuario,UsuarioDto usuarioDto); // Actualizar un usuario existente

    

}

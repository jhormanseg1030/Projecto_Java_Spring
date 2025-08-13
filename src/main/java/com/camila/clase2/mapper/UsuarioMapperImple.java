package com.camila.clase2.mapper;

import org.springframework.stereotype.Component;

import com.camila.clase2.dto.UsuarioDto;
import com.camila.clase2.models.Usuario;

@Component

public class UsuarioMapperImple implements UsuarioMapper {

    @Override
    public Usuario toUsuario(UsuarioDto usuarioDto) {
        if (usuarioDto == null) {
            return null;
        }
        Usuario usuario = new Usuario();
        usuario.setId_usuario(usuarioDto.getId_usuario());
        usuario.setNombre(usuarioDto.getNom());
        usuario.setApellido(usuarioDto.getApe());
        usuario.setEmail(usuarioDto.getMail());
        return usuario;
    }
    @Override
    public UsuarioDto toUsuarioDto(Usuario usuario) {
        if(usuario == null){
            return null;
        }
        
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId_usuario(usuario.getId_usuario());
        usuarioDto.setNom(usuario.getNombre());
        usuarioDto.setApe(usuario.getApellido());
        usuarioDto.setMail(usuario.getEmail());
        return usuarioDto;
    }
}

package com.camila.clase2.mapper;

import java.util.ArrayList;
import java.util.List;

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
        usuario.setId_usuario(usuarioDto.getId());
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
        usuarioDto.setId(usuario.getId_usuario());
        usuarioDto.setNom(usuario.getNombre());
        usuarioDto.setApe(usuario.getApellido());
        usuarioDto.setMail(usuario.getEmail());
        return usuarioDto;
    }
    @Override
    public List<UsuarioDto> toUsuarioDtoList(List<Usuario> usuarios){
        if(usuarios == null ){
            return null;
        }
        List<UsuarioDto> list = new ArrayList<UsuarioDto>(usuarios.size());
        for(Usuario usuario : usuarios) {
            list.add(toUsuarioDto(usuario));
        }
        return list;
    }
    @Override
    public void updateUsuario(Usuario usuario, UsuarioDto usuarioDto){
        if(usuarioDto == null){
            return;
        }
        usuario.setNombre(usuarioDto.getNom());
        usuario.setApellido(usuarioDto.getApe());
        usuario.setEmail(usuarioDto.getMail());
    }
}



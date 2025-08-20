package com.camila.clase2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camila.clase2.dto.UsuarioDto;
import com.camila.clase2.mapper.UsuarioMapper;
import com.camila.clase2.models.Usuario;
import com.camila.clase2.repositoryes.UsuarioRepositories;

@Service
public class UsuarioServicesImplement implements UsuarioServices {
    @Autowired
    private UsuarioRepositories userRepo;
    
    @Autowired
    private UsuarioMapper usuarioMapper;

    public UsuarioServicesImplement(UsuarioRepositories userRepo, UsuarioMapper usuarioMapper) {
        this.userRepo = userRepo;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    public UsuarioDto getUsuario(Integer id_usuario){
        Usuario usuario = userRepo.findById(id_usuario).get();
        return usuarioMapper.toUsuarioDto(usuario);
    }
    @Override
    public UsuarioDto saveUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = usuarioMapper.toUsuario(usuarioDto);
        return usuarioMapper.toUsuarioDto(userRepo.save(usuario));
    }
    @Override
    public List<UsuarioDto> getUsuarios() {
        List<Usuario> usuarios = userRepo.findAll();
        return usuarioMapper.toUsuarioDtoList(usuarios);
    }
    @Override
    public UsuarioDto deleteUsuario(Integer id_usuario){
        Usuario usuario = userRepo.findById(id_usuario).get();
        userRepo.deleteById(id_usuario);
        return usuarioMapper.toUsuarioDto(usuario);
    }
    @Override
    public UsuarioDto updateUser(Integer id_usuario, UsuarioDto usuarioDto) {
        Usuario usuario = userRepo.findById(id_usuario).get();
        usuarioMapper.updateUsuario(usuario, usuarioDto);
        return usuarioMapper.toUsuarioDto(userRepo.save(usuario));
    }
}
package com.camila.clase2.services;

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
    private UsuarioMapper usuarioMapper;

    @Override
    public UsuarioDto getUsuario(Integer id_usuario){
        Usuario usuario = userRepo.findById(id_usuario).get();
        return usuarioMapper.toUsuarioDto(usuario);
    }

}
package com.camila.clase2.mapper;

import com.camila.clase2.dto.UsuarioDto;
import com.camila.clase2.models.Usuario;

public interface UsuarioMapper {

    Usuario toUsuario(UsuarioDto usuarioDto);//consultar usu

    UsuarioDto toUsuarioDto(Usuario usuario);//regitrar usu

    


}

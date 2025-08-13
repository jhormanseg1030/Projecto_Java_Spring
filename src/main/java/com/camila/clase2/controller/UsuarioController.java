package com.camila.clase2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.camila.clase2.models.Usuario;
import com.camila.clase2.repositoryes.UsuarioRepositories;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepositories userRepo;

    @GetMapping("/")
    public String Usuario() {
        return new String("Conectando desde UsuarioController");
    }
    @GetMapping("/users")
    public String listaUsuarios() {
        return userRepo.findAll().toString();
    }
    @GetMapping("/ListaUsuarios")
    public List<Usuario> Usuarioslista() {
        return userRepo.findAll();
    }
    
    @PostMapping("/AgregarUsuario")
    public Usuario Creausuario(@RequestBody Usuario usuario) {
        return userRepo.save(usuario);
    }

    @DeleteMapping("/users/{id}")
    public String Eliminausuario(@PathVariable Integer id) {
        userRepo.deleteById(id);
        return "";
    }
    @PutMapping("usuario/{id}")
    public String userupdate(@PathVariable String id, @RequestBody Usuario usuario) {
        Usuario userupdate = userRepo.findById(Integer.parseInt(id)).orElse(null);
        if(userupdate == null) {
        
            return "Usuario no encontrado";

        }
        userupdate.setNombre(usuario.getNombre());
        userupdate.setApellido(usuario.getApellido());
        userupdate.setEmail(usuario.getEmail());
        userRepo.save(userupdate);
        return "Usuario Actualizado";
    }
    @GetMapping("/users/nombre/{nombre}")
    public List<Usuario> getUsuariosByNombre(@PathVariable String nombre){
        return userRepo.findByNombre(nombre);
    }
}
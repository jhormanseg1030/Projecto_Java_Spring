package com.camila.clase2.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camila.clase2.models.Documento;

public interface DocumentoRepositories extends JpaRepository <Documento, Integer> {

}

package com.camila.clase2.mapper;

import org.springframework.stereotype.Component;

import com.camila.clase2.dto.DocumentoDto;
import com.camila.clase2.models.Documento;

@Component
public class DocumentoMapperImplement implements DocumentoMapper {
    @Override
    public Documento toDocumento(DocumentoDto documentoDto) {
        if (documentoDto == null) {
        return null;
        }
        Documento documento = new Documento();
        documento.setId_Docum(documentoDto.getId_Docum());
        documento.setNumero(documentoDto.getNumero());
    return documento;
    }

    @Override
    public DocumentoDto toDocumentoDto(Documento documento) {
        if (documento == null) {
            return null;
        }
    DocumentoDto documentoDto = new DocumentoDto();
    documentoDto.setId_Docum(documento.getId_Docum());
    documentoDto.setNumero(documento.getNumero());
    return documentoDto;
    }
}

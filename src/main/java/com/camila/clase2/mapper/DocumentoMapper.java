package com.camila.clase2.mapper;

import com.camila.clase2.dto.DocumentoDto;
import com.camila.clase2.models.Documento;

public interface DocumentoMapper {

    Documento toDocumento(DocumentoDto documentoDto); // Convertir DocumentoDto a Documento
    DocumentoDto toDocumentoDto(Documento documento); // Convertir Documento a DocumentoDto
}

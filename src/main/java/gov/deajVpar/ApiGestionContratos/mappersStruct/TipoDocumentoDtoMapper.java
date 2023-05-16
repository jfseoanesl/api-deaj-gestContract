/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.TipoDocumentoDto;
import gov.deajVpar.ApiGestionContratos.entity.TipoDocumento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Jairo F
 */
@Mapper
public interface TipoDocumentoDtoMapper {
    
    TipoDocumentoDtoMapper INSTANCE = Mappers.getMapper(TipoDocumentoDtoMapper.class);
    
    TipoDocumentoDto toDto(TipoDocumento tp);
    TipoDocumento toObj (TipoDocumentoDto dto);
}

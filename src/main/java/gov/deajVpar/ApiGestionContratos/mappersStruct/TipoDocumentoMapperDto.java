/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.TipoDocumentoDto;
import gov.deajVpar.ApiGestionContratos.entity.TipoDocumento;
import gov.deajVpar.ApiGestionContratos.entity.TipoPersona;
import org.mapstruct.Mapper;

/**
 *
 * @author Jairo F
 */
@Mapper(componentModel = "spring")
public abstract class TipoDocumentoMapperDto {
    
    public TipoDocumento toObj (TipoDocumentoDto dto){
            TipoDocumento obj = new TipoDocumento();
            obj.setId(dto.getId());
            obj.setTipo(dto.getTipo());
            obj.setTipoPersona(dto.getTipoPersona());
            obj.setEliminado(dto.isEliminado());
            obj.setDescripcion(dto.getDescripcion());
            return obj;
    
    }
    
    public TipoDocumentoDto toDto (TipoDocumento obj){
            TipoDocumentoDto dto = new TipoDocumentoDto();
            dto.setId(obj.getId());
            dto.setTipo(obj.getTipo());
            dto.setEliminado(obj.isEliminado());
            dto.setTipoPersona(obj.getTipoPersona());
            dto.setDescripcion(obj.getDescripcion());
            return dto;
    
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.SistemaDto;
import gov.deajVpar.ApiGestionContratos.entity.Sistema;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Jairo F
 */

@Mapper(componentModel = "spring")
public interface SistemaDtoMapper {
    
    SistemaDtoMapper INSTANCE = Mappers.getMapper(SistemaDtoMapper.class ); 
    
    SistemaDto sistemaToDto (Sistema sistema);
    Sistema dtoToSistema (SistemaDto dto);
    
}

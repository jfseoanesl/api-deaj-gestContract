/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.DptoDto;
import gov.deajVpar.ApiGestionContratos.entity.Dpto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Jairo F
 */
@Mapper(componentModel = "spring")
public interface DptoDtoMapper {
    DptoDtoMapper INSTANCE = Mappers.getMapper(DptoDtoMapper.class ); 
    
    Dpto toDpto(DptoDto dto);
    DptoDto toDto (Dpto obj);
}

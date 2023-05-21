/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.SetupAlertaDto;
import gov.deajVpar.ApiGestionContratos.entity.SetupAlertaContrato;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Jairo F
 */
@Mapper(componentModel = "spring")
public interface SetupAlertaDtoMapper {
    
    SetupAlertaDtoMapper INSTANCE = Mappers.getMapper(SetupAlertaDtoMapper.class ); 
    
    SetupAlertaDto ToDto (SetupAlertaContrato obj);
    SetupAlertaContrato ToObj (SetupAlertaDto dto);
    
}

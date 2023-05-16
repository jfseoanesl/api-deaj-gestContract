/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.PermisoUserDto;
import gov.deajVpar.ApiGestionContratos.entity.PermisoUsuario;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Jairo F
 */
@Mapper(componentModel = "spring")
public interface PermisoUserDtoMapper {
    
    PermisoUserDtoMapper INSTANCE = Mappers.getMapper(PermisoUserDtoMapper.class);
    
    PermisoUserDto toDto(PermisoUsuario obj);
    PermisoUsuario toObj(PermisoUserDtoMapper dto);
    
}

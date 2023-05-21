/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.TipoContratoDto;
import gov.deajVpar.ApiGestionContratos.entity.TipoContrato;
import org.mapstruct.Mapper;

/**
 *
 * @author Jairo F
 */
@Mapper(componentModel = "spring")
public abstract class TipoContratoDtoMapper {
    private UserDtoMapperImp mapperUser ;

    public TipoContratoDtoMapper() {
        this.mapperUser = new UserDtoMapperImp();
    }
    
    
    public TipoContrato toObj(TipoContratoDto dto){
        
        TipoContrato obj = new TipoContrato();
        obj.setId(dto.getId());
        obj.setDescripcion(dto.getDescripcion());
        obj.setEliminado(dto.isEliminado());
        obj.setCrateByuser(this.mapperUser.toObj(dto.getCrateByuser()));
        //obj.setListContratos(dto.getListContratos());
        return obj;
    
    }
    
    public TipoContratoDto toDto(TipoContrato obj){
        
        TipoContratoDto dto = new TipoContratoDto();
        dto.setId(obj.getId());
        dto.setDescripcion(obj.getDescripcion());
        dto.setEliminado(obj.isEliminado());
        dto.setCrateByuser(this.mapperUser.toDTO(obj.getCrateByuser()));
        //dto.setListContratos(obj.getListContratos());
        return dto;
    }
    
}

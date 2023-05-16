/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.DireccionSeccionalDto;
import gov.deajVpar.ApiGestionContratos.dtos.DptoDto;
import gov.deajVpar.ApiGestionContratos.entity.DireccionSeccional;
import gov.deajVpar.ApiGestionContratos.entity.Dpto;
import org.mapstruct.Mapper;

/**
 *
 * @author Jairo F
 */
@Mapper
public abstract class DeajMapper {

    public DireccionSeccionalDto toDTO(DireccionSeccional deaj) {

        DireccionSeccionalDto dto = new DireccionSeccionalDto();
        dto.setDescripcionSeccional(deaj.getDescripcionSeccional());
        dto.setEliminado(deaj.isEliminado());
        dto.setId(deaj.getId());
        for (Dpto d : deaj.getListDptoCoordinados()) {
            dto.getListDptoCoordinados().add(DptoDtoMapper.INSTANCE.toDto(d));
        }
        UserDtoMapperImp dtoMapper = new UserDtoMapperImp();
        dto.setCreatedByUser(dtoMapper.toDTO(deaj.getCreatedByUser()));

        return dto;
    }

    public DireccionSeccional toOBJ(DireccionSeccionalDto dto) {

        DireccionSeccional deaj = new DireccionSeccional();
        deaj.setId(dto.getId());
        deaj.setDescripcionSeccional(dto.getDescripcionSeccional());
        deaj.setEliminado(dto.isEliminado());
        UserDtoMapperImp dtoMapper = new UserDtoMapperImp();
        deaj.setCreatedByUser(dtoMapper.toObj(dto.getCreatedByUser()));
        for (DptoDto d : dto.getListDptoCoordinados()) {
            deaj.getListDptoCoordinados().add(DptoDtoMapper.INSTANCE.toDpto(d));
        }
        
        return deaj;
    }

}

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
@Mapper(componentModel = "spring")
public abstract class DeajMapper {

    private UsuarioDtoMapperImp mapperUser;

    public DeajMapper() {
        this.mapperUser = new UsuarioDtoMapperImp();
    }

    public DireccionSeccionalDto toDTO(DireccionSeccional deaj) {
        if (deaj != null) {
            DireccionSeccionalDto dto = new DireccionSeccionalDto();
            dto.setDescripcionSeccional(deaj.getDescripcionSeccional());
            dto.setEliminado(deaj.isEliminado());
            dto.setId(deaj.getId());
            for (Dpto d : deaj.getListDptoCoordinados()) {
                dto.getListDptoCoordinados().add(DptoDtoMapper.INSTANCE.toDto(d));
            }
            dto.setSetupAlerta(SetupAlertaDtoMapper.INSTANCE.ToDto(deaj.getSetupAlertaContrato()));
            dto.setCreatedByUser(this.mapperUser.toDTO(deaj.getCreatedByUser()));

            return dto;
        } else {
            return null;
        }
    }

    public DireccionSeccional toOBJ(DireccionSeccionalDto dto) {

        DireccionSeccional deaj = new DireccionSeccional();
        deaj.setId(dto.getId());
        deaj.setDescripcionSeccional(dto.getDescripcionSeccional());
        deaj.setEliminado(dto.isEliminado());
        deaj.setCreatedByUser(this.mapperUser.toObj(dto.getCreatedByUser()));

        for (DptoDto d : dto.getListDptoCoordinados()) {
            deaj.getListDptoCoordinados().add(DptoDtoMapper.INSTANCE.toDpto(d));
        }
        
        deaj.setSetupAlertaContrato(SetupAlertaDtoMapper.INSTANCE.ToObj(dto.getSetupAlerta()));

        return deaj;
    }

}

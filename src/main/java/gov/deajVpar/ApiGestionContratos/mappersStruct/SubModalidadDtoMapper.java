/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.SubModalidadDto;
import gov.deajVpar.ApiGestionContratos.entity.SubModalidadContrato;
import java.util.ArrayList;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author Jairo F
 */
@Mapper(componentModel = "spring")
public abstract class SubModalidadDtoMapper {

    private UsuarioDtoMapper userMapper;

    public SubModalidadDtoMapper() {
        this.userMapper = new UsuarioDtoMapperImp();
    }

    public SubModalidadContrato toObj(SubModalidadDto dto) {
        SubModalidadContrato obj = new SubModalidadContrato();
        obj.setIdSubModalidad(dto.getId());
        obj.setDescripcionSubModalidad(dto.getDescripcionSubModalidad());
        obj.setCreateByUser(this.userMapper.toObj(dto.getCreateByUser()));
        obj.setEliminado(dto.isEliminado());
        obj.setNombreSubModalidad(dto.getNombreSubModalidad());
        //obj.setListContratosRegistrados(dto.getListContratosRegistrados());
        return obj;
    }

    public SubModalidadDto toDto(SubModalidadContrato obj) {
        SubModalidadDto dto = new SubModalidadDto();
        dto.setId(obj.getIdSubModalidad());
        dto.setDescripcionSubModalidad(obj.getDescripcionSubModalidad());
        dto.setCreateByUser(this.userMapper.toDTO(obj.getCreateByUser()));
        dto.setEliminado(obj.isEliminado());
        dto.setNombreSubModalidad(obj.getNombreSubModalidad());
        //obj.setListContratosRegistrados(obj.getListContratosRegistrados());
        return dto;
    }

    public List<SubModalidadDto> toDto(List<SubModalidadContrato> obj) {

        List<SubModalidadDto> listDto = new ArrayList();
        for (SubModalidadContrato s : obj) {
            if (!s.isEliminado()) {
                listDto.add(this.toDto(s));
            }

        }
        return listDto;
    }

    public List<SubModalidadContrato> toObj(List<SubModalidadDto> dto) {

        List<SubModalidadContrato> listObj = new ArrayList();
        for (SubModalidadDto s : dto) {

            listObj.add(this.toObj(s));

        }
        return listObj;
    }
}

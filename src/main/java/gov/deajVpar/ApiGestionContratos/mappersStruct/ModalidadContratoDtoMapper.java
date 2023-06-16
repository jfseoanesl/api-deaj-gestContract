/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.ModalidadDto;
import gov.deajVpar.ApiGestionContratos.entity.ModalidadContrato;
import java.util.ArrayList;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author Jairo F
 */
@Mapper
public class ModalidadContratoDtoMapper {
    private UsuarioDtoMapper userMapper;
    private SubModalidadDtoMapper subModalidadMapper;

    public ModalidadContratoDtoMapper() {
        this.userMapper = new UsuarioDtoMapperImp();
        this.subModalidadMapper = new SubModalidadDtoMapperImp();
    }
    
    
    public ModalidadContrato toObj(ModalidadDto dto){
        
        ModalidadContrato obj = new ModalidadContrato();
        obj.setCreateByUser(this.userMapper.toObj(dto.getCreateByUser()));
        obj.setDescripcionModalidad(dto.getDescripcionModalidad());
        obj.setEliminado(dto.isEliminado());
        obj.setIdModalidad(dto.getId());
        //obj.setListContratosRegistrados(dto.getListContratosRegistrados());
        obj.setListSubModalidades(this.subModalidadMapper.toObj(dto.getListSubModalidades()));
        obj.setNombreModalidad(dto.getNombreModalidad());
        return obj;
    }
    
    public ModalidadDto toDto(ModalidadContrato obj){
        ModalidadDto dto = new ModalidadDto();
        dto.setCreateByUser(this.userMapper.toDTO(obj.getCreateByUser()));
        dto.setDescripcionModalidad(obj.getDescripcionModalidad());
        dto.setEliminado(obj.isEliminado());
        dto.setId(obj.getIdModalidad());
        //dto.setListContratosRegistrados(obj.getListContratosRegistrados());
        dto.setListSubModalidades(this.subModalidadMapper.toDto(obj.getListSubModalidades()));
        dto.setNombreModalidad(obj.getNombreModalidad());
        return dto;
    }
    
     public List<ModalidadContrato> toObj(List<ModalidadDto> dto){
         
         List<ModalidadContrato> listObj = new ArrayList();
         for(ModalidadDto m: dto){
             
             listObj.add(this.toObj(m));
         
         }
         return listObj;
     }
     
      public List<ModalidadDto> toDto(List<ModalidadContrato> obj){
         List<ModalidadDto> listDto = new ArrayList();
         for(ModalidadContrato m: obj){
             
             listDto.add(this.toDto(m));
         
         }
         return listDto;
      }
}

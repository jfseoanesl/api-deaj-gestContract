/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.PermisoUserDto;
import gov.deajVpar.ApiGestionContratos.dtos.RolUsuarioDto;
import gov.deajVpar.ApiGestionContratos.entity.PermisoUsuario;
import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import gov.deajVpar.ApiGestionContratos.entity.TipoUsuario;
import java.util.ArrayList;
import java.util.List;
import org.mapstruct.Mapper;

/**
 *
 * @author Jairo F
 */

@Mapper(componentModel = "spring")
public abstract class RolUsuarioDtoMapper {
   
    private UsuarioDtoMapper userMapper;
    
    public RolUsuarioDtoMapper() {
        this.userMapper = new UsuarioDtoMapperImp();
    }
    
    public RolUsuarioDto toDto(RolUsuario obj){
        
        RolUsuarioDto dto = new RolUsuarioDto();
        dto.setId(obj.getId());
        dto.setCratedByUser(this.userMapper.toDTO(obj.getCratedByUser()));
        dto.setEliminado(obj.isEliminado());
        for(PermisoUsuario p: obj.getListPermisosUsuario() ){
            dto.getListPermisosUsuario().add(PermisoUserDtoMapper.INSTANCE.toDto(p));
        }
        
        dto.setNombreRol(obj.getNombreRol());
        dto.setTipoUsuario(obj.getTipoUsuario().toString());
        
        return dto;
    
    }
    
    public RolUsuario toObj(RolUsuarioDto dto){
        
        RolUsuario  obj = new RolUsuario();
        obj.setCratedByUser(this.userMapper.toObj(dto.getCratedByUser()));
        obj.setEliminado(dto.isEliminado());
        obj.setId(dto.getId());
        
        for(PermisoUserDto p: dto.getListPermisosUsuario()){
            obj.getListPermisosUsuario().add(PermisoUserDtoMapper.INSTANCE.toObj(p));
        }
        obj.setNombreRol(dto.getNombreRol());
        obj.setTipoUsuario(TipoUsuario.get(dto.getTipoUsuario()));
        return obj;
        
    }
    
    
    public List<RolUsuario> toObj(List<RolUsuarioDto> dto){
        
        List<RolUsuario> obj = new ArrayList();
        for(RolUsuarioDto d: dto){
              obj.add(this.toObj(d));
        }
        return obj;
    }
    
    public List<RolUsuarioDto> toDto(List<RolUsuario> obj){
        
        List<RolUsuarioDto> dto = new ArrayList();
        for(RolUsuario o: obj){
              dto.add(this.toDto(o));
        }
        return dto;
    }
    
    
}

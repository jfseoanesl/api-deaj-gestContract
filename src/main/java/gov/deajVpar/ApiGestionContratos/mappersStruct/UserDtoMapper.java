/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.UserDto;
import gov.deajVpar.ApiGestionContratos.entity.PersonaNatural;
import gov.deajVpar.ApiGestionContratos.entity.TipoUsuario;
import gov.deajVpar.ApiGestionContratos.entity.Usuario;
import gov.deajVpar.ApiGestionContratos.entity.UsuarioAdministrador;
import gov.deajVpar.ApiGestionContratos.entity.UsuarioDirector;
import gov.deajVpar.ApiGestionContratos.entity.UsuarioJuridica;
import gov.deajVpar.ApiGestionContratos.entity.UsuarioSupervisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo F
 */
public abstract class UserDtoMapper {
    
    private final UsuarioDtoMapper usuarioMapper;
    private final PersonaDtoMapper personaMapper;
    private final DeajMapper deajMapper;
    private final RolUsuarioDtoMapper rolMapper;
    

    public UserDtoMapper() {
        this.usuarioMapper = new UsuarioDtoMapperImp();
        this.personaMapper = new PersonaDtoMapperImp();
        this.deajMapper = new DeajMapperImp();
        this.rolMapper = new RolUsuarioDtoMapperImp();
    }
    
    
    
    public UserDto toDto(Usuario obj){
        if(obj==null)
            return null;
        
        UserDto dto = new UserDto();
       
        dto.setId(obj.getId());
        dto.setUserName(obj.getUserName());
        dto.setCreatedByUser(this.usuarioMapper.toDTO(obj.getCreatedByUser()));
        dto.setDatosPersona(this.personaMapper.toDto(obj.getDatosPersona()));
        dto.setDireccionSeccional(this.deajMapper.toDTO(obj.getDireccionSeccional()));
        dto.setEstado(obj.isEstado());
        dto.setRolUsuario(this.rolMapper.toDto(obj.getRolUsuario()));
        dto.setTipoUsuario(obj.getUserType());
        dto.setPassword(obj.getPassword());
        
        if(obj instanceof UsuarioAdministrador){
            
        }
        else if(obj instanceof UsuarioDirector){
        }
        else if(obj instanceof UsuarioJuridica){
        }
        else{ //usuario supervisor
            UsuarioSupervisor sup = (UsuarioSupervisor)obj;
            dto.setListContratosSupervisados(new ArrayList());
            dto.setListInformesSupervision(new ArrayList());
        }
        
        return dto;
        
        
    }
    
    public Usuario toObj(UserDto dto){
        if(dto==null)
            return null;
        
        Usuario obj=null;
        TipoUsuario tipo = TipoUsuario.get(dto.getTipoUsuario());
        if(tipo==TipoUsuario.ADMINISTRADOR){
            UsuarioAdministrador admin = new UsuarioAdministrador();
            obj = admin;
        }
        else if(tipo==TipoUsuario.DIRECTOR){
            UsuarioDirector director =new UsuarioDirector();
            director.setDireccionSeccional(this.deajMapper.toOBJ(dto.getDireccionSeccional()));
            obj=director;
        }
        else if(tipo==TipoUsuario.JURIDICA){
            UsuarioJuridica juridica = new UsuarioJuridica();
            obj = juridica;
        }
        else{ // supervisor
            UsuarioSupervisor supervisor = new UsuarioSupervisor();
            supervisor.setListContratosSupervisados(new ArrayList());
            supervisor.setListInformesSupervision(new ArrayList());
            obj=supervisor;
        }
        obj.setCreatedByUser(this.usuarioMapper.toObj(dto.getCreatedByUser()));
        obj.setDatosPersona((PersonaNatural) this.personaMapper.toObj(dto.getDatosPersona()));
        obj.setDireccionSeccional(this.deajMapper.toOBJ(dto.getDireccionSeccional()));
        obj.setEstado(dto.isEstado());
        obj.setId(dto.getId());
        obj.setPassword(dto.getPassword());
        obj.setRolUsuario(this.rolMapper.toObj(dto.getRolUsuario()));
        obj.setUserName(dto.getUserName());
        return obj;
    }
    
    public List<Usuario> toObj(List<UserDto> dtos){
    
        List<Usuario> listObj = new ArrayList();
        for(UserDto dto: dtos){
            listObj.add(this.toObj(dto));
        }
        return listObj;
    }
    
    public List<UserDto> toDto(List<Usuario> objs){
    
        List<UserDto> listDtos = new ArrayList();
        for(Usuario obj: objs){
            listDtos.add(this.toDto(obj));
        }
        return listDtos;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.RolUsuarioDto;
import gov.deajVpar.ApiGestionContratos.dtos.UserDto;
import gov.deajVpar.ApiGestionContratos.entity.PersonaNatural;
import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import gov.deajVpar.ApiGestionContratos.entity.TipoUsuario;
import gov.deajVpar.ApiGestionContratos.entity.Usuario;
import gov.deajVpar.ApiGestionContratos.entity.UsuarioSupervisor;
import gov.deajVpar.ApiGestionContratos.mappersStruct.RolUsuarioDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.RolUsuarioDtoMapperImp;
import gov.deajVpar.ApiGestionContratos.mappersStruct.UserDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.UserDtoMapperImp;
import gov.deajVpar.ApiGestionContratos.service.PersonaService;
import gov.deajVpar.ApiGestionContratos.service.UsuarioService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class UsuarioController {
    private final UsuarioService service;
    private final PersonaService personaService;
    private final UserDtoMapper mapper;

    public UsuarioController(UsuarioService service, PersonaService personaService) {
        this.service = service;
        this.personaService=personaService;
        this.mapper = new UserDtoMapperImp();
    }
    
    
    @PostMapping("/users/save")
    public UserDto save(@RequestBody UserDto dto){
        Usuario obj = this.mapper.toObj(dto);
        PersonaNatural aux = obj.getDatosPersona();
        obj.setDatosPersona(this.service.getPersonaNatural(aux));
        this.service.save(obj);
        return this.mapper.toDto(obj);
    }
    
    @PostMapping("/users/edit")
    public UserDto edit(@RequestBody UserDto dto){
        Usuario obj = this.mapper.toObj(dto);
        Usuario old = this.service.findById(obj.getId()).get();
        
        old.setDatosPersona(this.service.getPersonaNatural(obj.getDatosPersona()));
        old.setDireccionSeccional(obj.getDireccionSeccional());
        old.setRolUsuario(obj.getRolUsuario());
        old.setUserName(obj.getUserName());
        old.setPassword(dto.getPassword());
        
        if(obj instanceof UsuarioSupervisor){
            UsuarioSupervisor supervisor = (UsuarioSupervisor) obj;
            UsuarioSupervisor aux = (UsuarioSupervisor) old;
            aux.setListContratosSupervisados(supervisor.getListContratosSupervisados());
            aux.setListInformesSupervision(supervisor.getListInformesSupervision());
        }
        
        this.service.save(old);
        return this.mapper.toDto(old);
        
    }
    
    @GetMapping("/users/list")
    public List<UserDto> getAll(){
        
        List<Usuario> listObjs = this.service.getAll();
        List<UserDto> listDtos = this.mapper.toDto(listObjs);
        return listDtos;
        
    }
    @PostMapping("/users/list/rol")
    public List<UserDto> getAllByRolUsuario(@RequestBody RolUsuarioDto dto){
        
        RolUsuario rol = new RolUsuario();
        rol.setId(dto.getId());
        
        List<Usuario> listObjs = this.service.getAllByRolUsuario(rol);
        List<UserDto> listDtos = this.mapper.toDto(listObjs);
        return listDtos;
        
    }
    
        
    @PostMapping("/users/delete")
    public UserDto delete(@RequestBody Long id){
         
        Usuario obj = this.service.findById(id).get();
        obj.setEstado(true);
        this.service.save(obj);
        return this.mapper.toDto(obj);
        
    }
    @PostMapping("/users/find")
    public UserDto findByUsername(@RequestBody UserDto dto){
        Usuario user = this.service.findByUsername(dto.getUserName());
        return this.mapper.toDto(user);
    }
    
    
    
}

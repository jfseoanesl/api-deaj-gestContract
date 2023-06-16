/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.RolUsuarioDto;
import gov.deajVpar.ApiGestionContratos.entity.PermisoUsuario;
import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import gov.deajVpar.ApiGestionContratos.entity.TipoUsuario;
import gov.deajVpar.ApiGestionContratos.mappersStruct.RolUsuarioDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.RolUsuarioDtoMapperImp;
import gov.deajVpar.ApiGestionContratos.service.RolUsuarioService;
import java.util.ArrayList;
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
public class RolUsuarioController {
    private RolUsuarioService service;
    private RolUsuarioDtoMapper mapper;

    public RolUsuarioController(RolUsuarioService service) {
        this.service = service;
        this.mapper = new RolUsuarioDtoMapperImp();
    }
    
    @PostMapping("rolusuario/save")
    public RolUsuarioDto save(@RequestBody RolUsuarioDto dto){
        RolUsuario obj = this.mapper.toObj(dto);
        this.service.save(obj);
        return this.mapper.toDto(obj);
    }
    
    @PostMapping("rolusuario/edit")
    public RolUsuarioDto edit(@RequestBody RolUsuarioDto dto){
        RolUsuario obj = this.mapper.toObj(dto);
        RolUsuario old = this.service.findById(obj.getId()).get();
        
        List<PermisoUsuario> delete = this.service.getDeleteListPermisoUsuario(old.getListPermisosUsuario(), obj.getListPermisosUsuario());
      
        old.setListPermisosUsuario(obj.getListPermisosUsuario());
        old.setNombreRol(obj.getNombreRol());
        old.setTipoUsuario(obj.getTipoUsuario());
        
        this.service.save(old);
        this.service.deleteAllPermisos(delete);
        
        return this.mapper.toDto(old);
        
    }
    
    @GetMapping("rolusuario/list")
    public List<RolUsuarioDto> getAll(){
        
        List<RolUsuarioDto>listDto = this.mapper.toDto(this.service.getAll());
        return listDto;
    
    }
    
    @PostMapping("rolusuario/listTipo")
    public List<RolUsuarioDto> getAllByTipoUsuario(@RequestBody TipoUsuario tipo){
        List<RolUsuarioDto>listDto = this.mapper.toDto(this.service.getAllByTipo(tipo));
        return listDto;
    }
    
    public RolUsuarioDto findById(@RequestBody Long id){
        
        RolUsuarioDto dto = this.mapper.toDto(this.service.findById(id).get());
        return dto;
    
    }
   
    @PostMapping("rolusuario/delete")
public RolUsuarioDto delete(@RequestBody RolUsuarioDto dto){
         RolUsuario obj = this.service.findById(dto.getId()).get();
         obj.setEliminado(true);
         List<PermisoUsuario> listDelete = new ArrayList(obj.getListPermisosUsuario());
         obj.getListPermisosUsuario().clear();
         this.service.save(obj);
         this.service.deleteAllPermisos(listDelete);
         return this.mapper.toDto(obj);
    }
    
}

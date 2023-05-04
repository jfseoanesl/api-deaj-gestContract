/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.Modulo;
import gov.deajVpar.ApiGestionContratos.entity.PermisoUsuario;
import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import gov.deajVpar.ApiGestionContratos.entity.TipoUsuario;
import gov.deajVpar.ApiGestionContratos.repository.RolUsuarioRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class RolUsuarioService {
    
    private RolUsuarioRepository repository;

    
    public RolUsuarioService(RolUsuarioRepository repository) {
        this.repository = repository;
    }

    public RolUsuario save(RolUsuario ru){
    
            return this.repository.save(ru);
            
    }
    
    public void saveAll(List<RolUsuario> list){
        
        this.repository.saveAll(list);
    
    }
    
    
    public List<RolUsuario> getAll(){
    
        return this.repository.findAll();
        
    }
    
    public Optional<RolUsuario> findById(Long id){
        
        return this.repository.findById(id);
        
    }
    
    public Optional<RolUsuario> findByNombreRol(String nombre){
        
        return this.repository.findByNombreRol(nombre);
        
    }
    
    
    public void initialize(){
        
        List<PermisoUsuario> listPermisos = new ArrayList();
        listPermisos.add(new PermisoUsuario(Modulo.ALL, true, true, true, true));
        
        RolUsuario rolAdmon = new RolUsuario("Administrador", TipoUsuario.ADMINISTRADOR, listPermisos);
        this.repository.save(rolAdmon);
    }
    
}

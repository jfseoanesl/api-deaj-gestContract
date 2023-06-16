/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.Modulo;
import gov.deajVpar.ApiGestionContratos.entity.PermisoUsuario;
import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import gov.deajVpar.ApiGestionContratos.entity.TipoUsuario;
import gov.deajVpar.ApiGestionContratos.repository.PermisoUsuarioRepository;
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
    private PermisoUsuarioRepository permisoRepository;

    
    public RolUsuarioService(RolUsuarioRepository repository, PermisoUsuarioRepository puRepository) {
        this.repository = repository;
        this.permisoRepository=puRepository;
    }

    public RolUsuario save(RolUsuario ru){
    
            return this.repository.save(ru);
            
    }
    
    public void saveAll(List<RolUsuario> list){
        
        this.repository.saveAll(list);
    
    }
    
    
    public List<RolUsuario> getAll(){
    
        return this.repository.findByEliminado(false);
        
    }
    
    public List<RolUsuario> getAllByTipo(TipoUsuario tipo){
    
        return this.repository.findByTipoUsuarioAndEliminado(tipo, false);
        
    }
    
    public Optional<RolUsuario> findById(Long id){
        
        return this.repository.findById(id);
        
    }
    
    public Optional<RolUsuario> findByNombreRol(String nombre){
        
        return this.repository.findByNombreRol(nombre);
        
    }
    
    public void deleteAllPermisos(List<PermisoUsuario> list){
        list.forEach(p -> {
            this.permisoRepository.deleteById(p.getId());
        });
        
    }
    
    
    public void initialize(){
        
        List<PermisoUsuario> listPermisos = new ArrayList();
        listPermisos.add(new PermisoUsuario(Modulo.CONFIGURACION, true, true, true, true));
        listPermisos.add(new PermisoUsuario(Modulo.USUARIOS, true, true, true, true));
        listPermisos.add(new PermisoUsuario(Modulo.CONTRATOS, true, true, true, true));
        listPermisos.add(new PermisoUsuario(Modulo.SUPERVISION, true, true, true, true));
        listPermisos.add(new PermisoUsuario(Modulo.SUPERVISOR, true, true, true, true));
        listPermisos.add(new PermisoUsuario(Modulo.DASHBOARD, true, true, true, true));
        
        RolUsuario rolAdmon = new RolUsuario("Administrador", TipoUsuario.ADMINISTRADOR, listPermisos);
        this.repository.save(rolAdmon);
    }
    
    
    public List<PermisoUsuario> getDeleteListPermisoUsuario(List<PermisoUsuario> old, List<PermisoUsuario> list){
        
        List<PermisoUsuario> listForDelete = new ArrayList();
        for(PermisoUsuario p: old){
            boolean enc = false;
            for(PermisoUsuario d: list){
                if(p.getId().equals(d.getId())){
                  enc=true;
                }
            }
            if(!enc){
                listForDelete.add(p);
            }
        }
        return listForDelete;
    
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.PersonaNatural;
import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import gov.deajVpar.ApiGestionContratos.entity.Usuario;
import gov.deajVpar.ApiGestionContratos.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private PersonaService personaService;

    public UsuarioService() {
        
    }
    
    public Usuario save(Usuario usuario){
        
        return this.repository.save(usuario);
        
    }
    
    public List<Usuario> getAll(){
        
        return this.repository.findByEstado(false);
        
    }
    
    public Optional<Usuario> findById(Long id){
        
        return this.repository.findById(id);
        
    }
    
    public List<Usuario> getAllByRolUsuario(RolUsuario rol){
        
        return this.repository.findByRolUsuarioAndEstado(rol, false);
        
    }
    
    public Usuario findByUsername(String username){
        
        Usuario obj = this.repository.findByUserNameAndEstado(username, false).orElse(null);
        return obj;
        
    }
    
    public PersonaNatural getPersonaNatural(PersonaNatural aux){
        
        if(aux.getIdPersona()!=null){
            PersonaNatural persona = (PersonaNatural)this.personaService.findById(aux.getIdPersona()).orElse(null);
            persona.setFechaNacimiento(aux.getFechaNacimiento());
            persona.setGenero(aux.getGenero());
            persona.setNoDocumento(aux.getNoDocumento());
            persona.setTipoDocumento(aux.getTipoDocumento());
            persona.setpApellido(aux.getpApellido());
            persona.setpNombre(aux.getpNombre());
            persona.setsApellido(aux.getsApellido());
            persona.setsNombre(aux.getsNombre());
            return persona;
        }
        return aux;
    }
    
    
}

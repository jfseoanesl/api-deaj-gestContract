/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

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

    public UsuarioService() {
    }
    
    public Usuario save(Usuario usuario){
        
        return this.repository.save(usuario);
        
    }
    
    public List<Usuario> getAll(){
        
        return this.repository.findAll();
        
    }
    
    public Optional<Usuario> findById(Long id){
        
        return this.repository.findById(id);
        
    }
    
    
}

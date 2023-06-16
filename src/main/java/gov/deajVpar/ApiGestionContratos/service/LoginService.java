/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.Usuario;
import gov.deajVpar.ApiGestionContratos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service 
public class LoginService {
 
    @Autowired
    private UsuarioRepository repository;
    
    public Usuario login(String userName, String password){
            
           return this.repository.findByUserNameAndPasswordAndEstado(userName, password, false).orElse(null);
           
    }
    
    public Usuario login(String userName){
            
           return this.repository.findByUserNameAndEstado(userName, false).orElse(null);
           
    }
}

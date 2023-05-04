/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.UsuarioAdministrador;
import gov.deajVpar.ApiGestionContratos.repository.UsuarioAdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class UsuarioAdministradorService {
    
    @Autowired
    private UsuarioAdministradorRepository repository;

    public UsuarioAdministradorService() {
    }
    
    public UsuarioAdministrador save(UsuarioAdministrador user){
            
            return this.repository.save(user);
            
    }
    
    
    
}

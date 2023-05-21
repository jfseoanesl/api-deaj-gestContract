/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.SetupAlertaContrato;
import gov.deajVpar.ApiGestionContratos.repository.SetupAlertaContratoRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class SetupAlertaContratoService {
    private SetupAlertaContratoRepository repository;

    public SetupAlertaContratoService(SetupAlertaContratoRepository repository) {
        this.repository = repository;
    }
    
    public SetupAlertaContrato save(SetupAlertaContrato obj){
        return this.repository.save(obj);
    }
    
    public Optional<SetupAlertaContrato> findByid(Long id){
        
        return this.repository.findById(id);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.DireccionSeccional;
import gov.deajVpar.ApiGestionContratos.repository.DireccionSeccionalRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class DireccionSeccionalService {
    private DireccionSeccionalRepository repository;

    public DireccionSeccionalService(DireccionSeccionalRepository repository) {
        this.repository = repository;
    }

    
    public DireccionSeccional save(DireccionSeccional deaj){
        
        return this.repository.save(deaj);
        
    }
    
    public List<DireccionSeccional> getAll(){
        return this.repository.findByEliminado(false);
    }
    
    public Optional<DireccionSeccional> findById(Long id){
        return this.repository.findById(id);
    }
    
    
    
}

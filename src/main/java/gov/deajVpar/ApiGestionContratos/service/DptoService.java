/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.Dpto;
import gov.deajVpar.ApiGestionContratos.repository.DptoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class DptoService {
    
   private DptoRepository repository;

    public DptoService(DptoRepository repository) {
        this.repository = repository;
    }

  
    
    public Dpto save(Dpto dpto){
    
            return this.repository.save(dpto);
            
    }
    
    public void saveAll(List<Dpto> dptos){
    
            this.repository.saveAll(dptos);
            
    }
    
    public List<Dpto> getAll(){
    
            return this.repository.findAll();
            
    }
    
    public Optional<Dpto> findById(Long id){
    
        return this.repository.findById(id);
        
    }
    
}

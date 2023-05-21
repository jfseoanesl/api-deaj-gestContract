/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.SubModalidadContrato;
import gov.deajVpar.ApiGestionContratos.repository.SubmodalidadContratoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class SubModalidadContratoService {
    
    private SubmodalidadContratoRepository repository;

    public SubModalidadContratoService(SubmodalidadContratoRepository repository) {
        this.repository = repository;
    }
    
    
    public SubModalidadContrato save(SubModalidadContrato obj){
    
        return this.repository.save(obj);
    }
    
    public List<SubModalidadContrato> getAll(){
        
        return this.repository.findByEliminado(false);
    
    }
    
    public Optional<SubModalidadContrato> findById(Long id){
        
        return this.repository.findById(id);
        
    }
    
}

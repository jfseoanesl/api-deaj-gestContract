/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.Contrato;
import gov.deajVpar.ApiGestionContratos.repository.ContratoRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class ContratoService {
    private ContratoRepository repository;

    public ContratoService(ContratoRepository repository) {
        this.repository = repository;
    }
    
    public Contrato save(Contrato c){
        
        this.repository.save(c);
        return c;
        
    }
}

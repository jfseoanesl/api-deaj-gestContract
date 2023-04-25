/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.entity.Sistema;
import gov.deajVpar.ApiGestionContratos.service.SistemaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class SistemaController {
    
    private SistemaService service;

    public SistemaController(SistemaService service) {
        this.service = service;
    }
    
    @GetMapping("/")
    public Sistema home(){
        
        return this.service.get();
        
    }
    
    @PostMapping("/save")
    public Sistema save(Sistema sistema){
        this.service.save(sistema);
        return sistema;
    }
    
}

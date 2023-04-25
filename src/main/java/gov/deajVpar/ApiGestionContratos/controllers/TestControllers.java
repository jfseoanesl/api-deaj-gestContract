/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.entity.Contrato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class TestControllers {
    
    @GetMapping("Test/Contrato/")
    public Contrato getContratoTest(){
        return new Contrato();
    }
    
}

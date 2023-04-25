/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.entity.Contrato;
import gov.deajVpar.ApiGestionContratos.entity.DireccionSeccional;
import gov.deajVpar.ApiGestionContratos.entity.LugarEjecucion;
import gov.deajVpar.ApiGestionContratos.entity.Persona;
import gov.deajVpar.ApiGestionContratos.service.ContratoService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class TestControllers {
    private ContratoService service;
    private Contrato contrato;
    
    public TestControllers(ContratoService service) {
        this.contrato = new Contrato();
        this.service=service;
    }
    
        
//    @GetMapping("Test/Contrato/contratista")
//    public Persona getContratoContratista(){
//        return this.contrato.getContratistaAdjudicado();
//    }
    
    @GetMapping("Test/Contrato/ejecucion")
    public List<LugarEjecucion> getContratoEjecucion(){
        
        return this.contrato.getLugarEjecucion();
    }
    
    @GetMapping("Test/Contrato/len")
    public int getLengthEnlace(){
        return this.contrato.getEnlaceSecop().length();
    }
    
//    @GetMapping("Test/Contrato/direccion")
//    public DireccionSeccional getContratoDireccion(){
//        return this.contrato.getDireccion();
//    }
    
    @PostMapping("Test/Contrato/save")
    public void guardar(){
        this.service.save(contrato);
    }
    
}

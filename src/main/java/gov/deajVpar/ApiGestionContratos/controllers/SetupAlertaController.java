/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.SetupAlertaDto;
import gov.deajVpar.ApiGestionContratos.entity.SetupAlertaContrato;
import gov.deajVpar.ApiGestionContratos.mappersStruct.SetupAlertaDtoMapper;
import gov.deajVpar.ApiGestionContratos.service.SetupAlertaContratoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class SetupAlertaController {
    
    private SetupAlertaContratoService service;

    public SetupAlertaController(SetupAlertaContratoService service) {
        this.service = service;
    }
    
    @PostMapping("/alerta/save")
    public SetupAlertaDto save(@RequestBody SetupAlertaDto dto){
        SetupAlertaContrato obj = SetupAlertaDtoMapper.INSTANCE.ToObj(dto);
        this.service.save(obj);
        return SetupAlertaDtoMapper.INSTANCE.ToDto(obj);
        
    }
}

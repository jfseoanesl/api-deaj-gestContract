/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.DptoDto;
import gov.deajVpar.ApiGestionContratos.entity.Dpto;
import gov.deajVpar.ApiGestionContratos.mappersStruct.DptoDtoMapper;
import gov.deajVpar.ApiGestionContratos.service.DptoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class DptoController {
    
    private DptoService service;

    public DptoController(DptoService service) {
        this.service = service;
    }
    
    @GetMapping("/Dpto/list")
    public List<DptoDto> getAll(){
        
        List<Dpto> dptoList = this.service.getAll();
        List<DptoDto> dtoList=new ArrayList();
        for(Dpto d: dptoList){
            DptoDto dto = DptoDtoMapper.INSTANCE.toDto(d);
            dtoList.add(dto);
        }
        
        return dtoList;
    }
    
    
}

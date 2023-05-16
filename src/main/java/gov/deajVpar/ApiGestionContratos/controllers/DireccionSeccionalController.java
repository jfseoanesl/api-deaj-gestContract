/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.DireccionSeccionalDto;
import gov.deajVpar.ApiGestionContratos.entity.DireccionSeccional;
import gov.deajVpar.ApiGestionContratos.mappersStruct.DeajMapperImp;
import gov.deajVpar.ApiGestionContratos.service.DireccionSeccionalService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class DireccionSeccionalController {
    
    private DireccionSeccionalService service;

    public DireccionSeccionalController(DireccionSeccionalService service) {
        this.service = service;
    }
    
    @PostMapping("/Deaj/save")   
    public DireccionSeccionalDto save(@RequestBody DireccionSeccionalDto dto){
        DeajMapperImp dtoMapper = new DeajMapperImp();
        DireccionSeccional deaj = dtoMapper.toOBJ(dto);
        this.service.save(deaj);
        dto = dtoMapper.toDTO(deaj);
        return dto;
        
    }
    @PostMapping("/Deaj/edit")   
    public DireccionSeccionalDto edit(@RequestBody DireccionSeccionalDto dto){
        return this.save(dto);
        
    }
    
    @GetMapping("/Deaj/list")
    public List<DireccionSeccionalDto> getAll(){
    
        List<DireccionSeccional> deajs = this.service.getAll();
        List<DireccionSeccionalDto> deajsDto = new ArrayList();
        DeajMapperImp dtoMapper = new DeajMapperImp();
        for(DireccionSeccional deaj: deajs){
            DireccionSeccionalDto dto = dtoMapper.toDTO(deaj);
            deajsDto.add(dto);
        }
        return deajsDto;
    }
    
    @PostMapping("/Deaj/delete")   
    public DireccionSeccionalDto delete(@RequestBody Long id){
        DeajMapperImp dtoMapper = new DeajMapperImp();
        DireccionSeccional deaj = this.service.findById(id).get();
        deaj.setEliminado(true);
        this.service.save(deaj);
        DireccionSeccionalDto dto = dtoMapper.toDTO(deaj);
        return dto;
        
    }
    
}

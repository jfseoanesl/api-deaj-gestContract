/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.TipoContratoDto;
import gov.deajVpar.ApiGestionContratos.entity.TipoContrato;
import gov.deajVpar.ApiGestionContratos.mappersStruct.TipoContratoDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.TipoContratoDtoMapperImp;
import gov.deajVpar.ApiGestionContratos.service.TipoContratoService;
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
public class TipoContratoController {
    
    private TipoContratoService service;

    public TipoContratoController(TipoContratoService service) {
        this.service = service;
    }
    
    
    @PostMapping("/tipoContrato/save")
    public TipoContratoDto save (@RequestBody TipoContratoDto dto){
        
        TipoContratoDtoMapperImp mapper = new TipoContratoDtoMapperImp();
        TipoContrato obj = mapper.toObj(dto);
        this.service.save(obj);
        dto.setId(obj.getId());
        return dto;
    
    }
    
    @PostMapping("/tipoContrato/edit")
    public TipoContratoDto edit(@RequestBody TipoContratoDto dto){
        return this.save(dto);
    }
    
    @GetMapping("/tipoContrato/list")
    public List<TipoContratoDto> getAll (){
        
        TipoContratoDtoMapperImp mapper = new TipoContratoDtoMapperImp();
        List<TipoContrato> listObj = this.service.getAll();
        List<TipoContratoDto> listDto = new ArrayList();
        for(TipoContrato obj: listObj){
            TipoContratoDto dto = mapper.toDto(obj);
            listDto.add(dto);
        }
        
        return listDto;
    
    }
    
    @PostMapping("/tipoContrato/delete")
    public TipoContratoDto delete(@RequestBody Long id){
        
        TipoContrato obj = this.service.findById(id).get();
        obj.setEliminado(true);
        this.service.save(obj);
        TipoContratoDtoMapperImp mapper = new TipoContratoDtoMapperImp();
        TipoContratoDto tipoDto = mapper.toDto(obj);
        return tipoDto;
    
    }
    
}

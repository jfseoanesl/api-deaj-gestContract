/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.SubModalidadDto;
import gov.deajVpar.ApiGestionContratos.entity.SubModalidadContrato;
import gov.deajVpar.ApiGestionContratos.mappersStruct.SubModalidadDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.SubModalidadDtoMapperImp;
import gov.deajVpar.ApiGestionContratos.service.SubModalidadContratoService;
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
public class SubmodalidadContratoController {
    
    private SubModalidadContratoService service;
    private SubModalidadDtoMapper mapper;

    public SubmodalidadContratoController(SubModalidadContratoService service) {
        this.service = service;
        this.mapper = new SubModalidadDtoMapperImp();
    }
    
    
    @PostMapping("/submodalidad/save")
    public SubModalidadDto save(@RequestBody SubModalidadDto dto){
        
        SubModalidadContrato obj = this.mapper.toObj(dto);
        this.service.save(obj);
        return this.mapper.toDto(obj);
        
        
    }
    
    @GetMapping("/submodalidad/list")
    public List<SubModalidadDto> getAll(){
    
            List<SubModalidadContrato> listObj = this.service.getAll();
            return this.mapper.toDto(listObj);
            
    }
    
    @PostMapping("/submodalidad/edit")
    public SubModalidadDto edit(@RequestBody SubModalidadDto dto){
        
        return this.save(dto);
        
    }
    
    @PostMapping("/submodalidad/delete")
    public SubModalidadDto delete(@RequestBody Long id){
        
        SubModalidadContrato obj = this.service.findById(id).get();
        obj.setEliminado(true);
        this.service.save(obj);
        return this.mapper.toDto(obj);
    
    }
    
}

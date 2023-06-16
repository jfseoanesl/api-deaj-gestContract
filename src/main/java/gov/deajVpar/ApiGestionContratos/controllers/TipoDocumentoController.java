/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.TipoDocumentoDto;
import gov.deajVpar.ApiGestionContratos.entity.TipoDocumento;
import gov.deajVpar.ApiGestionContratos.mappersStruct.TipoDocumentoMapperDto;
import gov.deajVpar.ApiGestionContratos.mappersStruct.TipoDocumentoMapperDtoImp;
import gov.deajVpar.ApiGestionContratos.service.TipoDocumentoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class TipoDocumentoController {

    private TipoDocumentoService service;
    private TipoDocumentoMapperDto mapper;
    
    public TipoDocumentoController(TipoDocumentoService service) {
        this.service = service;
        this.mapper = new TipoDocumentoMapperDtoImp();
    }
    
    @GetMapping("/tipoDocumento/list")
    public List<TipoDocumentoDto> getAll(){
        
        List<TipoDocumento> listObj = this.service.getAll();
        List<TipoDocumentoDto> listDto = new ArrayList();
        for(TipoDocumento td: listObj){
            listDto.add(this.mapper.toDto(td));
        }
        return listDto;
    }
}

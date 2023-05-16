/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.UsuarioDto;
import gov.deajVpar.ApiGestionContratos.dtos.DptoDto;
import gov.deajVpar.ApiGestionContratos.dtos.InitializeDto;
import gov.deajVpar.ApiGestionContratos.dtos.SistemaDto;
import gov.deajVpar.ApiGestionContratos.entity.Dpto;
import gov.deajVpar.ApiGestionContratos.entity.Sistema;
import gov.deajVpar.ApiGestionContratos.mappersStruct.DptoDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.SistemaDtoMapper;
import gov.deajVpar.ApiGestionContratos.service.SistemaService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public SistemaDto home() {

        Sistema sistema = this.service.get();
        SistemaDto dto = SistemaDtoMapper.INSTANCE.sistemaToDto(sistema);
        return dto;

    }

    @PostMapping("/initialize")
    public Sistema initialize(@RequestBody InitializeDto dto) throws Exception {
        List<Dpto>dptoList=null;
        Map<String, DptoDto> listDptoDto=null;
        Sistema sistema = SistemaDtoMapper.INSTANCE.dtoToSistema(dto.getSistema());
        UsuarioDto userDto = null;
        if (!sistema.isInicializado()) {
            listDptoDto=dto.getDptos();
            userDto = dto.getUserData();
            dptoList = this.mapDtoToListDpto(listDptoDto);
            this.service.inicializarSistema(sistema, dptoList, userDto);
        } 
        return sistema;
    }
    
    public List<Dpto> mapDtoToListDpto(Map<String, DptoDto> map){
        List<Dpto> list = new ArrayList();
       
       for(Entry<String, DptoDto> e: map.entrySet()){
            Dpto dpto = DptoDtoMapper.INSTANCE.toDpto(e.getValue());
            list.add(dpto);
        }
        return list;
    }
    
    

    
    
   

}

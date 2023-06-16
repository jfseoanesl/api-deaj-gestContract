/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.PersonaDto;
import gov.deajVpar.ApiGestionContratos.dtos.TipoDocumentoDto;
import gov.deajVpar.ApiGestionContratos.entity.GeneroPersona;
import gov.deajVpar.ApiGestionContratos.entity.Persona;
import gov.deajVpar.ApiGestionContratos.entity.PersonaNatural;
import gov.deajVpar.ApiGestionContratos.entity.TipoDocumento;
import gov.deajVpar.ApiGestionContratos.entity.TipoPersona;
import gov.deajVpar.ApiGestionContratos.mappersStruct.PersonaDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.PersonaDtoMapperImp;
import gov.deajVpar.ApiGestionContratos.mappersStruct.TipoDocumentoMapperDto;
import gov.deajVpar.ApiGestionContratos.mappersStruct.TipoDocumentoMapperDtoImp;
import gov.deajVpar.ApiGestionContratos.service.PersonaService;
import java.time.LocalDate;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class PersonaController {

    private PersonaService service;
    private PersonaDtoMapper mapper;
    private TipoDocumentoMapperDto mapperTipoDocumento;

    public PersonaController(PersonaService service) {
        this.service = service;
        this.mapper = new PersonaDtoMapperImp();
        this.mapperTipoDocumento = new TipoDocumentoMapperDtoImp();
    }

    @PostMapping("/persona/save")
    public PersonaDto save(@RequestBody PersonaDto dto) {

        Persona persona = this.mapper.toObj(dto);
        this.service.save(persona);
        return this.mapper.toDto(persona);
    }

    @PostMapping("/persona/edit")
    public PersonaDto edit(@RequestBody PersonaDto dto) {

        return this.save(dto);
    }

    @PostMapping("/persona/buscar")
    public PersonaDto findByNoDocumento(@RequestBody PersonaDto dto) {
        String documento = dto.getNoDocumento();
        TipoDocumento tipo = this.mapperTipoDocumento.toObj(dto.getTipoDocumento());
        Persona persona = this.service.findByDocument(documento, tipo).orElse(null);
        if(persona!=null)
            return this.mapper.toDto(persona);
        else return null;
    }

    @PostMapping("/persona/delete")
    public PersonaDto delete(@RequestBody Long id) {
        Persona persona = this.service.findById(id).get();
        persona.setEliminado(true);
        this.service.save(persona);
        return this.mapper.toDto(persona);
    }

}

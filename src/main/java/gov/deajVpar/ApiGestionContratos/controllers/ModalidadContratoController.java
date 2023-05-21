/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.ModalidadDto;
import gov.deajVpar.ApiGestionContratos.entity.ModalidadContrato;
import gov.deajVpar.ApiGestionContratos.mappersStruct.ModalidadContratoDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.ModalidadContratoDtoMapperImp;
import gov.deajVpar.ApiGestionContratos.service.ModalidadContratoService;
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
public class ModalidadContratoController {

    private ModalidadContratoService service;
    private ModalidadContratoDtoMapper mapper;

    public ModalidadContratoController(ModalidadContratoService service) {
        this.service = service;
        mapper = new ModalidadContratoDtoMapperImp();
    }

    @PostMapping("/modalidad/save")
    public ModalidadDto save(@RequestBody ModalidadDto dto) {

        ModalidadContrato obj = this.mapper.toObj(dto);
        this.service.save(obj);
        return mapper.toDto(obj);

    }

    @GetMapping("/modalidad/list")
    public List<ModalidadDto> getAll() {

        List<ModalidadContrato> listObj = this.service.getAll();
        List<ModalidadDto> listDto = this.mapper.toDto(listObj);
        return listDto;
    }

    @PostMapping("/modalidad/edit")
    public ModalidadDto edit(@RequestBody ModalidadDto dto) {

        return this.save(dto);
//        return dto;

    }

    @PostMapping("/modalidad/delete")
    public ModalidadDto deleteWithSubmodalidad(@RequestBody Long id) {

        ModalidadContrato obj = this.service.deleteWithSubmodalidad(id);
        return this.mapper.toDto(obj);

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.Sistema;
import gov.deajVpar.ApiGestionContratos.repository.SistemaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jairo F
 */
@Service
public class SistemaService {

    private SistemaRepository repository;

    public SistemaService(SistemaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("sistema/save")
    public Sistema save(Sistema sistema) {
//        sistema = new Sistema();
//        sistema.setId(1L);
//        sistema.setInicializado(true);
        this.repository.save(sistema);
        return sistema;
    }

    @GetMapping("sistema/view/")
    public Sistema get() {
        List<Sistema> sistemas = this.repository.findAll();
        if (sistemas.size() > 0) {
            return sistemas.get(0);
        } else {
            return new Sistema();
        }
    }

}

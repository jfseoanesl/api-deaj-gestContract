/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.Persona;
import gov.deajVpar.ApiGestionContratos.entity.TipoDocumento;
import gov.deajVpar.ApiGestionContratos.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class PersonaService {

    private PersonaRepository repository;

    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public Persona save(Persona obj) {

        return this.repository.save(obj);

    }

    public List<Persona> getAll() {
        return this.repository.findByEliminado(false);
    }

    public Optional<Persona> findById(Long id) {

        return this.repository.findById(id);

    }
    
    public Optional<Persona> findByDocument(String documento, TipoDocumento tipo) {

        return this.repository.findByNoDocumentoAndTipoDocumento(documento, tipo);
        
    }
    
}

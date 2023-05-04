/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.TipoDocumento;
import gov.deajVpar.ApiGestionContratos.entity.TipoPersona;
import gov.deajVpar.ApiGestionContratos.repository.TipoDocumentoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class TipoDocumentoService {
    
    private TipoDocumentoRepository repository;

    public TipoDocumentoService(TipoDocumentoRepository repository) {
        this.repository = repository;
    }
    
    
    public TipoDocumento save(TipoDocumento td){
        
        return this.repository.save(td);
        
    }
    
    public List<TipoDocumento> getAll(){
    
        return this.repository.findAll();
        
    }
    
    public Optional<TipoDocumento> findById(Long id){
        
        return this.repository.findById(id);
        
    }
    
    public Optional<TipoDocumento> findByDescripcion(String descripcion){
        
        return this.repository.findByDescripcion(descripcion);
        
    }
    
    
    public void saveAll(List<TipoDocumento> list){
    
        this.repository.saveAll(list);
        
    }
    
    
    public void initialize(){
        
        List<TipoDocumento> list = new ArrayList();
      
        list.add(new TipoDocumento("CC","Cedula ciudadania", TipoPersona.NATURAL));
        list.add(new TipoDocumento("TI","Tarjeta identidad", TipoPersona.NATURAL));
        list.add(new TipoDocumento("RC", "Registro civil",TipoPersona.NATURAL));
        list.add(new TipoDocumento("CE", "Cedula extranjeria", TipoPersona.NATURAL));
        list.add(new TipoDocumento("PA", "Pasaporte", TipoPersona.NATURAL));
        list.add(new TipoDocumento("NI", "Nit", TipoPersona.JURIDICA));
        list.add(new TipoDocumento("OT", "Otro",TipoPersona.NATURAL));
        
        this.saveAll(list);
        
    
    }
}

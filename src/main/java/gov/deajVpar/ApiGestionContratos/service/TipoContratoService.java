/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.TipoContrato;
import gov.deajVpar.ApiGestionContratos.repository.TipoContratoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo F
 */
@Service
public class TipoContratoService {
    
    @Autowired
    private TipoContratoRepository repository;

    public TipoContratoService() {
    }
    
    public TipoContrato save(TipoContrato tipo){
        
       return this.repository.save(tipo);
//       return tipo;
        
    }
    
    public void saveAll(List<TipoContrato> list){
        
        this.repository.saveAll(list);
        
    }
    
    public List<TipoContrato> getAll(){
        
        return this.repository.findByEliminado(false);
        
    }
    
    public Optional<TipoContrato> findById(Long id){
        
        return this.repository.findById(id);
        
    }
    
    public void initialize(){
        
        List<TipoContrato> list = new ArrayList();
        
        list.add(new TipoContrato("ARRENDAMIENTO y/o ADQUISICIÓN DE INMUEBLES", null));
        list.add(new TipoContrato("PRESTACIÓN DE SERVICIOS", null));
        list.add(new TipoContrato("COMPRAVENTA y/o SUMINISTRO", null));
        list.add(new TipoContrato("MANTENIMIENTO y/o REPARACIÓN", null));
        
        this.saveAll(list);
    
    }
}

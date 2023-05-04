/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.entity.ModalidadContrato;
import gov.deajVpar.ApiGestionContratos.entity.SubModalidadContrato;
import gov.deajVpar.ApiGestionContratos.repository.ModalidadContratoRepository;
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
public class ModalidadContratoService {
    
    @Autowired
    private ModalidadContratoRepository repository;

    public ModalidadContratoService() {
    }
    
    public ModalidadContrato save(ModalidadContrato modalidad){
        
        return this.repository.save(modalidad);
    
    }
    
    public void saveAll (List<ModalidadContrato> list){
        
        this.repository.saveAll(list);
        
    }
    
    public List<ModalidadContrato> getAll(){
        
        return this.repository.findAll();
        
    }
    
    public Optional<ModalidadContrato> findById(Long id){
    
        return this.repository.findById(id);
        
    }
    
    public void initialize(){
            
        List<ModalidadContrato> list = new ArrayList();
        ModalidadContrato a = new ModalidadContrato("Se escoje a sus contratistas a traves de una invitacion publica dirigida a todas las personas potencialmente interesadas", "Licitacion publica", null);
        list.add(a);
        
        ModalidadContrato b = new ModalidadContrato("Procesos simplificados para garantizaar la eficiencia de la gestion contractual", "Selección abreviada", null);
        b.addSubModalidad(new SubModalidadContrato("Subasta interna", "Subasta interna", null));
        b.addSubModalidad(new SubModalidadContrato("Compra por catalogo ", "Compra por catalogo ", null));
        b.addSubModalidad(new SubModalidadContrato("En bolsas de producto ", "En bolsas de producto", null));
        list.add(b);
        
        ModalidadContrato C = new ModalidadContrato("Selección de consultores o proyectos mediante sistema de concurso abierto o de precalificacion", "Concurso de meritos", null);
        list.add(C);
        
        ModalidadContrato D = new ModalidadContrato("No se requiere de procedimiento previo para la selección de contratista.", "Contratacion directa", null);
        list.add(D);
        
        ModalidadContrato E = new ModalidadContrato("Adquisicion de bienes, obras y servicios  cuyo valor no exceda del 10% de la menor cuantia", "Contratacion de minima cuantia", null);
        list.add(E);
        
        ModalidadContrato F = new ModalidadContrato("Contratos  que de conformidad con normas constitucionales y legales gozan de un regimen especial de contratacion estatal", "Regimen especial", null);
        list.add(F);
        
        this.saveAll(list);
        
    }
}

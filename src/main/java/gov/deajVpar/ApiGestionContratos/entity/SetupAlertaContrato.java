/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import java.awt.Color;

/**
 *
 * @author Jairo F
 */
@Entity
public class SetupAlertaContrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Min(0)
    private int diasRojo;
    @Min(0)
    private int diasNaranja;
    @Min(0)
    private int diasVerde;
    
    @Min(0)
    private int prioridadRojo;
    @Min(0)
    private int prioridadNaranja;
    @Min(0)
    private int prioridadVerde;
    
    
//    @OneToOne(mappedBy = "setupAlertaContrato")
//    private DireccionSeccional direccionSeccional;

    public SetupAlertaContrato() {
        this.diasRojo=5;
        this.diasNaranja=10;
        this.diasVerde=1;
        
               this.prioridadRojo=2;
        this.prioridadNaranja=1;
        this.prioridadVerde=0;
    }

    public SetupAlertaContrato(int diasRojo, int diasNaranja, int diasVerde, int prioridadRojo, int prioridadNaranja, int prioridadVerde, Color rojoColor, Color naranjaColor, Color verdeColor) {
        this();
        this.diasRojo = diasRojo;
        this.diasNaranja = diasNaranja;
        this.diasVerde = diasVerde;
        this.prioridadRojo = prioridadRojo;
        this.prioridadNaranja = prioridadNaranja;
        this.prioridadVerde = prioridadVerde;

    }

    public SetupAlertaContrato(int diasRojo, int diasNaranja, int diasVerde, int prioridadRojo, int prioridadNaranja, int prioridadVerde, Color rojoColor, Color naranjaColor, Color verdeColor, DireccionSeccional direccionSeccional) {
        this();
        this.diasRojo = diasRojo;
        this.diasNaranja = diasNaranja;
        this.diasVerde = diasVerde;
        this.prioridadRojo = prioridadRojo;
        this.prioridadNaranja = prioridadNaranja;
        this.prioridadVerde = prioridadVerde;

    }

    public SetupAlertaContrato(Long id, int diasRojo, int diasNaranja, int diasVerde, int prioridadRojo, int prioridadNaranja, int prioridadVerde, Color rojoColor, Color naranjaColor, Color verdeColor, DireccionSeccional direccionSeccional) {
        this.id = id;
        this.diasRojo = diasRojo;
        this.diasNaranja = diasNaranja;
        this.diasVerde = diasVerde;
        this.prioridadRojo = prioridadRojo;
        this.prioridadNaranja = prioridadNaranja;
        this.prioridadVerde = prioridadVerde;

    }

    

    /**
     * @return the diasRojo
     */
    public int getDiasRojo() {
        return diasRojo;
    }

    /**
     * @param diasRojo the diasRojo to set
     */
    public void setDiasRojo(int diasRojo) {
        this.diasRojo = diasRojo;
    }

    /**
     * @return the diasNaranja
     */
    public int getDiasNaranja() {
        return diasNaranja;
    }

    /**
     * @param diasNaranja the diasNaranja to set
     */
    public void setDiasNaranja(int diasNaranja) {
        this.diasNaranja = diasNaranja;
    }

    /**
     * @return the diasVerde
     */
    public int getDiasVerde() {
        return diasVerde;
    }

    /**
     * @param diasVerde the diasVerde to set
     */
    public void setDiasVerde(int diasVerde) {
        this.diasVerde = diasVerde;
    }

    /**
     * @return the prioridadRojo
     */
    public int getPrioridadRojo() {
        return prioridadRojo;
    }

    /**
     * @param prioridadRojo the prioridadRojo to set
     */
    public void setPrioridadRojo(int prioridadRojo) {
        this.prioridadRojo = prioridadRojo;
    }

    /**
     * @return the prioridadNaranja
     */
    public int getPrioridadNaranja() {
        return prioridadNaranja;
    }

    /**
     * @param prioridadNaranja the prioridadNaranja to set
     */
    public void setPrioridadNaranja(int prioridadNaranja) {
        this.prioridadNaranja = prioridadNaranja;
    }

    /**
     * @return the prioridadVerde
     */
    public int getPrioridadVerde() {
        return prioridadVerde;
    }

    /**
     * @param prioridadVerde the prioridadVerde to set
     */
    public void setPrioridadVerde(int prioridadVerde) {
        this.prioridadVerde = prioridadVerde;
    }

  

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

   
}

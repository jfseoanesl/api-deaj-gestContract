/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Jairo F
 */
@Entity
public class AlertaContrato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private LocalDateTime fechaRegistro;
    private boolean estado;  // true: actual   false: vieja
    @OneToOne
    @JoinColumn(name = "aviso_id", referencedColumnName = "id")
    private AvisoAlerta aviso;
    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;

    public AlertaContrato() {
    }

    public AlertaContrato(Long id, LocalDateTime fechaRegistro, boolean estado, AvisoAlerta aviso, Contrato contrato) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.aviso = aviso;
        this.contrato = contrato;
    }

    public AlertaContrato(LocalDateTime fechaRegistro, boolean estado, AvisoAlerta aviso, Contrato contrato) {
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.aviso = aviso;
        this.contrato = contrato;
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

    /**
     * @return the fechaRegistro
     */
    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the aviso
     */
    public AvisoAlerta getAviso() {
        return aviso;
    }

    /**
     * @param aviso the aviso to set
     */
    public void setAviso(AvisoAlerta aviso) {
        this.aviso = aviso;
    }

    /**
     * @return the contrato
     */
    public Contrato getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    
    
}

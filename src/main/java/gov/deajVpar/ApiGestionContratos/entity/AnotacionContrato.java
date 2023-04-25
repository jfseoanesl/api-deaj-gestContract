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
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 *
 * @author Jairo F
 */
@Entity
public class AnotacionContrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private LocalDate fecha;
    @NotNull
    private String descripcion;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario createByUser;
    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;

    public AnotacionContrato(LocalDate fecha, String descripcion, Usuario createByUser, Contrato contrato) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.createByUser = createByUser;
        this.contrato = contrato;
    }

    

    public AnotacionContrato() {
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
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the createByUser
     */
    public Usuario getCreateByUser() {
        return createByUser;
    }

    /**
     * @param createByUser the createByUser to set
     */
    public void setCreateByUser(Usuario createByUser) {
        this.createByUser = createByUser;
    }

    @Override
    public String toString() {
        return "AnotacionContrato{" + "id=" + id + ", fecha=" + fecha + ", descripcion=" + descripcion + ", createByUser=" + createByUser + '}';
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

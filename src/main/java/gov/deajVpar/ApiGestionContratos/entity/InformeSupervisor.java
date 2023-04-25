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
import java.time.LocalDate;

/**
 *
 * @author Jairo F
 */
@Entity
public class InformeSupervisor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private LocalDate fechaReferencia;
    private LocalDate fechaPresentacion;
    private LocalDate fechaRegistro;
    private String resumenInforme;
    private boolean estado; // false: no verificado   true: verificado
    @OneToOne
    @JoinColumn(name = "verificadopor_id")
    private Usuario verificatebyUser;
    private LocalDate fechaVerificacion;
    @ManyToOne
    @JoinColumn(name = "usuariosupervisor_id")
    private UsuarioSupervisor supervisor;
    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;
    

    public InformeSupervisor() {
    }

    public InformeSupervisor(LocalDate fechaReferencia, Contrato contrato) {
        this.fechaReferencia = fechaReferencia;
        this.contrato = contrato;
    }

    public InformeSupervisor(LocalDate fechaReferencia, LocalDate fechaPresentacion, LocalDate fechaRegistro, String resumenInforme, boolean estado, Usuario verificatebyUser, LocalDate fechaVerificacion, UsuarioSupervisor supervisor, Contrato contrato) {
        this.fechaReferencia = fechaReferencia;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaRegistro = fechaRegistro;
        this.resumenInforme = resumenInforme;
        this.estado = estado;
        this.verificatebyUser = verificatebyUser;
        this.fechaVerificacion = fechaVerificacion;
        this.supervisor = supervisor;
        this.contrato = contrato;
    }

    public InformeSupervisor(Long id, LocalDate fechaReferencia, LocalDate fechaPresentacion, LocalDate fechaRegistro, String resumenInforme, boolean estado, Usuario verificatebyUser, LocalDate fechaVerificacion, UsuarioSupervisor supervisor, Contrato contrato) {
        this.id = id;
        this.fechaReferencia = fechaReferencia;
        this.fechaPresentacion = fechaPresentacion;
        this.fechaRegistro = fechaRegistro;
        this.resumenInforme = resumenInforme;
        this.estado = estado;
        this.verificatebyUser = verificatebyUser;
        this.fechaVerificacion = fechaVerificacion;
        this.supervisor = supervisor;
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
     * @return the fechaReferencia
     */
    public LocalDate getFechaReferencia() {
        return fechaReferencia;
    }

    /**
     * @param fechaReferencia the fechaReferencia to set
     */
    public void setFechaReferencia(LocalDate fechaReferencia) {
        this.fechaReferencia = fechaReferencia;
    }

    /**
     * @return the fechaPresentacion
     */
    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    /**
     * @param fechaPresentacion the fechaPresentacion to set
     */
    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    /**
     * @return the fechaRegistro
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the resumenInforme
     */
    public String getResumenInforme() {
        return resumenInforme;
    }

    /**
     * @param resumenInforme the resumenInforme to set
     */
    public void setResumenInforme(String resumenInforme) {
        this.resumenInforme = resumenInforme;
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
     * @return the verificatebyUser
     */
    public Usuario getVerificatebyUser() {
        return verificatebyUser;
    }

    /**
     * @param verificatebyUser the verificatebyUser to set
     */
    public void setVerificatebyUser(Usuario verificatebyUser) {
        this.verificatebyUser = verificatebyUser;
    }

    /**
     * @return the fechaVerificacion
     */
    public LocalDate getFechaVerificacion() {
        return fechaVerificacion;
    }

    /**
     * @param fechaVerificacion the fechaVerificacion to set
     */
    public void setFechaVerificacion(LocalDate fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    /**
     * @return the supervisor
     */
    public UsuarioSupervisor getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(UsuarioSupervisor supervisor) {
        this.supervisor = supervisor;
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

    @Override
    public String toString() {
        return "InformeSupervisor{" + "id=" + id + ", fechaReferencia=" + fechaReferencia + ", fechaPresentacion=" + fechaPresentacion + ", fechaRegistro=" + fechaRegistro + ", resumenInforme=" + resumenInforme + ", estado=" + estado + ", verificatebyUser=" + verificatebyUser + ", fechaVerificacion=" + fechaVerificacion + ", supervisor=" + supervisor + ", contrato=" + contrato + '}';
    }
    
    
    
    
}

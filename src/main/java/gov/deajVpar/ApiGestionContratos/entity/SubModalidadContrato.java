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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo F
 */
@Entity
public class SubModalidadContrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSubModalidad;
    @NotBlank
    private String descripcionSubModalidad;
    @NotBlank
    private String nombreSubModalidad;
    @OneToMany(mappedBy = "subModalidad")
    private List<Contrato> listContratosRegistrados;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario createByUser;
    private boolean eliminado;

    public SubModalidadContrato() {
        this.listContratosRegistrados= new ArrayList();
        this.eliminado=false;
    }

    public SubModalidadContrato(String descripcionSubModalidad, String nombreSubModalidad, Usuario createByUser) {
        this();
        this.descripcionSubModalidad = descripcionSubModalidad;
        this.nombreSubModalidad = nombreSubModalidad;
        this.createByUser = createByUser;
        
    }

    public SubModalidadContrato(Long idSubModalidad, String descripcionSubModalidad, String nombreSubModalidad, List<Contrato> listContratosRegistrados, Usuario createByUser, boolean eliminado) {
        this.idSubModalidad = idSubModalidad;
        this.descripcionSubModalidad = descripcionSubModalidad;
        this.nombreSubModalidad = nombreSubModalidad;
        this.listContratosRegistrados = listContratosRegistrados;
        this.createByUser = createByUser;
        this.eliminado = eliminado;
    }

    /**
     * @return the idSubModalidad
     */
    public Long getIdSubModalidad() {
        return idSubModalidad;
    }

    /**
     * @param idSubModalidad the idSubModalidad to set
     */
    public void setIdSubModalidad(Long idSubModalidad) {
        this.idSubModalidad = idSubModalidad;
    }

    /**
     * @return the descripcionSubModalidad
     */
    public String getDescripcionSubModalidad() {
        return descripcionSubModalidad;
    }

    /**
     * @param descripcionSubModalidad the descripcionSubModalidad to set
     */
    public void setDescripcionSubModalidad(String descripcionSubModalidad) {
        this.descripcionSubModalidad = descripcionSubModalidad;
    }

    /**
     * @return the nombreSubModalidad
     */
    public String getNombreSubModalidad() {
        return nombreSubModalidad;
    }

    /**
     * @param nombreSubModalidad the nombreSubModalidad to set
     */
    public void setNombreSubModalidad(String nombreSubModalidad) {
        this.nombreSubModalidad = nombreSubModalidad;
    }

    /**
     * @return the listContratosRegistrados
     */
    public List<Contrato> getListContratosRegistrados() {
        return listContratosRegistrados;
    }

    /**
     * @param listContratosRegistrados the listContratosRegistrados to set
     */
    public void setListContratosRegistrados(List<Contrato> listContratosRegistrados) {
        this.listContratosRegistrados = listContratosRegistrados;
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

    /**
     * @return the eliminado
     */
    public boolean isEliminado() {
        return eliminado;
    }

    /**
     * @param eliminado the eliminado to set
     */
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
}

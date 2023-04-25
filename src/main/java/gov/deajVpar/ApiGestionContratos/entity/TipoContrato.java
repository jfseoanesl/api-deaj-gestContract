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
public class TipoContrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String descripcion;
    @OneToMany(mappedBy = "tipoContrato")
    private List<Contrato> listContratos;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario crateByuser;
    private boolean eliminado;

    public TipoContrato() {
    }
    
    public TipoContrato(String descripcion, Usuario crateByuser) {
        this.descripcion = descripcion;
        this.crateByuser = crateByuser;
        this.listContratos= new ArrayList();
        this.eliminado=false;
    }

    public TipoContrato(Long id, String descripcion, List<Contrato> listContratos, Usuario crateByuser, boolean eliminado) {
        this.id = id;
        this.descripcion = descripcion;
        this.listContratos = listContratos;
        this.crateByuser = crateByuser;
        this.eliminado = eliminado;
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
     * @return the listContratos
     */
    public List<Contrato> getListContratos() {
        return listContratos;
    }

    /**
     * @param listContratos the listContratos to set
     */
    public void setListContratos(List<Contrato> listContratos) {
        this.listContratos = listContratos;
    }

    /**
     * @return the crateByuser
     */
    public Usuario getCrateByuser() {
        return crateByuser;
    }

    /**
     * @param crateByuser the crateByuser to set
     */
    public void setCrateByuser(Usuario crateByuser) {
        this.crateByuser = crateByuser;
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

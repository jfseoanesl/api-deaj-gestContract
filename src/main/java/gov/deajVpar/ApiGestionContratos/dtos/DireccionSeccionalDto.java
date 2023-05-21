/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.dtos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo F
 */
public class DireccionSeccionalDto {
    private Long id;
    private String descripcionSeccional;
    private List<DptoDto> listDptoCoordinados;
    private UsuarioDto createdByUser;
    private boolean eliminado;
    private SetupAlertaDto setupAlerta;

    public DireccionSeccionalDto() {
        this.listDptoCoordinados = new ArrayList();
        
    }

    public DireccionSeccionalDto(Long idDireccion, String descripcionSeccional) {
        this.id = idDireccion;
        this.descripcionSeccional = descripcionSeccional;
    }

    /**
     * @return the idDireccion
     */
    public Long getId() {
        return id;
    }

    /**
     * @param idDireccion the idDireccion to set
     */
    public void setId(Long idDireccion) {
        this.id = idDireccion;
    }

    /**
     * @return the descripcionSeccional
     */
    public String getDescripcionSeccional() {
        return descripcionSeccional;
    }

    /**
     * @param descripcionSeccional the descripcionSeccional to set
     */
    public void setDescripcionSeccional(String descripcionSeccional) {
        this.descripcionSeccional = descripcionSeccional;
    }

    public DireccionSeccionalDto(Long idDireccion, String descripcionSeccional, List<DptoDto> listDptoCoordinados, UsuarioDto createdByUser, boolean eliminado) {
        this.id = idDireccion;
        this.descripcionSeccional = descripcionSeccional;
        this.listDptoCoordinados = listDptoCoordinados;
        this.createdByUser = createdByUser;
        this.eliminado = eliminado;
    }

    /**
     * @return the listDptoCoordinados
     */
    public List<DptoDto> getListDptoCoordinados() {
        return listDptoCoordinados;
    }

    /**
     * @param listDptoCoordinados the listDptoCoordinados to set
     */
    public void setListDptoCoordinados(List<DptoDto> listDptoCoordinados) {
        this.listDptoCoordinados = listDptoCoordinados;
    }

    /**
     * @return the createdByUser
     */
    public UsuarioDto getCreatedByUser() {
        return createdByUser;
    }

    /**
     * @param createdByUser the createdByUser to set
     */
    public void setCreatedByUser(UsuarioDto createdByUser) {
        this.createdByUser = createdByUser;
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

    @Override
    public String toString() {
        return "DireccionSeccionalDto{" + "id=" + id + ", descripcionSeccional=" + descripcionSeccional + ", listDptoCoordinados=" + listDptoCoordinados + ", createdByUser=" + createdByUser + ", eliminado=" + eliminado + '}';
    }

    /**
     * @return the setupAlerta
     */
    public SetupAlertaDto getSetupAlerta() {
        return setupAlerta;
    }

    /**
     * @param setupAlerta the setupAlerta to set
     */
    public void setSetupAlerta(SetupAlertaDto setupAlerta) {
        this.setupAlerta = setupAlerta;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo F
 */
@Entity
public class UsuarioSupervisor extends Usuario{
    @OneToMany(mappedBy = "supervisor")
    private List<Contrato> listContratosSupervisados;
    @OneToMany(mappedBy = "supervisor")
    private List<InformeSupervisor> listInformesSupervision;
    @ManyToOne
    @JoinColumn(name = "deajSeccional_id")
    private DireccionSeccional deajSeccional;

    public UsuarioSupervisor() {
    }

    public UsuarioSupervisor(Long idUsuario, PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, boolean estado) {
        super(idUsuario, datosPersona, userName, password, rolUsuario, estado);
        this.listContratosSupervisados= new ArrayList();
        this.listInformesSupervision=new ArrayList();
    }

    public UsuarioSupervisor(PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, DireccionSeccional direccionSeccional, Usuario createdByUser) {
        super(datosPersona, userName, password, rolUsuario, direccionSeccional, createdByUser);
    }

    /**
     * @return the listContratosSupervisados
     */
    public List<Contrato> getListContratosSupervisados() {
        return listContratosSupervisados;
    }

    /**
     * @param listContratosSupervisados the listContratosSupervisados to set
     */
    public void setListContratosSupervisados(List<Contrato> listContratosSupervisados) {
        this.listContratosSupervisados = listContratosSupervisados;
    }

    /**
     * @return the listInformesSupervision
     */
    public List<InformeSupervisor> getListInformesSupervision() {
        return listInformesSupervision;
    }

    /**
     * @param listInformesSupervision the listInformesSupervision to set
     */
    public void setListInformesSupervision(List<InformeSupervisor> listInformesSupervision) {
        this.listInformesSupervision = listInformesSupervision;
    }

    @Override
    public String toString() {
        return "UsuarioSupervisor{" + '}';
    }

    @Override
    public String getUserType() {
        return TipoUsuario.SUPERVISOR.toString();
    }
    
    
}

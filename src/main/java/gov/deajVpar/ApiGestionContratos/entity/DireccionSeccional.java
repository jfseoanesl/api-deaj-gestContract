package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo F
 */
@Entity
public class DireccionSeccional {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descripcionSeccional;
    @OneToMany(mappedBy = "direccionSeccional",cascade = CascadeType.ALL)
    private List<Usuario> listUsuarios;
    @ManyToMany
    private List<Dpto> listDptoCoordinados;
    @OneToMany(mappedBy = "direccion",cascade = CascadeType.ALL)
    private List<Contrato> listContratosSuscritos;
    @OneToMany(mappedBy = "deajSeccional",cascade = CascadeType.ALL)
    private List<UsuarioSupervisor> listSupervisoresSeccional;
    @OneToOne(cascade = CascadeType.ALL)
    private SetupAlertaContrato setupAlertaContrato;
    @OneToOne
    private Usuario createdByUser;
    private boolean eliminado;

    public DireccionSeccional(String descripcionSeccional, Usuario user) {

        this(descripcionSeccional);
        this.createdByUser = user;
        this.setupAlertaContrato=new SetupAlertaContrato();
    }

    public DireccionSeccional(String descripcionSeccional) {
        this();
        this.descripcionSeccional = descripcionSeccional;
    }

    public DireccionSeccional(Long idDireccion, String descripcionSeccional, List<Usuario> listUsuarios, List<Dpto> listDptoCoordinados, List<Contrato> listContratosSuscritos, List<UsuarioSupervisor> listSupervisoresSeccional, SetupAlertaContrato setupAlertaContrato, Usuario createdByUser, boolean eliminado) {
        this();
        this.id = idDireccion;
        this.descripcionSeccional = descripcionSeccional;
        this.listUsuarios = listUsuarios;
        this.listDptoCoordinados = listDptoCoordinados;
        this.listContratosSuscritos = listContratosSuscritos;
        this.listSupervisoresSeccional = listSupervisoresSeccional;
        this.setupAlertaContrato = setupAlertaContrato;
        this.createdByUser = createdByUser;
        this.eliminado = eliminado;
    }

    public DireccionSeccional() {
        this.listContratosSuscritos = new ArrayList();
        this.listUsuarios = new ArrayList();
        this.listDptoCoordinados = new ArrayList();
        this.listSupervisoresSeccional = new ArrayList();
        this.setupAlertaContrato = new SetupAlertaContrato();
        this.eliminado = false;
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

    /**
     * @return the listUsuarios
     */
    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    /**
     * @param listUsuarios the listUsuarios to set
     */
    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    /**
     * @return the listDptoCoordinados
     */
    public List<Dpto> getListDptoCoordinados() {
        return listDptoCoordinados;
    }

    /**
     * @param listDptoCoordinados the listDptoCoordinados to set
     */
    public void setListDptoCoordinados(List<Dpto> listDptoCoordinados) {
        this.listDptoCoordinados = listDptoCoordinados;
    }

    /**
     * @return the listContratosSuscritos
     */
    public List<Contrato> getListContratosSuscritos() {
        return listContratosSuscritos;
    }

    /**
     * @param listContratosSuscritos the listContratosSuscritos to set
     */
    public void setListContratosSuscritos(List<Contrato> listContratosSuscritos) {
        this.listContratosSuscritos = listContratosSuscritos;
    }

    /**
     * @return the listSupervisoresSeccional
     */
    public List<UsuarioSupervisor> getListSupervisoresSeccional() {
        return listSupervisoresSeccional;
    }

    /**
     * @param listSupervisoresSeccional the listSupervisoresSeccional to set
     */
    public void setListSupervisoresSeccional(List<UsuarioSupervisor> listSupervisoresSeccional) {
        this.listSupervisoresSeccional = listSupervisoresSeccional;
    }

    /**
     * @return the setupAlertaContrato
     */
    public SetupAlertaContrato getSetupAlertaContrato() {
        return setupAlertaContrato;
    }

    /**
     * @param setupAlertaContrato the setupAlertaContrato to set
     */
    public void setSetupAlertaContrato(SetupAlertaContrato setupAlertaContrato) {
        this.setupAlertaContrato = setupAlertaContrato;
    }

    /**
     * @return the createdByUser
     */
    public Usuario getCreatedByUser() {
        return createdByUser;
    }

    /**
     * @param createdByUser the createdByUser to set
     */
    public void setCreatedByUser(Usuario createdByUser) {
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
        return "DireccionSeccional{" + "id=" + id + ", descripcionSeccional=" + descripcionSeccional + ", createdByUser=" + createdByUser + ", eliminado=" + eliminado + '}';
    }

}

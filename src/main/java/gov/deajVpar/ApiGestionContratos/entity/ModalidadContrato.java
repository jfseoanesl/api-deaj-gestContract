package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.CascadeType;
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
public class ModalidadContrato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idModalidad;
    @NotBlank
    private String descripcionModalidad;
    @NotBlank
    private String nombreModalidad;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<SubModalidadContrato> listSubModalidades;
    @OneToMany(mappedBy = "modalidad")
    private List<Contrato> listContratosRegistrados;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario createByUser;
    private boolean eliminado;

    public ModalidadContrato() {
        this.listSubModalidades= new ArrayList();
    }

    public ModalidadContrato(String descripcionModalidad, String nombreModalidad, Usuario createByUser) {
        this.descripcionModalidad = descripcionModalidad;
        this.nombreModalidad = nombreModalidad;
        this.createByUser = createByUser;
        this.eliminado=false;
        this.listContratosRegistrados= new ArrayList();
        this.listSubModalidades= new ArrayList();
    }

    public ModalidadContrato(Long idModalidad, String descripcionModalidad, String nombreModalidad, List<Contrato> listContratosRegistrados, Usuario createByUser, boolean eliminado) {
        this.idModalidad = idModalidad;
        this.descripcionModalidad = descripcionModalidad;
        this.nombreModalidad = nombreModalidad;
        this.listContratosRegistrados = listContratosRegistrados;
        this.createByUser = createByUser;
        this.listSubModalidades= new ArrayList();
        this.eliminado = eliminado;
    }

    /**
     * @return the idModalidad
     */
    public Long getIdModalidad() {
        return idModalidad;
    }

    /**
     * @param idModalidad the idModalidad to set
     */
    public void setIdModalidad(Long idModalidad) {
        this.idModalidad = idModalidad;
    }

    /**
     * @return the descripcionModalidad
     */
    public String getDescripcionModalidad() {
        return descripcionModalidad;
    }

    /**
     * @param descripcionModalidad the descripcionModalidad to set
     */
    public void setDescripcionModalidad(String descripcionModalidad) {
        this.descripcionModalidad = descripcionModalidad;
    }

    /**
     * @return the nombreModalidad
     */
    public String getNombreModalidad() {
        return nombreModalidad;
    }

    /**
     * @param nombreModalidad the nombreModalidad to set
     */
    public void setNombreModalidad(String nombreModalidad) {
        this.nombreModalidad = nombreModalidad;
    }

    /**
     * @return the listSubModalidades
     */
    public List<SubModalidadContrato> getListSubModalidades() {
        return listSubModalidades;
    }

    /**
     * @param listSubModalidades the listSubModalidades to set
     */
    public void setListSubModalidades(List<SubModalidadContrato> listSubModalidades) {
        this.listSubModalidades = listSubModalidades;
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

    @Override
    public String toString() {
        return "ModalidadContrato{" + "idModalidad=" + idModalidad + ", descripcionModalidad=" + descripcionModalidad + ", nombreModalidad=" + nombreModalidad + ", listContratosRegistrados=" + listContratosRegistrados + ", createByUser=" + createByUser + ", eliminado=" + eliminado + '}';
    }

    public void addSubModalidad(SubModalidadContrato sub){
        this.listSubModalidades.add(sub);
    }
    
}

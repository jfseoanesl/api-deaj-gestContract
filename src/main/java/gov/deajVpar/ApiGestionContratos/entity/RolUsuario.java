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
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo F
 */
@Entity
public class RolUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String nombreRol;
    @NotNull
    private TipoUsuario tipoUsuario;
    @OneToMany(cascade = CascadeType.ALL)
    private List<PermisoUsuario> listPermisosUsuario;
    @OneToOne
    private Usuario cratedByUser;
    private boolean eliminado;
    
    
    public RolUsuario() {
        this.listPermisosUsuario = new ArrayList();
    }

    public RolUsuario(String nombreRol, TipoUsuario tipoUsuario, List<PermisoUsuario> listPermisosUsuario) {
        this.nombreRol = nombreRol;
        this.tipoUsuario = tipoUsuario;
        this.listPermisosUsuario = listPermisosUsuario;
        this.cratedByUser = null;
        this.eliminado = false;
    }

    

    public RolUsuario(String nombreRol, List<PermisoUsuario> listPermisosUsuario,  Usuario cratedByUser) {
        this();
        this.nombreRol = nombreRol;
        this.listPermisosUsuario = listPermisosUsuario;
        this.cratedByUser = cratedByUser;
        this.eliminado=false;
    }

    public RolUsuario(Long idRol, String nombreRol, List<PermisoUsuario> listPermisosUsuario, Usuario cratedByUser, boolean eliminado) {
        this.id = idRol;
        this.nombreRol = nombreRol;
        this.listPermisosUsuario = listPermisosUsuario;
        this.cratedByUser = cratedByUser;
        this.eliminado = eliminado;
    }

    /**
     * @return the idRol
     */
    public Long getId() {
        return id;
    }

    /**
     * @param idRol the idRol to set
     */
    public void setId(Long idRol) {
        this.id = idRol;
    }

    /**
     * @return the nombreRol
     */
    public String getNombreRol() {
        return nombreRol;
    }

    /**
     * @param nombreRol the nombreRol to set
     */
    public void setNombreRol(String nombreRol) {
        this.nombreRol=nombreRol;
    }

    /**
     * @return the listPermisosUsuario
     */
    public List<PermisoUsuario> getListPermisosUsuario() {
        return listPermisosUsuario;
    }

    /**
     * @param listPermisosUsuario the listPermisosUsuario to set
     */
    public void setListPermisosUsuario(List<PermisoUsuario> listPermisosUsuario) {
        this.listPermisosUsuario = listPermisosUsuario;
    }

    /**
     * @return the cratedByUser
     */
    public Usuario getCratedByUser() {
        return cratedByUser;
    }

    /**
     * @param cratedByUser the cratedByUser to set
     */
    public void setCratedByUser(Usuario cratedByUser) {
        this.cratedByUser = cratedByUser;
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
        return "RolUsuario{" + "id=" + id + ", nombreRol=" + nombreRol + ", listPermisosUsuario=" + listPermisosUsuario + ", cratedByUser=" + cratedByUser + ", eliminado=" + eliminado + '}';
    }

    
    /**
     * @return the tipoUsuario
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    

    
    
    
}

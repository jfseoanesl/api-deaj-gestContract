package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

/**
 *
 * @author Jairo F
 */
@Entity
public class RolUsuario {
    @Id
    private Long idRol;
    @NotBlank
    private String nombreRol;
    @OneToMany(mappedBy = "rolUsuario")
    private List<PermisoUsuario> listPermisosUsuario;
    @OneToOne(mappedBy = "rolUsuario")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario cratedByUser;
    private boolean eliminado;
    
    
    public RolUsuario() {
    }

    public RolUsuario(String nombreRol, Usuario cratedByUser) {
        this.nombreRol = nombreRol;
        this.cratedByUser = cratedByUser;
        this.eliminado=false;
    }

    public RolUsuario(String nombreRol, List<PermisoUsuario> listPermisosUsuario, Usuario usuario, Usuario cratedByUser) {
        this.nombreRol = nombreRol;
        this.listPermisosUsuario = listPermisosUsuario;
        this.usuario = usuario;
        this.cratedByUser = cratedByUser;
        this.eliminado=false;
    }

    /**
     * @return the idRol
     */
    public Long getIdRol() {
        return idRol;
    }

    /**
     * @param idRol the idRol to set
     */
    public void setIdRol(Long idRol) {
        this.idRol = idRol;
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
        this.nombreRol = nombreRol;
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
        return "RolUsuario{" + "idRol=" + idRol + ", nombreRol=" + nombreRol + ", listPermisosUsuario=" + listPermisosUsuario + ", cratedByUser=" + cratedByUser + ", eliminado=" + eliminado + '}';
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    

    
    
    
}

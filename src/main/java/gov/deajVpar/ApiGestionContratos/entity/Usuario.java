package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author Jairo F
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private PersonaNatural datosPersona;
    @Column(unique = true)
    private String userName;
    private String password;
    @OneToOne
    @JoinColumn(name = "rolusuario_id")
    private RolUsuario rolUsuario;
    @ManyToOne
    @JoinColumn(name = "direccionseccional_id")
    private DireccionSeccional direccionSeccional;
    @OneToOne
    private Usuario createdByUser;
    private boolean estado;

    public Usuario() {
    }

    public Usuario(Long idUsuario, PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, boolean estado) {
        this.idUsuario = idUsuario;
        this.datosPersona = datosPersona;
        this.userName = userName;
        this.password = password;
        this.rolUsuario = rolUsuario;
        this.estado = estado;
    }

    /**
     * @return the idUsuario
     */
    public Long getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the datosPersona
     */
    public PersonaNatural getDatosPersona() {
        return datosPersona;
    }

    /**
     * @param datosPersona the datosPersona to set
     */
    public void setDatosPersona(PersonaNatural datosPersona) {
        this.datosPersona = datosPersona;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the rolUsuario
     */
    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    /**
     * @param rolUsuario the rolUsuario to set
     */
    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
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

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", datosPersona=" + datosPersona + ", userName=" + userName + ", password=" + password + ", rolUsuario=" + rolUsuario + ", estado=" + estado + '}';
    }

    
}

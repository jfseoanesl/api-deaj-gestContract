package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

/**
 *
 * @author Jairo F
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id")
    private PersonaNatural datosPersona;
    @Column(unique = true)
    private String userName;
    private String password;
    @ManyToOne
    @JoinColumn(name = "rolusuario_id")
    private RolUsuario rolUsuario;
    @ManyToOne
    @JoinColumn(name = "direccionseccional_id")
    private DireccionSeccional direccionSeccional;
    @OneToOne
    private Usuario createdByUser;
    private boolean estado;

    public Usuario() {
        this.datosPersona = new PersonaNatural();
    }

    public Usuario(Long idUsuario, PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, boolean estado) {
        this.id = idUsuario;
        this.datosPersona = datosPersona;
        this.userName = userName;
        this.password = password;
        this.rolUsuario = rolUsuario;
        this.estado = estado;
    }

    public Usuario(PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, DireccionSeccional direccionSeccional, Usuario createdByUser) {
        this.datosPersona = datosPersona;
        this.userName = userName;
        this.password = password;
        this.rolUsuario = rolUsuario;
        this.direccionSeccional = direccionSeccional;
        this.createdByUser = createdByUser;
        this.estado=false;
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
        return "Usuario{" + "idUsuario=" + getId() + ", datosPersona=" + datosPersona + ", userName=" + userName + ", password=" + password + ", rolUsuario=" + rolUsuario + ", estado=" + estado + '}';
    }
    
    public abstract String getUserType();

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
     * @return the direccionSeccional
     */
    public DireccionSeccional getDireccionSeccional() {
        return direccionSeccional;
    }

    /**
     * @param direccionSeccional the direccionSeccional to set
     */
    public void setDireccionSeccional(DireccionSeccional direccionSeccional) {
        this.direccionSeccional = direccionSeccional;
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
    
    
}

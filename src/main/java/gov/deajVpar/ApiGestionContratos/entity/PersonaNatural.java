package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.*;

/**
 *
 * @author Jairo F
 */
@Entity
public class PersonaNatural extends Persona {
    @NotBlank
    private String pNombre;
    private String sNombre;
    @NotBlank
    private String pApellido;
    private String sApellido;
    @NotNull
    private GeneroPersona genero;
    private LocalDate fechaNacimiento;

    public PersonaNatural() {
    }

    public PersonaNatural(String pNombre, String sNombre, String pApellido, String sApellido, GeneroPersona genero, LocalDate fechaNacimiento, Long idPersona, TipoDocumento tipoDocumento, String noDocumento) {
        super(idPersona, tipoDocumento, noDocumento);
        this.pNombre = pNombre;
        this.sNombre = sNombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaNatural(String pNombre, String sNombre, String pApellido, String sApellido, GeneroPersona genero, LocalDate fechaNacimiento, TipoDocumento tipoDocumento, String noDocumento) {
        super(tipoDocumento, noDocumento);
        this.pNombre = pNombre;
        this.sNombre = sNombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

   

    /**
     * @return the pNombre
     */
    public String getpNombre() {
        return pNombre;
    }

    /**
     * @param pNombre the pNombre to set
     */
    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    /**
     * @return the sNombre
     */
    public String getsNombre() {
        return sNombre;
    }

    /**
     * @param sNombre the sNombre to set
     */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /**
     * @return the pApellido
     */
    public String getpApellido() {
        return pApellido;
    }

    /**
     * @param pApellido the pApellido to set
     */
    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    /**
     * @return the sApellido
     */
    public String getsApellido() {
        return sApellido;
    }

    /**
     * @param sApellido the sApellido to set
     */
    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    /**
     * @return the fechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

    /**
     * @return the genero
     */
    public GeneroPersona getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(GeneroPersona genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "PersonaNatural{id="+this.getIdPersona() + ", pNombre=" + pNombre + ", sNombre=" + sNombre + ", pApellido=" + pApellido + ", sApellido=" + sApellido + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}

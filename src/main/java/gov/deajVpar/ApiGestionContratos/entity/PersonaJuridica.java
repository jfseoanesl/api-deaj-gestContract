package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Jairo F
 */
@Entity
public class PersonaJuridica extends Persona {
    @NotBlank
    private String nombreEmpresa;

       public PersonaJuridica(String nombreEmpresa, Long idPersona, TipoDocumento tipoDocumento, String noDocumento) {
        super(idPersona, tipoDocumento, noDocumento);
        this.nombreEmpresa = nombreEmpresa;
    }

    public PersonaJuridica() {
    }

    public PersonaJuridica(Long idPersona, TipoDocumento tipoDocumento, String noDocumento) {
        super(idPersona, tipoDocumento, noDocumento);
    }

    /**
     * @return the nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * @param nombreEmpresa the nombreEmpresa to set
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "PersonaJuridica{" + "nombreEmpresa=" + nombreEmpresa + '}';
    }
    
       
    
}

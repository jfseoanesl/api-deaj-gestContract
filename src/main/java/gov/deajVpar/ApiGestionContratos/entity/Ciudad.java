package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Jairo F
 */
@Entity
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCiudad;
    @NotBlank
    private String codigoCiudad;
    @NotBlank
    private String nombreCiudad;
    

    public Ciudad(String codigoCiudad, String nombreCiudad) {
        this.codigoCiudad = codigoCiudad;
        this.nombreCiudad = nombreCiudad;
        
    }

    public Ciudad() {
    }

    
    

    /**
     * @return the idCiudad
     */
    public Long getIdCiudad() {
        return this.idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set
     */
    public void setIdCiudad(Long idCiudad) {
        this.idCiudad = idCiudad;
    }

    /**
     * @return the nombreCiudad
     */
    public String getNombreCiudad() {
        return this.nombreCiudad;
    }

    /**
     * @param nombreCiudad the nombreCiudad to set
     */
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "idCiudad=" + idCiudad + ", nombreCiudad=" + nombreCiudad + '}';
    }

    

    /**
     * @return the codigoCiudad
     */
    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    /**
     * @param codigoCiudad the codigoCiudad to set
     */
    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }
    
}

package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

/**
 *
 * @author Jairo F
 */
@Entity
public class Dpto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDpto;
    @Column(unique = true)
    private String codigoDpto;
    @NotBlank
    private String nombreDpto;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Ciudad> listCiudades;

    public Dpto() {
    }

    public Dpto(String codigoDpto, String nombreDpto) {
        this.codigoDpto = codigoDpto;
        this.nombreDpto = nombreDpto;
    }

    

    /**
     * @return the idDpto
     */
    public Long getIdDpto() {
        return idDpto;
    }

    /**
     * @param idDpto the idDpto to set
     */
    public void setIdDpto(Long idDpto) {
        this.idDpto = idDpto;
    }

    /**
     * @return the nombreDpto
     */
    public String getNombreDpto() {
        return nombreDpto;
    }

    /**
     * @param nombreDpto the nombreDpto to set
     */
    public void setNombreDpto(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }

    /**
     * @return the listCiudades
     */
    public List<Ciudad> getListCiudades() {
        return listCiudades;
    }

    /**
     * @param listCiudades the listCiudades to set
     */
    public void setListCiudades(List<Ciudad> listCiudades) {
        this.listCiudades = listCiudades;
    }

    @Override
    public String toString() {
        return "Dpto{" + "idDpto=" + idDpto + ", nombreDpto=" + nombreDpto + ", listCiudades=" + listCiudades + '}';
    }
    
    public void addCiudad(Ciudad c){
        this.listCiudades.add(c);
    }

    /**
     * @return the codigoDpto
     */
    public String getCodigoDpto() {
        return codigoDpto;
    }

    /**
     * @param codigoDpto the codigoDpto to set
     */
    public void setCodigoDpto(String codigoDpto) {
        this.codigoDpto = codigoDpto;
    }
}

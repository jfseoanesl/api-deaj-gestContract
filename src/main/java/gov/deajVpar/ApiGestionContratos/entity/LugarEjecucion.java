package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Jairo F
 */
@Entity
public class LugarEjecucion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLugarEjecucion;
    @OneToOne(cascade = CascadeType.ALL)
    private Dpto dpto;
    @OneToOne(cascade = CascadeType.ALL)
    private Ciudad ciudad;
    @NotBlank
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;

    public LugarEjecucion() {
    }

    public LugarEjecucion(Dpto dpto, Ciudad ciudad, String direccion, Contrato contrato) {
        this.dpto = dpto;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.contrato = contrato;
    }

    public LugarEjecucion(Long idLugarEjecucion, Dpto dpto, Ciudad ciudad, String direccion, Contrato contrato) {
        this.idLugarEjecucion = idLugarEjecucion;
        this.dpto = dpto;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.contrato = contrato;
    }

   

    /**
     * @return the idLugarEjecucion
     */
    public Long getIdLugarEjecucion() {
        return idLugarEjecucion;
    }

    /**
     * @param idLugarEjecucion the idLugarEjecucion to set
     */
    public void setIdLugarEjecucion(Long idLugarEjecucion) {
        this.idLugarEjecucion = idLugarEjecucion;
    }

    /**
     * @return the dpto
     */
    public Dpto getDpto() {
        return dpto;
    }

    /**
     * @param dpto the dpto to set
     */
    public void setDpto(Dpto dpto) {
        this.dpto = dpto;
    }

    /**
     * @return the ciudad
     */
    public Ciudad getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.setDireccion(direccion);
    }

    @Override
    public String toString() {
        return "LugarEjecucion{" + "idLugarEjecucion=" + idLugarEjecucion + ", dpto=" + dpto + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }

    /**
     * @return the contrato
     */
    public Contrato getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    
}

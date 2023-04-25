package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo F
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Persona {
    @Id
    private Long idPersona;
    @ManyToOne
    @JoinColumn(name = "tipodocumento_id")
    private TipoDocumento tipoDocumento;
    @NotBlank
    private String noDocumento;
    @OneToMany(mappedBy = "contratistaAdjudicado")
    private List<Contrato> listContratosSuscritos;
    
    private boolean eliminado;

    public Persona() {
        this.listContratosSuscritos= new ArrayList();
    }

    public Persona(Long idPersona, TipoDocumento tipoDocumento, String noDocumento) {
        this();
        this.idPersona = idPersona;
        this.tipoDocumento = tipoDocumento;
        this.noDocumento = noDocumento;
        this.eliminado = false;
    }

    /**
     * @return the idPersona
     */
    public Long getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the tipoDocumento
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the noDocumento
     */
    public String getNoDocumento() {
        return noDocumento;
    }

    /**
     * @param noDocumento the noDocumento to set
     */
    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
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
        return "Persona{" + "idPersona=" + idPersona + ", tipoDocumento=" + tipoDocumento + ", noDocumento=" + noDocumento + ", eliminado=" + eliminado + '}';
    }
    
    
    
}

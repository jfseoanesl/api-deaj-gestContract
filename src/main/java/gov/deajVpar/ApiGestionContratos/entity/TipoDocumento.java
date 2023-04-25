package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Jairo F
 */
@Entity
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipoDocumento;
    @NotBlank
    private String descripcion;
    @NotBlank
    private TipoPersona tipoPersona;
    private boolean eliminado;

    public TipoDocumento() {
        this.eliminado=false;
    }

    public TipoDocumento(Long idTipoDocumento, String descripcion, TipoPersona tipo) {
        this();
        this.idTipoDocumento = idTipoDocumento;
        this.descripcion = descripcion;
        this.tipoPersona = tipo;
        
    }

    public TipoDocumento(String descripcion, TipoPersona tipoPersona) {
        this.descripcion = descripcion;
        this.tipoPersona = tipoPersona;
        this.eliminado=false;
    }
    
    

    /**
     * @return the idTipoDocumento
     */
    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * @param idTipoDocumento the idTipoDocumento to set
     */
    public void setIdTipoDocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the tipo
     */
    public TipoPersona getTipo() {
        return tipoPersona;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoPersona tipo) {
        this.tipoPersona = tipo;
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
        return "TipoDocumento{" + "idTipoDocumento=" + idTipoDocumento + ", descripcion=" + descripcion + ", tipoPersona=" + tipoPersona + ", eliminado=" + eliminado + '}';
    }
    
    
}

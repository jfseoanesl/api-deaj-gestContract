package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author Jairo F
 */
@Entity
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String tipo;
    @NotBlank
    private String descripcion;
    @NotNull
    private TipoPersona tipoPersona;
    private boolean eliminado;

    public TipoDocumento() {
        this.eliminado=false;
    }

    public TipoDocumento(Long idTipoDocumento, String tipo, String descripcion, TipoPersona tipoPersona) {
        this();
        this.id = idTipoDocumento;
        this.descripcion = descripcion;
        this.tipoPersona = tipoPersona;
        this.tipo=tipo;
        
    }

    public TipoDocumento(String tipo, String descripcion, TipoPersona tipoPersona) {
        this.descripcion = descripcion;
        this.tipoPersona = tipoPersona;
        this.tipo=tipo;
        this.eliminado=false;
    }
    

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
     * @return the tipoPersona
     */
    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * @param tipoPersona the tipoPersona to set
     */
    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
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
    
    
    
    
}

package gov.deajVpar.ApiGestionContratos.entity;

import java.time.LocalDateTime;

/**
 *
 * @author Jairo F
 */
public class SesionUsuario {
    private Long idSesion;
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraCierre;
    private Usuario usuarioLogin;
    private boolean estadoSesion;

    public SesionUsuario() {
    }

    public SesionUsuario(Long idSesion, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraCierre, Usuario usuarioLogin) {
        this.idSesion = idSesion;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraCierre = fechaHoraCierre;
        this.usuarioLogin = usuarioLogin;
        this.estadoSesion=true;
    }

    /**
     * @return the idSesion
     */
    public Long getIdSesion() {
        return idSesion;
    }

    /**
     * @param idSesion the idSesion to set
     */
    public void setIdSesion(Long idSesion) {
        this.idSesion = idSesion;
    }

    /**
     * @return the fechaHoraInicio
     */
    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    /**
     * @param fechaHoraInicio the fechaHoraInicio to set
     */
    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    /**
     * @return the fechaHoraCierre
     */
    public LocalDateTime getFechaHoraCierre() {
        return fechaHoraCierre;
    }

    /**
     * @param fechaHoraCierre the fechaHoraCierre to set
     */
    public void setFechaHoraCierre(LocalDateTime fechaHoraCierre) {
        this.fechaHoraCierre = fechaHoraCierre;
    }

    /**
     * @return the usuarioLogin
     */
    public Usuario getUsuarioLogin() {
        return usuarioLogin;
    }

    /**
     * @param usuarioLogin the usuarioLogin to set
     */
    public void setUsuarioLogin(Usuario usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    /**
     * @return the estadoSesion
     */
    public boolean isEstadoSesion() {
        return estadoSesion;
    }

    /**
     * @param estadoSesion the estadoSesion to set
     */
    public void setEstadoSesion(boolean estadoSesion) {
        this.estadoSesion = estadoSesion;
    }

    @Override
    public String toString() {
        return "SesionUsuario{" + "idSesion=" + idSesion + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraCierre=" + fechaHoraCierre + ", usuarioLogin=" + usuarioLogin + ", estadoSesion=" + estadoSesion + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;

/**
 *
 * @author Jairo F
 */
@Entity
public class UsuarioDirector extends Usuario {
    
    private DireccionSeccional direccionSeccional;

    public UsuarioDirector() {
    }

    public UsuarioDirector(DireccionSeccional direccionSeccional, Long idUsuario, PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, boolean estado) {
        super(idUsuario, datosPersona, userName, password, rolUsuario, estado);
        this.direccionSeccional = direccionSeccional;
    }

    public UsuarioDirector(Long idUsuario, PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, boolean estado) {
        super(idUsuario, datosPersona, userName, password, rolUsuario, estado);
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

    @Override
    public String toString() {
        return "UsuarioDirector{" + "direccionSeccional=" + direccionSeccional + '}';
    }

    @Override
    public String getUserType() {
        return TipoUsuario.DIRECTOR.toString();
    }
    
    
}

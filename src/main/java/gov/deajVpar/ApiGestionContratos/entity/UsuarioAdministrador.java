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
public class UsuarioAdministrador extends Usuario{

    public UsuarioAdministrador() {
    }

    public UsuarioAdministrador(Long idUsuario, PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, boolean estado) {
        super(idUsuario, datosPersona, userName, password, rolUsuario, estado);
    }

    public UsuarioAdministrador(PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, DireccionSeccional direccionSeccional, Usuario createdByUser) {
        super(datosPersona, userName, password, rolUsuario, direccionSeccional, createdByUser);
    }
    
    
}

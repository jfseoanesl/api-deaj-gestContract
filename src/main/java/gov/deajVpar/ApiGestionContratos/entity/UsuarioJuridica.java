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
public class UsuarioJuridica extends Usuario {

    public UsuarioJuridica() {
    }

    public UsuarioJuridica(Long idUsuario, PersonaNatural datosPersona, String userName, String password, RolUsuario rolUsuario, boolean estado) {
        super(idUsuario, datosPersona, userName, password, rolUsuario, estado);
    }
    
}

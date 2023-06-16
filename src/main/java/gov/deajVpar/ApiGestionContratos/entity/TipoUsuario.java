/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

/**
 *
 * @author Jairo F
 */
public enum TipoUsuario {
    ADMINISTRADOR, DIRECTOR, JURIDICA, SUPERVISOR;
    
    public static TipoUsuario get(String tipo){
        
        switch(tipo){
            case "ADMINISTRADOR": return ADMINISTRADOR;
            case "DIRECTOR": return DIRECTOR;
            case "JURIDICA":return JURIDICA;
            case "SUPERVISOR": return SUPERVISOR;
            default: return null;
        }
    }
}

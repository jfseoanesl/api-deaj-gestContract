/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

/**
 *
 * @author Jairo F
 */
public enum GeneroPersona {
    MASCULINO, FEMENINO, OTRO;

    public static GeneroPersona get(String descricipcion) {
        GeneroPersona gp;
        switch (descricipcion) {

            case "Masculino":
            case "MASCULINO":
                gp = MASCULINO;
                break;

            case "Femenino":
            case "FEMENINO":
                gp = FEMENINO;
                break;

            default:
                gp = OTRO;

        }
        return gp;

    }
}

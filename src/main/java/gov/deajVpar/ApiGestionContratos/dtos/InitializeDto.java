/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.dtos;

import gov.deajVpar.ApiGestionContratos.entity.Dpto;
import java.util.Map;

/**
 *
 * @author Jairo F
 */
public class InitializeDto {
    private SistemaDto sistema;
    private Map<String, DptoDto> dptos;
    private UsuarioDto userData;

    public InitializeDto() {
    }

    public InitializeDto(SistemaDto sistema, Map<String, DptoDto> dptos, UsuarioDto userData) {
        this.sistema = sistema;
        this.dptos = dptos;
        this.userData = userData;
    }

    

    /**
     * @return the sistema
     */
    public SistemaDto getSistema() {
        return sistema;
    }

    /**
     * @param sistema the sistema to set
     */
    public void setSistema(SistemaDto sistema) {
        this.sistema = sistema;
    }

    /**
     * @return the dptos
     */
    public Map<String, DptoDto> getDptos() {
        return dptos;
    }

    /**
     * @param dptos the dptos to set
     */
    public void setDptos(Map<String, DptoDto> dptos) {
        this.dptos = dptos;
    }

    /**
     * @return the userAdmon
     */
    public UsuarioDto getUserData() {
        return userData;
    }

    /**
     * @param userAdmon the userAdmon to set
     */
    public void setUserData(UsuarioDto userData) {
        this.userData = userData;
    }
    
    
}

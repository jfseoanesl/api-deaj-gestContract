/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.dtos;

import gov.deajVpar.ApiGestionContratos.entity.Ciudad;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

/**
 *
 * @author Jairo F
 */
public class DptoDto {
    
    private String codigoDpto;
    private String nombreDpto;
    private List<Ciudad> listCiudades;

    public DptoDto() {
    }

    public DptoDto(String codigoDpto, String nombreDpto, List<Ciudad> listCiudades) {
        this.codigoDpto = codigoDpto;
        this.nombreDpto = nombreDpto;
        this.listCiudades = listCiudades;
    }

    /**
     * @return the codigoDpto
     */
    public String getCodigoDpto() {
        return codigoDpto;
    }

    /**
     * @param codigoDpto the codigoDpto to set
     */
    public void setCodigoDpto(String codigoDpto) {
        this.codigoDpto = codigoDpto;
    }

    /**
     * @return the nombreDpto
     */
    public String getNombreDpto() {
        return nombreDpto;
    }

    /**
     * @param nombreDpto the nombreDpto to set
     */
    public void setNombreDpto(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }

    /**
     * @return the listCiudades
     */
    public List<Ciudad> getListCiudades() {
        return listCiudades;
    }

    /**
     * @param listCiudades the listCiudades to set
     */
    public void setListCiudades(List<Ciudad> listCiudades) {
        this.listCiudades = listCiudades;
    }
    
    
}

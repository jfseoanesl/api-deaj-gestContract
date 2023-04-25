/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import java.awt.Color;

/**
 *
 * @author Jairo F
 */
@Entity
public class AvisoRojo extends AvisoAlerta {

    public AvisoRojo() {
    }

    public AvisoRojo(Long id, int nInformesCheked, int prioridadAlerta, Color color, AlertaContrato alerta) {
        super(id, nInformesCheked, prioridadAlerta, color, alerta);
    }

    public AvisoRojo(int nInformesCheked, int prioridadAlerta, Color color, AlertaContrato alerta) {
        super(nInformesCheked, prioridadAlerta, color, alerta);
    }

   
    
}

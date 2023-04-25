/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import java.awt.Color;

/**
 *
 * @author Jairo F
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AvisoAlerta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nInformesCheked;
    private int prioridadAlerta;
    private Color color;
    @OneToOne(mappedBy = "aviso")
    private AlertaContrato alerta;

    public AvisoAlerta() {
    }

    public AvisoAlerta(Long id, int nInformesCheked, int prioridadAlerta, Color color, AlertaContrato alerta) {
        this.id = id;
        this.nInformesCheked = nInformesCheked;
        this.prioridadAlerta = prioridadAlerta;
        this.color = color;
        this.alerta = alerta;
    }

    public AvisoAlerta(int nInformesCheked, int prioridadAlerta, Color color, AlertaContrato alerta) {
        this.nInformesCheked = nInformesCheked;
        this.prioridadAlerta = prioridadAlerta;
        this.color = color;
        this.alerta = alerta;
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
     * @return the nInformesCheked
     */
    public int getnInformesCheked() {
        return nInformesCheked;
    }

    /**
     * @param nInformesCheked the nInformesCheked to set
     */
    public void setnInformesCheked(int nInformesCheked) {
        this.nInformesCheked = nInformesCheked;
    }

    /**
     * @return the prioridadAlerta
     */
    public int getPrioridadAlerta() {
        return prioridadAlerta;
    }

    /**
     * @param prioridadAlerta the prioridadAlerta to set
     */
    public void setPrioridadAlerta(int prioridadAlerta) {
        this.prioridadAlerta = prioridadAlerta;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    
}

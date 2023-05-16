/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.dtos;

import gov.deajVpar.ApiGestionContratos.entity.Modulo;

/**
 *
 * @author Jairo F
 */
public class PermisoUserDto {
    private Modulo modulo;
    private boolean c;
    private boolean u;
    private boolean d;
    private boolean r;

    public PermisoUserDto() {
    }

    public PermisoUserDto(Modulo modulo, boolean c, boolean u, boolean d, boolean r) {
        this.modulo = modulo;
        this.c = c;
        this.u = u;
        this.d = d;
        this.r = r;
    }

    /**
     * @return the modulo
     */
    public Modulo getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the c
     */
    public boolean isC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(boolean c) {
        this.c = c;
    }

    /**
     * @return the u
     */
    public boolean isU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(boolean u) {
        this.u = u;
    }

    /**
     * @return the d
     */
    public boolean isD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(boolean d) {
        this.d = d;
    }

    /**
     * @return the r
     */
    public boolean isR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(boolean r) {
        this.r = r;
    }

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author Jairo F
 */
@Entity
public class PermisoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private Modulo modulo;
    private boolean c;
    private boolean u;
    private boolean d;
    private boolean r;
    @ManyToOne
    @JoinColumn(name = "rolusuario_id")
    private RolUsuario rolUsuario;

    public PermisoUsuario() {
    }

    public PermisoUsuario(Modulo modulo, boolean c, boolean u, boolean d, boolean r, RolUsuario rolUsuario) {
        this.modulo = modulo;
        this.c = c;
        this.u = u;
        this.d = d;
        this.r = r;
        this.rolUsuario = rolUsuario;
    }

    public PermisoUsuario(Long id, Modulo modulo, boolean c, boolean u, boolean d, boolean r, RolUsuario rolUsuario) {
        this.id = id;
        this.modulo = modulo;
        this.c = c;
        this.u = u;
        this.d = d;
        this.r = r;
        this.rolUsuario = rolUsuario;
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

    /**
     * @return the rolUsuario
     */
    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    /**
     * @param rolUsuario the rolUsuario to set
     */
    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    @Override
    public String toString() {
        return "PermisoUsuario{" + "id=" + id + ", modulo=" + modulo + ", c=" + c + ", u=" + u + ", d=" + d + ", r=" + r + ", rolUsuario=" + rolUsuario + '}';
    }

 
    
}

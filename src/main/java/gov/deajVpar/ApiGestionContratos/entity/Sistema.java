/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Jairo F
 */
@Entity
public class Sistema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String version;
    private String name;
    private boolean inicializado;

    public Sistema() {
        this.version = "V1.0";
        this.name="GestContract";
        this.titulo = this.name +" - "+"Sistema para el seguimiento de contratos suscritos por Deaj" + " - " + this.version;
        this.inicializado=false;
    }

    public Sistema(Long id, String titulo, String version, String name, boolean inicializado) {
        this.id = id;
        this.titulo = titulo;
        this.version = version;
        this.name = name;
        this.inicializado = inicializado;
    }

    public Sistema(String titulo, String version, String name, boolean inicializado) {
        this.titulo = titulo;
        this.version = version;
        this.name = name;
        this.inicializado = inicializado;
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the inicializado
     */
    public boolean isInicializado() {
        return inicializado;
    }

    /**
     * @param inicializado the inicializado to set
     */
    public void setInicializado(boolean inicializado) {
        this.inicializado = inicializado;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sistema{" + "id=" + id + ", titulo=" + titulo + ", version=" + version + ", name=" + name + ", inicializado=" + inicializado + '}';
    }
    
    
    
}

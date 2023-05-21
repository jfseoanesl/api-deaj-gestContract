/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.dtos;


/**
 *
 * @author Jairo F
 */
public class SetupAlertaDto {
    private Long id;
    private int diasRojo;
    private int diasNaranja;
    private int diasVerde;
    private int prioridadRojo;
    private int prioridadNaranja;
    private int prioridadVerde;
//    private Color rojoColor;
//    private Color naranjaColor;
//    private Color verdeColor;

    public SetupAlertaDto() {
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SetupAlertaDto{" + "id=" + id + ", diasRojo=" + diasRojo + ", diasNaranja=" + diasNaranja + ", diasVerde=" + diasVerde + ", prioridadRojo=" + prioridadRojo + ", prioridadNaranja=" + prioridadNaranja + ", prioridadVerde=" + prioridadVerde + '}';
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the diasRojo
     */
    public int getDiasRojo() {
        return diasRojo;
    }

    /**
     * @param diasRojo the diasRojo to set
     */
    public void setDiasRojo(int diasRojo) {
        this.diasRojo = diasRojo;
    }

    /**
     * @return the diasNaranja
     */
    public int getDiasNaranja() {
        return diasNaranja;
    }

    /**
     * @param diasNaranja the diasNaranja to set
     */
    public void setDiasNaranja(int diasNaranja) {
        this.diasNaranja = diasNaranja;
    }

    /**
     * @return the diasVerde
     */
    public int getDiasVerde() {
        return diasVerde;
    }

    /**
     * @param diasVerde the diasVerde to set
     */
    public void setDiasVerde(int diasVerde) {
        this.diasVerde = diasVerde;
    }

    /**
     * @return the prioridadRojo
     */
    public int getPrioridadRojo() {
        return prioridadRojo;
    }

    /**
     * @param prioridadRojo the prioridadRojo to set
     */
    public void setPrioridadRojo(int prioridadRojo) {
        this.prioridadRojo = prioridadRojo;
    }

    /**
     * @return the prioridadNaranja
     */
    public int getPrioridadNaranja() {
        return prioridadNaranja;
    }

    /**
     * @param prioridadNaranja the prioridadNaranja to set
     */
    public void setPrioridadNaranja(int prioridadNaranja) {
        this.prioridadNaranja = prioridadNaranja;
    }

    /**
     * @return the prioridadVerde
     */
    public int getPrioridadVerde() {
        return prioridadVerde;
    }

    /**
     * @param prioridadVerde the prioridadVerde to set
     */
    public void setPrioridadVerde(int prioridadVerde) {
        this.prioridadVerde = prioridadVerde;
    }

//    /**
//     * @return the rojoColor
//     */
//    public Color getRojoColor() {
//        return rojoColor;
//    }
//
//    /**
//     * @param rojoColor the rojoColor to set
//     */
//    public void setRojoColor(Color rojoColor) {
//        this.rojoColor = rojoColor;
//    }
//
//    /**
//     * @return the naranjaColor
//     */
//    public Color getNaranjaColor() {
//        return naranjaColor;
//    }

//    /**
//     * @param naranjaColor the naranjaColor to set
//     */
//    public void setNaranjaColor(Color naranjaColor) {
//        this.naranjaColor = naranjaColor;
//    }
//
//    /**
//     * @return the verdeColor
//     */
//    public Color getVerdeColor() {
//        return verdeColor;
//    }
//
//    /**
//     * @param verdeColor the verdeColor to set
//     */
//    public void setVerdeColor(Color verdeColor) {
//        this.verdeColor = verdeColor;
//    }
    
    
}

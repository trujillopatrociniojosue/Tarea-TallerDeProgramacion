/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Josue Trujillo
 */
public class LenguajeProgramacion {
 
    private int anionCreacion;
    private String caracteristicaPrincipal;
    private String nombre;
    private String utilizacion;
    

    public int getAnionCreacion() {
        return anionCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUtilizacion() {
        return utilizacion;
    }

    //Constructor
    
    public LenguajeProgramacion(int anionCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        this.anionCreacion = anionCreacion;
        this.caracteristicaPrincipal = caracteristicaPrincipal;
        this.nombre = nombre;
        this.utilizacion = utilizacion;
    }
    
    public void setAnionCreacion(int anionCreacion) {
        this.anionCreacion = anionCreacion;
    }

    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        this.caracteristicaPrincipal = caracteristicaPrincipal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUtilizacion(String utilizacion) {
        this.utilizacion = utilizacion;
    }
    
    @Override
    public String toString() {
        return "LenguajeProgramacion{" + "anionCreacion=" + anionCreacion + ", "
                + "caracteristicaPrincipal=" + caracteristicaPrincipal + ", nombre=" + nombre + 
                ", utilizacion=" + utilizacion + '}';
    }
}

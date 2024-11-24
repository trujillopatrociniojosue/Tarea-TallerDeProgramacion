/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.LenguajeProgramacion;
import java.util.Arrays;

/**
 *
 * @author Josue Trujillo
 */
public class GestionLenguaje {
    
    private static final int FACTOR_CRECIMIENTO= 2;
    private static LenguajeProgramacion[] arregloLenguajes= new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private static int contadorLenguajes= 0;
    
    
    public static void agregarLenguaje(int anionCreacion, String caracteristicaPrincipal, 
            String nombre, String utilizacion) {
        
        if (contadorLenguajes >= arregloLenguajes.length) {  
            duplicarArreglo();
        }

        LenguajeProgramacion nuevoLenguaje = new LenguajeProgramacion(anionCreacion, caracteristicaPrincipal, 
                nombre, utilizacion);

        arregloLenguajes[contadorLenguajes] = nuevoLenguaje;
        contadorLenguajes++;
    }

  
    private static void duplicarArreglo() {
        
        LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[arregloLenguajes.length * FACTOR_CRECIMIENTO];
       
        System.arraycopy(arregloLenguajes, 0, nuevoArreglo, 0, arregloLenguajes.length);
        
        arregloLenguajes = nuevoArreglo;
    }
    
    public static void buscarLenguaje(String nombre) {
        
        for (int i = 0; i < contadorLenguajes; i++) {
            
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
            
            System.out.println("Lenguaje encontrado: " + arregloLenguajes[i].toString());
            return; 
        }
    }
        
        System.out.println("Lenguaje no encontrado.");
    }
    
    public static boolean eliminarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
            
            arregloLenguajes[i] = arregloLenguajes[contadorLenguajes - 1];
            
            arregloLenguajes[contadorLenguajes - 1] = null;
            
            contadorLenguajes--;
            
            System.out.println("Lenguaje " + nombre + " eliminado.");
            return true;
        }
    }
    
        System.out.println("Lenguaje no encontrado.");
        return false;
}
    public static LenguajeProgramacion[] getArregloLenguajes() {
        
        return Arrays.copyOf(arregloLenguajes, contadorLenguajes);
}
    public static void imprimirLenguajes() {
        if (contadorLenguajes == 0) {
            System.out.println("No hay lenguajes registrados.");
        } else {
            for (int i = 0; i < contadorLenguajes; i++) {
                System.out.println(arregloLenguajes[i].toString());
            }
}
    }
}

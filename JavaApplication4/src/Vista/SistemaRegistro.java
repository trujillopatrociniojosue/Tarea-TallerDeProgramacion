/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.GestionLenguaje;
import static Controlador.GestionLenguaje.imprimirLenguajes;
import java.util.Scanner;

/**
 *
 * @author Josue Trujillo
 */
public class SistemaRegistro {
    public static void main(String[] args){
        Scanner lector= new Scanner (System.in);
        int opcion;

        while (true) {
            System.out.println("1. Agregar Lenguaje");
            System.out.println("2. Eliminar Lenguaje");
            System.out.println("3. Buscar Lenguaje");
            System.out.println("4. Imprimir Lenguaje");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");
          
            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    agregarLenguaje(lector);
                    break;
                case 2:
                    eliminarLenguaje(lector);
                    break;
                case 3:
                    buscarLenguaje(lector);
                    break;
                case 4:
                    imprimirLenguajes();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    lector.close();
                    return; 
                default:
                    System.out.println("Opción no válida. Ingresar nuevamente");
            }
        }
    }

    private static void agregarLenguaje(Scanner scanner) {
        System.out.print("\nIngrese el nombre del lenguaje: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el año de creacion: ");
        int anioCreacion = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Ingrese la caracteristica principal: ");
        String caracteristicaPrincipal = scanner.nextLine();
        System.out.print("Ingrese la utilizacion: ");
        String utilizacion = scanner.nextLine();

        GestionLenguaje.agregarLenguaje(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
    }

    private static void eliminarLenguaje(Scanner scanner) {
        System.out.print("\nIngrese el nombre del lenguaje a eliminar: ");
        String nombre = scanner.nextLine();

        boolean eliminado = GestionLenguaje.eliminarLenguaje(nombre);
        if (!eliminado) {
            System.out.println("No se pudo eliminar el lenguaje.");
        }
    }

    private static void buscarLenguaje(Scanner scanner) {
        System.out.print("\nIngrese el nombre del lenguaje a buscar: ");
        String nombre = scanner.nextLine();

        GestionLenguaje.buscarLenguaje(nombre);
    }
}

 



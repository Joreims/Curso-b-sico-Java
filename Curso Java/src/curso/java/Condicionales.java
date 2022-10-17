/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.java;
//es una clase que nos permite obtener la entrada de datos primitivos. 
// Esto quiere decir que podemos capturar datos del tipo int, double, string y etc.

import java.util.Scanner;
// Scanner lectura = new Scanner (System.in);
// Solo se puede con String

/**
 *
 * @author jegar
 */
public class Condicionales {

    public static void condicionales() {
        Scanner leer = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad: ");
        edad = leer.nextInt();
        if (edad > 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }
}

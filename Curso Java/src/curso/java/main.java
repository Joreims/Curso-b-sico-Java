/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso.java;

import static curso.java.Condicionales.condicionales;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jegar
 */
public class main {
    public static void main(String[] args) {
        // Concatenar frases y numeros
        String nombre = "Lucas";
        String frase = "Hola, mi nombre es " + nombre;
        Integer followersInstagram = 608;
        System.out.println("Hola mundo");
        System.out.println(frase + ", tengo "+followersInstagram+ " followers en instagram");
        // Operaciones aritmeticas 
        // Suma
        int a = 1;
        int b = 2;
        int c= a+b;
        System.out.println("La suma de "+a+" y "+b+" es "+c);
        //Resta
        int d = 2;
        int e = 3;
        int f = e-d;
        System.out.println("La resta de "+d+" y "+e+" es "+f);
        // Multiplicacion 
        int n=4;
        int z=3;
        int y = n*z;
        System.out.println("La multiplicacion de "+n+" y "+z+" es "+y);
        // Division con Java Swing sin un forms
        double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int r = (int) (n1/n2);
        JOptionPane.showMessageDialog(null,"El resultado de la division es "+r);
        condicionales();
        // Contar el numero de vocales de una frase
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese una frase: ");
        String t = sc.nextLine();
        System.out.println("Su frase es: "+ t);
        for(int x=0;x<t.length();x++) {
            if ((t.charAt(x)=='a') || (t.charAt(x)=='e') || (t.charAt(x)=='i') || (t.charAt(x)=='o') || (t.charAt(x)=='u')){ 
            contador++;
            }
        }
        System.out.println("La palabra " + t + " contiene " + contador + " vocales");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benya
 */
public class resultadoscal {
    public static void main (String [] args) {
        
        Calculadora calc = new Calculadora();
        
 // Pruebas con 2 parámetros
        System.out.println("Suma (2 params): " + calc.sumar(2, 3));
        System.out.println("Resta (2 params): " + calc.restar(12, 4));
        System.out.println("Multiplicación (2 params): " + calc.multiplicar(3, 7));
        System.out.println("División (2 params): " + calc.dividir(20, 4));

        // Pruebas con 3 parámetros
        System.out.println("Suma (3 params): " + calc.sumar(5, 4, 2));
        System.out.println("Resta (3 params): " + calc.restar(12, 4, 2));
        System.out.println("Multiplicación (3 params): " + calc.multiplicar(2, 3, 4));

        // Pruebas con 4 parámetros
        System.out.println("Suma (4 params): " + calc.sumar(19, 2, 3, 4));
        System.out.println("Resta (4 params): " + calc.restar(20, 58, 3, 2));
        System.out.println("Multiplicación (4 params): " + calc.multiplicar(4, 2, 2, 2));    }
    
}

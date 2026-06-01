/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benya
 */
public class Prueba {
    
   public static void main (String [] args) {
       Tv Tv1 = new Tv();
       Tv Tv2 = new Tv();
       Tv Tv3 = new Tv();
       
Tv1.marca = "Westinghouse";
Tv1.pulgadas = 55;
Tv1.volumen = 20;

Tv2.marca = "TLC";
Tv2.pulgadas = 45;
Tv2.volumen = 30;

Tv3.marca = "LG";
Tv3.pulgadas = 95;
Tv3.volumen = 34;

// Invocando los metodos - Imprimiendo
       System.out.println(" ====TV 1===="); //Espacio
              System.out.println(" "); //Espacio



Tv1.apagar();
Tv1.SubirVolumen();
Tv1.encender();
Tv1.BajarVolumen();


Tv1.encender();
System.out.println("Marca: " + Tv1.marca);
System.out.println("Pulgadas: " + Tv1.pulgadas);
System.out.println("Encendido: " + Tv1.encendido);
System.out.println("Volumen: " + Tv1.volumen);
System.out.println(" "); //Espacio
     System.out.println(" ===TV 2===="); //Espacio
            System.out.println(" "); //Espacio

     
Tv2.apagar();
Tv2.SubirVolumen();
Tv2.encender();
Tv2.BajarVolumen();

System.out.println("Marca: " + Tv2.marca);
System.out.println("Pulgadas: " + Tv2.pulgadas);
System.out.println("Encendido: " + Tv2.encendido);
System.out.println("Volumen: " + Tv2.volumen);

       System.out.println(" "); //Espacio
            System.out.println(" ===TV 3==="); //Espacio
                   System.out.println(" "); //Espacio

Tv3.apagar();
Tv3.SubirVolumen();
Tv3.encender();
Tv3.BajarVolumen();


System.out.println("Marca: " + Tv3.marca);
System.out.println("Pulgadas: " + Tv3.pulgadas);
System.out.println("Encendido: " + Tv3.encendido);
System.out.println("Volumen: " + Tv3.volumen);





  




}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author benya
 */
public class Tv {
    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;
 
    
    
    
    public void encender () {
        encendido = true;
                System.out.println("La tv esta encendiendo.. ");
    } 
    public void apagar () {
        encendido = false;
            System.out.println("La tv se esta apagando");
        }
    public void SubirVolumen () {
        System.out.println("Subiendo volumen");
    }
    public void BajarVolumen () {
        System.out.println("La Tv esta bajando volumen");
   
    }
}

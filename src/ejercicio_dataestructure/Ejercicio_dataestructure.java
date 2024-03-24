/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_dataestructure;

import java.util.Scanner;

/**
 *
 * @author DERWIN
 */
public class Ejercicio_dataestructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int edades []= new int [4];
    Scanner teclado = new Scanner(System.in);
    System.out.println("introduce la primera edad del alumno");
    int entrada1=teclado.nextInt();
    System.out.println("introduce la segunda edad del alumno");
    int entrada2=teclado.nextInt();
    System.out.println("introduce la tercera edad del alumno");
    int entrada3=teclado.nextInt();
    System.out.println("introduce la cuarta edad del alumno");
    int entrada4=teclado.nextInt();
    edades[0]=entrada1;
    edades[1]=entrada2;
    edades[2]=entrada3;
    edades[3]=entrada4;
    for (int i = 0; i <edades.length; i++){
    
        System.out.println("las edades ingresadas fueron "+edades[i]);
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
           
    
        }
}
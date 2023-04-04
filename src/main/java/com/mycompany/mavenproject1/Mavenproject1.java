/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        System.out.println("Escriba una numero: ");
        num = leer.nextInt();
        System.out.println("El doble es " + num*2);
        System.out.println("El triple es " + num*3);
        System.out.println("La Raiz cuadrada es " + Math.sqrt(num));
        
        
    }
}


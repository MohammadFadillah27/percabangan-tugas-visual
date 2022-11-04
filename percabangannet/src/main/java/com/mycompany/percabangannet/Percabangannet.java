/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.percabangannet;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Percabangannet {

    public static void main(String[] args) {
int bil = 0;

Scanner a = new Scanner (System.in);
System.out.print("Masukan Bilangan :");
if (a.hasNextInt()) {
    System.out.println("bilangan");
    bil = a.nextInt();
if (bil<6){
    System.out.println("eror, bilangan harus lebih dari 6");
        }else if (bil>100) {
            System.out.println("eror, bilangan yang diinput tidak boleh lebih dari 100");
        } else if (bil%2==0){
            System.out.println("Anda Menginput Bilangan Genap");
        } else {
            System.out.println ("Anda Menginput Bilangan Ganjil");
        }   
    }  
else {
   System.out.println("Bilangan yang diinput harus integer"); 
}
}
}

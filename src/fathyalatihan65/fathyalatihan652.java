/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathyalatihan65;

/**
 *
 * @author WINDOWS
 */
import java.io.*;
public class fathyalatihan652 {
    public static void main(String[] args){
        BufferedReader dataIn = 
            new BufferedReader(new InputStreamReader( System.in) );
        
        int angka = 0;
        
        try {
             System.out.println("masukkan angka = ");
             angka = Integer.parseInt(dataIn.readLine());
         }
         catch (IOException e) {
            System.out.println("Error in getting input");  
         }
            
         if(angka == 1){
             System.out.println("satu");
         }
         else if(angka == 2){
             System.out.println("dua");
         }
         else if(angka == 3){
             System.out.println("tiga");
         }
         else if(angka == 4){
             System.out.println("empat");
         }
         else if(angka == 5){
             System.out.println("lima");
         }
         else if(angka == 6){
             System.out.println("enam");
         }
         else if(angka == 7){
             System.out.println("tujuh");
         }
         else if(angka == 8){
             System.out.println("delapan");
         }
         else if(angka == 9){
             System.out.println("sembilan");
         }
         else if(angka == 10){
             System.out.println("sepuluh");
         }
         else 
             System.out.println("invalid number");
    }
        
        
        
        
        
        
    
}

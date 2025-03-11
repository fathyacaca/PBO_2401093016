/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya060325;

/**
 *
 * @author WINDOWS
 */
import java.io.*;
public class InputLatihan4113 {
    public static void main(String[] args){
        BufferedReader dataIn = 
            new BufferedReader(new InputStreamReader( System.in) );
         int a = 0;
         int b= 0;
         int c = 0;
         
         try {
             System.out.println("number 1 = ");
             a = Integer.parseInt(dataIn.readLine());
             System.out.println("number 2 = ");
             b = Integer.parseInt(dataIn.readLine());
             System.out.println("number 3 = ");
             c = Integer.parseInt(dataIn.readLine());
          
         }
         catch (IOException e) {
            System.out.println("Error in getting input");
        }
         
         int max = (b > a) ? (a > c) ? b : c : a;
         
         System.out.println("number 1= "+a);
         System.out.println("number 2= "+b);
         System.out.println("number 3=" +c);
         System.out.println("Nilai tertingginya = "+max);
       
}
}
    


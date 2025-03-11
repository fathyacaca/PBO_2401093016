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
public class InputLatihan4112 {
    public static void main(String[] args){
        BufferedReader dataIn = 
            new BufferedReader(new InputStreamReader( System.in) );
         int number1 = 0;
         int number2 = 0;
         int number3 = 0;
         
         try {
             System.out.println("number 1 = ");
             number1 = Integer.parseInt(dataIn.readLine());
             System.out.println("number 2 = ");
             number2 = Integer.parseInt(dataIn.readLine());
             System.out.println("number 3 = ");
             number3 = Integer.parseInt(dataIn.readLine());
         }
         catch (IOException e) {
            System.out.println("Error in getting input");
        }
         
         double average = (number1 + number2 + number3)/3;
         
         System.out.println("number 1= "+number1);
         System.out.println("number 2= "+number2);
         System.out.println("number 3= "+number3);
         System.out.println("Average is = "+average);
}
}

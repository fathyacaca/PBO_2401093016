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
public class InputLatihan4111 {
    public static void main(String[] args){
        BufferedReader dataIn = 
            new BufferedReader(new InputStreamReader( System.in) );
         int number =0;
         char letter ='a';
         String t ="";
         boolean result =true;
         String str ="";
         try {
             System.out.println("number = ");
             number = Integer.parseInt(dataIn.readLine());
             System.out.println("letter = ");
             t = dataIn.readLine();
             letter = t.charAt (0);
             System.out.println("str = ");
             str = dataIn.readLine();
         }
         catch (IOException e) {
            System.out.println("Error in getting input");
        }
         System.out.println("number = "+number);
         System.out.println("letter = "+letter);
         System.out.println("result = "+result);
         System.out.println("str = "+str);
    }
    
}

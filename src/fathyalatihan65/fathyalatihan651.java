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
import javax.swing.JOptionPane;
public class fathyalatihan651 {
    public static void main(String[] args){
         BufferedReader dataIn = 
            new BufferedReader(new InputStreamReader( System.in) );
         
         int nilai1 = 0;
         int nilai2 = 0;
         int nilai3 = 0;
         
         try {
             System.out.println("nilai 1 = ");
             nilai1 = Integer.parseInt(dataIn.readLine());
             System.out.println("nilai 2 = ");
             nilai2 = Integer.parseInt(dataIn.readLine());
             System.out.println("nilai 3 = ");
             nilai3 = Integer.parseInt(dataIn.readLine());
          
         }
         catch (IOException e) {
            System.out.println("Error in getting input");       
    }
         double average = (nilai1 + nilai2 + nilai3)/3;
         System.out.println("rata ratanya = "+average);
    
         if (average >= 60)
             System.out.println(":)");
         else
             System.out.println(":(");
         
         int avrg;
         
         int n1 = Integer.parseInt(JOptionPane.showInputDialog("nilai 1 = ")); 
         int n2 = Integer.parseInt(JOptionPane.showInputDialog("nilai 2 = ")); 
         int n3 = Integer.parseInt(JOptionPane.showInputDialog("nilai 3 = "));
         
         avrg = (n1 + n2 + n3)/3;
         
         
         
         
         if (avrg >= 60){
             String msg1 = "rata ratanya = "+avrg +" :)";
             JOptionPane.showMessageDialog(null, msg1);
         }
         else{
             String msg2 = "rata ratanya = "+avrg +" :(";
             JOptionPane.showMessageDialog(null, msg2);
         }
}
}

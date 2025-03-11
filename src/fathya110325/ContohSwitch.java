/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya110325;

/**
 *
 * @author WINDOWS
 */
public class ContohSwitch {
     public static void main(String[] args){
         int grade = 92;
         switch(grade){
             case 100:
                 System.out.println( "Excellent!" );  
               break; 
             case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99:
                 System.out.println( "Good job!" );  
               break; 
             case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
                 System.out.println( "Study harder!" );  
               break; 
             default:
                 System.out.println( "Sorry, you failed." );  
         }
     }
}

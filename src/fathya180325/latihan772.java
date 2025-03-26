/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya180325;

/**
 *
 * @author WINDOWS
 */
import java.io.*;
import javax.swing.JOptionPane;
public class latihan772 {
    public static void main(String[] args){
       int[] numbers = new int[10];
       int max = Integer.MIN_VALUE;
       
       try{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
       for (int i=0; i<10; i++){
           String input = JOptionPane.showInputDialog("masukkan angka ke-" + (i+1) + ": ");
           numbers[i] = Integer.parseInt(input);
           if (numbers[i] > max){
               max = numbers[i];
           }
        }
       JOptionPane.showMessageDialog(null, "angka terbesar yang dimasukkan adalah:"+max);
       
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "terjadi kesalahan: "+ e.getMessage());
    }
}  
}
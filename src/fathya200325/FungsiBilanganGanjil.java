/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya200325;

/**
 *
 * @author WINDOWS
 */
import java.util.Scanner;
public class FungsiBilanganGanjil {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("tidak ada argumen baris perintah yang di berikan");
    }
        else{
            System.out.println("bilangan ganjil dari argumen yang di berikan:");
            for (String arg : args){
                try{
                    int number = Integer.parseInt(arg);
                    if (number % 2 !=0){
                        System.out.println(number);
                    }
                }catch (NumberFormatException e){
                    System.out.println("bukan angka valid"+arg);
                }
            }
        }
    }
}

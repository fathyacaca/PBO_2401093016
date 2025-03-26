/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya180325;

/**
 *
 * @author WINDOWS
 */
public class latihan771 {
    public static void main(String[] args){
        String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        System.out.println("while loop\n");
        int i=0;
        while(i<days.length){
            System.out.println(days[i]);
            i++;
        }
        System.out.println("\n====================\n");
        
        System.out.println("do while\n");
        int j=0;
        do{
            System.out.println(days[j]);
            j++;
        }while(j<days.length);
        System.out.println("\n====================\n");
        
        System.out.println("for loop\n");
        for(i=0; i<days.length; i++){
            System.out.println(days[i]);
        }
    }
}

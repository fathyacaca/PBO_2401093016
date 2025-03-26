/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathyalatihan65;

/**
 *
 * @author WINDOWS
 */
public class fathyalatihan653 {
    public static void main(String[] args){
        String nama = "Fathya Salsabila";
        
        System.out.println("while loop");
        int i = 0;
        while (i < 100) {
            System.out.println((i + 1) + ". " +nama);
            i++;
        }

        System.out.println("\n====================\n");
        
        System.out.println("do while");
        int j = 0;
        do {
            System.out.println((j + 1) + ". " +nama);
            j++;
        } while (j < 100);

        System.out.println("\n====================\n");
        
         System.out.println("for loop");
        for (int k = 0; k < 100; k++) {
            System.out.println((k + 1) + ". " +nama);
        }
        
    }
}

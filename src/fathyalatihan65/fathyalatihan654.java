/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathyalatihan65;

/**
 *
 * @author WINDOWS
 */
import java.util.Scanner;
public class fathyalatihan654 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("masukkan angka:");
        int angka = scanner.nextInt();
        
        System.out.println("masukkan nilai pangkat:");
        int pangkat = scanner.nextInt();
        
        int hasil = 1;
        int i = 0;
        
        do{
            hasil *= angka;
            i++;
        }while (i<pangkat);
        
        System.out.println(angka+" pangkat "+pangkat+" adalah "+hasil);
        
        scanner.close();
    }
}

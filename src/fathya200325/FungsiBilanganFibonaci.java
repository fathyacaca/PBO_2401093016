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
public class FungsiBilanganFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan Fibonaci: ");
        int number = scanner.nextInt();
        
       System.out.println("Bilangan Fibonaci:");
       for (int i=0; i<number; i++){
           System.out.println(fibonaci(i)+ " ");
       }
       
       scanner.close();
    }
        public static int fibonaci(int number){
            if (number <= 1){
                return number;
            }
            return fibonaci(number-1) + fibonaci(number-2);
        }
    }
    
}

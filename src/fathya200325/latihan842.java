/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya200325;

/**
 *
 * @author WINDOWS
 */
public class latihan842 {
    public static void main(String[] args){
        if(args.length<2){
            System.out.println("masukkan angka sebagai argumen");
            return;
        }
        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            int quotient = num1 / num2;
            
            System.out.println("sum = "+sum);
            System.out.println("difference = "+difference);
            System.out.println("product = "+product);
            System.out.println("quotient = "+quotient);
        }catch (NumberFormatException e){
            System.out.println("pastikan masukkan angka yang valid");
        }catch (ArithmeticException e){
            System.out.println("terjadi kesalahan dalam perhitungan" +e.getMessage());
                    
        }
    }
}

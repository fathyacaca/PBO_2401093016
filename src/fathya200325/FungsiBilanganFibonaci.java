/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya200325;

/**
 *
 * @author WINDOWS
 */
public class FungsiBilanganFibonaci {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("tidak ada argumen baris perintah yang di berikan");
    }
        else{
            System.out.println("bilangan fibonacci dari argumen yang di berikan:");
            for (String arg : args){
                try{
                    int number = Integer.parseInt(arg);
                    System.out.println("finonacci "+number+"=");
                    System.out.println(fibonacci(number));
                }catch (NumberFormatException e){
                    System.out.println("bukan angka valid"+arg);
                }
            }
        }
    }
    public static int fibonacci(int number){
        if(number<=0){
            return 0;
        }
        else if (number==1){
            return 1;
        }
        else {
            return fibonacci(number-1)+fibonacci(number-2);
        }
    }
}

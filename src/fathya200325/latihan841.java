/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya200325;

/**
 *
 * @author WINDOWS
 */
public class latihan841 {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("tidak ada argumen baris perintah yang diberikan");
        }
        else{
            System.out.println("argumen baris perintah:");
            for (int i = 0; i<args.length; i++){
                System.out.println("args["+i+"]="+args[i]);
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya180325;

/**
 *
 * @author WINDOWS
 */
public class ContohArray {
    public static void main(String[] args){
        boolean results[] = {true, false, true, false};
        double[] grades = {100, 90, 80, 75};
        String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        System.out.println("result ke->0 adalah" + results[0]);
        
        for(int i=0; i<days.length; i++){
            System.out.println(days[i]);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author fathyaa
 */
public class PegawaiExample {
    public static void main(String[] args){
    Pegawai p1=new Pegawai("1234", "fathya", "1A");
    
    System.out.println("NIP :"+p1.getNIP());
    System.out.println("nama :"+p1.getnama());
    System.out.println("golongan :"+p1.getgolongan());
    System.out.println("gapok :"+p1.getgapok());
    System.out.println("tunjangan :"+p1.gettunjangan());
    System.out.println("total :"+p1.gettotal());
    
}
}

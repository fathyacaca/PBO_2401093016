/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author fathyaa
 */
public class Pegawai {
    protected String nama;
    protected String NIP;
    protected String golongan;
    protected double gapok;
    protected double tunjangan;
    protected double total;
    
    public Pegawai(){
        System.out.println("Inside Pegawai:Constructor");
        NIP = "1234";
        nama = "fathya";
        golongan = "1A";
                setgapok();
                hitungTunjangan();
    }
    
    public Pegawai(String nama, String NIP, String golongan){
        this.nama=nama;
        this.NIP=NIP;
        this.golongan=golongan;
        setgapok();
        hitungTunjangan();
    }
    
    public String getNIP(){
        return NIP;
    }
    
    public String getnama(){
        return nama;
    }
    
    public String getgolongan(){
        return golongan;
    }
    
    public double getgapok(){
        return gapok;
    }
    
    public double gettunjangan(){
        return tunjangan;
    }
    
    public double gettotal(){
        return gapok-tunjangan;
    }
    
    public void setgapok(){
        switch (golongan){
            case "1A":
                gapok=1000000;
                break;
                
            case "2A":
                gapok=2000000;
                break;
                
            case "3A":
                gapok=3000000;
                break;
                
            default:
                System.out.println("golongan tidak valid");
                
                break;
        }
}
    public void hitungTunjangan(){
        tunjangan = gapok*0.05;
    }
    
 
}

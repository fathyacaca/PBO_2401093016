/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya270325;

/**
 *
 * @author WINDOWS
 */
public class EntryBukuAlamat {
    private String nama;
    private String alamat;
    private String noTelp;
    private String email;
    
    // constructor
    public EntryBukuAlamat(String nama, String alamat, String noTelp, String email){
        
        this.nama=nama;
        this.alamat=alamat;
        this.noTelp=noTelp;
        this.email=email;
    }
    
    // accesor dan mutator
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void print(){
        System.out.println("nama: "+nama);
        System.out.println("alamat: "+alamat);
        System.out.println("no telepon: "+noTelp);
        System.out.println("email: "+email);
    }
}

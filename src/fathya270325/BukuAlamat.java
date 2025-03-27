/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fathya270325;

/**
 *
 * @author WINDOWS
 */
import java.util.ArrayList;
public class BukuAlamat {
    public static void main(String[] args){
        BukuAlamat bukuAlamat = new BukuAlamat(100);
        
        EntryBukuAlamat data1 = new EntryBukuAlamat("Fathya", "Padang", "081234567890", "fathya@email.com");
        bukuAlamat.masuk(data1);
        bukuAlamat.tampil();
    }
    
    private ArrayList<EntryBukuAlamat> daftarAlamat;
    private int data;
    
    public BukuAlamat(int data){
        this.daftarAlamat=new ArrayList<>();
        this.data=data;
    }
    
    // memasukan data
    public void masuk(EntryBukuAlamat entry){
        if(daftarAlamat.size() < data){
            daftarAlamat.add(entry);
            System.out.println("data berhasil di tambahkan");
        }
        else{
            System.out.println("buku alamat penuh");
        }
    }
    
    // menghapus data
    public void hapus(String nama){
        daftarAlamat.removeIf(entry -> entry.getNama().equalsIgnoreCase(nama));
        System.out.println("data dengan nama "+ nama +" sudah di hapus");
    }
    
    // menampilkan seluruh data
    public void tampil(){
        if (daftarAlamat.isEmpty()){
            System.out.println("buku alamat kosong");
        }
        else{
            for (EntryBukuAlamat entry : daftarAlamat){
                entry.print();
                
            }
        }
    }
    
    //update data
    public void update(String nama, String alamat, String noTelp, String email){
        for (EntryBukuAlamat entry : daftarAlamat){
            if(entry.getNama().equalsIgnoreCase(nama)){
                entry.setAlamat(alamat);
                entry.setNoTelp(noTelp);
                entry.setEmail(email);
                System.out.println("data berhasil di update");
                return;
            }
        }
        System.out.println("data dengan nama "+ nama +" tidak di temukan");
    }
    
}

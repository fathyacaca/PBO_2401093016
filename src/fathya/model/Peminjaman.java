/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fathya.model;

import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author WINDOWS
 */
public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tglpinjam;
    private String tglkembali;
    private String tgldikembalikan;
    private String tabelpengembalian;

    public Peminjaman() {
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
    
    public void setTgldikembalikan(String tgldikembalikan){
        this.tgldikembalikan = tgldikembalikan;
    }
    
    public String getTgldikembalikan() {
        return tgldikembalikan;
    }

    public void setTabelPengembalian(String tabelpengembalian) {
        this.tabelpengembalian = tabelpengembalian;
    }
    
    public String getTabelPengembalian() {
        return tabelpengembalian;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fathya.controller;

import fathya.dao.AnggotaDao;
import fathya.dao.BukuDao;
import fathya.dao.PeminjamanDao;
import fathya.model.Anggota;
import fathya.model.Buku;
import fathya.model.Peminjaman;
import fathya.views.FormAnggota;
import fathya.views.FormPeminjaman;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LABSIDOSEN
 */
public class PeminjamanController {

    FormPeminjaman formPeminjaman;
    Peminjaman peminjaman;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;

    public PeminjamanController(FormPeminjaman formPeminjaman) {
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDao();
        anggotaDao = new AnggotaDao();
        bukuDao = new BukuDao();
    }

    public void insert() {
        try {
            peminjaman = new Peminjaman();
            String kodeanggota = formPeminjaman.getCboAnggota()
                    .getSelectedItem().toString().split("-")[0];
            String kodebuku = formPeminjaman.getCboBuku()
                    .getSelectedItem().toString();
            Anggota anggota = anggotaDao.getAnggota(kodeanggota);
            Buku buku = bukuDao.getBuku(kodebuku);
            peminjaman.setAnggota(anggota);
            peminjaman.setBuku(buku);
            peminjaman.setTglpinjam(formPeminjaman.getTxtTglPinjam().getText());
            peminjaman.setTglkembali(formPeminjaman.getTxtTglKembali().getText());
            peminjamanDao.insert(peminjaman);
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bersihForm() {
        isiCboAnggota();
        isiCboBuku();
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }

    private void isiCboAnggota() {
        try {
            List<Anggota> anggotaList = anggotaDao.getAllAnggota();
            formPeminjaman.getCboAnggota().removeAllItems();
            for (Anggota anggota : anggotaList) {
                formPeminjaman.getCboAnggota().
                        addItem(anggota.getKode() + "-" + anggota.getNama());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void isiCboBuku() {
        try {
            List<Buku> bukuList = bukuDao.getAllBuku();
            formPeminjaman.getCboBuku().removeAllItems();
            for (Buku buku : bukuList) {
                formPeminjaman.getCboBuku().addItem(buku.getKode());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

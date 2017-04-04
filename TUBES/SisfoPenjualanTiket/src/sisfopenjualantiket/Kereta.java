/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfopenjualantiket;

import java.util.ArrayList;

/**
 *
 * Kurnia Wisuda Aji (1301150068)
 */
public class Kereta {
    private ArrayList<Gerbong> daftarGerbong;
    private String nama;
    private String jenis;
    private String jurusan;

    public Kereta(String nama, String jenis, String jurusan) {
        this.nama = nama;
        this.jenis = jenis;
        this.jurusan = jurusan;
        daftarGerbong = new ArrayList<>();
    }

    
    public Gerbong getGerbongbyIndex(int x) {
        return this.daftarGerbong.get(x);
    }

    
    public void addDaftarGerbong(Gerbong daftar_gerbong) {
//        daftar_gerbong = new Gerbong();
        this.daftarGerbong.add(this.daftarGerbong.size(), daftar_gerbong);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public void removeGerbong(String kode) {
        for (int i= 0; i<this.daftarGerbong.size();i++) {
            if (this.getGerbongbyIndex(i).getKode().equals(kode)) {
                this.daftarGerbong.remove(i);
            }
        }
        
    }
    
    public int getNGerbong() {
        return this.daftarGerbong.size();
    }

    @Override
    public String toString() {
        return "Kereta{" + "daftarGerbong=" + daftarGerbong + ", nama=" + nama + ", jenis=" + jenis + ", jurusan=" + jurusan + '}';
    }

    
}


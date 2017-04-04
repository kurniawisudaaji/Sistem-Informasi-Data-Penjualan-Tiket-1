/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfopenjualantiket;

import java.util.Date;

/**
 *
 * Kurnia Wisuda Aji (1301150068)
 */
public class Tiket {

    private int kode_tiket;
    private String nama_kereta;
    private String jenis;
    private Date tanggal;
    private Rute rute;
    private long harga;

    public Tiket(int kode_tiket, String nama_kereta, String jenis, Date tanggal, Rute rute, long harga) {
        this.kode_tiket = kode_tiket;
        this.nama_kereta = nama_kereta;
        this.jenis = jenis;
        this.tanggal = tanggal;
        this.rute = rute;
        this.harga = harga;
    }

    public int getKode_tiket() {
        return kode_tiket;
    }

    public void setKode_tiket(int kode_tiket) {
        this.kode_tiket = kode_tiket;
    }

    public String getNama_kereta() {
        return nama_kereta;
    }

    public void setNama_kereta(String nama_kereta) {
        this.nama_kereta = nama_kereta;
    }

    public String getJenis() {
        if (jenis.equals("Exc")) {
            return ("Executive");
        } else if (jenis.equals("Bis")) {
            return ("Business");
        } else if (jenis.equals("Eco")) {
            return ("Economy");
        } else {
            return ("Salah gerbong bosku, cek kelasnya lagi coba ya^^");
        }
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Rute getRute() {
        return rute;
    }

    public void setRute(Rute rute) {
        this.rute = rute;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Tiket{" + "kode_tiket=" + kode_tiket + ", nama_kereta=" + nama_kereta + ", jenis=" + jenis + ", tanggal=" + tanggal + ", rute=" + rute + ", harga=" + harga + '}';
    }

    public void display() {
        System.out.println("Nomor ID     : " + getKode_tiket());
        System.out.println("Nama KA      : " + getNama_kereta());
        System.out.println("Jenis        : " + getJenis());
        System.out.println("Rute         : " + getRute().toString());
        System.out.println("Tanggal      : " + getTanggal());
        System.out.println("Harga        : " + getHarga());
    }

}

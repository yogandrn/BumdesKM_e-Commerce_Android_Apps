package com.yogandrn.bumdeskm.Model;

public class ResponseDetailTransaksi {
    private int id_ongkir;
    private int id_user;
    private int total_transaksi;

    public int getOngkos_kirim() {
        return ongkos_kirim;
    }

    public void setOngkos_kirim(int ongkos_kirim) {
        this.ongkos_kirim = ongkos_kirim;
    }

    private int ongkos_kirim;
    private String  id_transaksi, tgl_transaksi, status, alamat, penerima, resi, no_telp;

    public int getId_ongkir() {
        return id_ongkir;
    }

    public String getResi() { return resi; }

    public void setResi(String resi) { this.resi = resi; }

    public void setId_ongkir(int id_ongkir) {
        this.id_ongkir = id_ongkir;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getTotal_transaksi() {
        return total_transaksi;
    }

    public void setTotal_transaksi(int total_transaksi) {
        this.total_transaksi = total_transaksi;
    }

    public String getTgl_transaksi() {
        return tgl_transaksi;
    }

    public void setTgl_transaksi(String tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
}

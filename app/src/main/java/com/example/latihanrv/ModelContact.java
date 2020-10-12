package com.example.latihanrv;

public class ModelContact {
    private int id;
    private String nama, phone, alamat;

    public ModelContact(int id, String nama, String phone, String alamat) {
        this.id = id;
        this.nama = nama;
        this.phone = phone;
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

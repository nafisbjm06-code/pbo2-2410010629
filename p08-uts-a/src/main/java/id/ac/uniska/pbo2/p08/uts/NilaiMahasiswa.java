//Nama  : Muhammad Nafis
//NPM   : 2410010629

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08.uts;

/**
 *
 * @Muhammad Nafis
 */
public class NilaiMahasiswa {
    private String npm, nama;
    private int tugas, uts, uas;

    public NilaiMahasiswa(String npm, String nama, int tugas, int uts, int uas) {
        this.npm = npm;
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public String getNpm() {
        return this.npm;
    }

    public String getNama() {
        return this.nama;
    }

    public int getTugas() {
        return this.tugas;
    }

    public int getUts() {
        return this.uts;
    }

    public int getUas() {
        return this.uas;
    }

    public double getNilaiAkhir() {
        double nilaiTugas = tugas * 30.0 / 100;
        double nilaiUts = uts * 30.0 / 100;
        double nilaiUas = uas * 40.0 / 100;

        return nilaiTugas + nilaiUts + nilaiUas;
    }

    public String getNilaiHuruf() {
        double hasil = getNilaiAkhir();
        String grade;

        if (hasil < 40) {
            grade = "E";
        } else if (hasil < 60) {
            grade = "D";
        } else if (hasil < 65) {
            grade = "C";
        } else if (hasil < 70) {
            grade = "C+";
        } else if (hasil < 75) {
            grade = "B";
        } else if (hasil < 80) {
            grade = "B+";
        } else {
            grade = "A";
        }

        return grade;
    }
}

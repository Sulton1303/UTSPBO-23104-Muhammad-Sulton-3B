/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

import PesanKamarHotel.PesanKamar;

/**
 *
 * @author Lenovo
 */
public class Hotel implements PesanKamar {
    private final String[] kamar = new String[5];
    private int jumlahPesanan = 0;

    public Hotel() {
        for (int i = 0; i < kamar.length; i++) {
            kamar[i] = "Kosong";
        }
    }

    @Override
    public void pemesananKamar(int nomorKamar) {
        if (nomorKamar >= 0 && nomorKamar < kamar.length && kamar[nomorKamar].equals("Kosong")) {
            kamar[nomorKamar] = "Dipesan";
            jumlahPesanan++;
            System.out.println("Kamar " + nomorKamar + " berhasil dipesan.");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    @Override
    public void pemesananKamar(int nomorKamar, int jumlahOrang) {
        if (nomorKamar >= 0 && nomorKamar < kamar.length) {
            if (kamar[nomorKamar].equals("Kosong")) {
                kamar[nomorKamar] = "Dipesan oleh " + jumlahOrang + " orang";
                jumlahPesanan++;
                System.out.println("Kamar " + nomorKamar + " berhasil dipesan untuk " + jumlahOrang + " orang.");
            } else {
                System.out.println("Kamar tidak tersedia.");
            }
        } else {
            System.out.println("Nomor kamar tidak valid.");
        }
    }

    @Override
    public void cekKetersediaan() {
        System.out.println("Ketersediaan Kamar:");
        for (int i = 0; i < kamar.length; i++) {
            System.out.println("Kamar " + i + ": " + kamar[i]);
        }
    }

    @Override
    public void lihatPesanan() {
        System.out.println("Jumlah pesanan saat ini: " + jumlahPesanan);
    }
    
    public void batalkanPesanan(int nomorKamar) {
    if (nomorKamar >= 0 && nomorKamar < kamar.length && !kamar[nomorKamar].equals("Kosong")) {
        kamar[nomorKamar] = "Kosong"; // Mengubah status kamar menjadi kosong
        jumlahPesanan--; // Mengurangi jumlah pesanan
        System.out.println("Kamar " + nomorKamar + " berhasil dibatalkan dan sekarang tersedia.");
    } else {
        System.out.println("Kamar tidak dapat dibatalkan karena belum ada yang melakukan booking pada kamar tersebut");
    }
}

}
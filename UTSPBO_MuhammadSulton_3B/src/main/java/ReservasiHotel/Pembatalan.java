/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public class Pembatalan {
    private List<Integer> permintaanPembatalan; // Menyimpan permintaan pembatalan
    private Hotel hotel;

    public Pembatalan(Hotel hotel) {
        this.hotel = hotel;
        this.permintaanPembatalan = new ArrayList<>();
    }

    // Method untuk menyimpan permintaan pembatalan
    public void ajukanPembatalan(int nomorKamar) {
        permintaanPembatalan.add(nomorKamar);
        System.out.println("Permintaan pembatalan untuk kamar " + nomorKamar + " telah diajukan.");
    }

    // Method untuk melihat permintaan pembatalan
    public void lihatPermintaan() {
        if (permintaanPembatalan.isEmpty()) {
            System.out.println("Tidak ada permintaan pembatalan.");
        } else {
            System.out.println("Permintaan Pembatalan Kamar:");
            for (int nomorKamar : permintaanPembatalan) {
                System.out.println("- Kamar " + nomorKamar);
            }
        }
    }

    // Method untuk menyetujui pembatalan
    public void accPembatalan(int nomorKamar) {
        if (permintaanPembatalan.contains(nomorKamar)) {
            // Hapus permintaan dari daftar dan batalkan kamar
            permintaanPembatalan.remove(Integer.valueOf(nomorKamar));
            hotel.batalkanPesanan(nomorKamar); // Memanggil metode di Hotel untuk membatalkan kamar
            System.out.println("Pembatalan untuk kamar " + nomorKamar + " telah disetujui.");
        } else {
            System.out.println("Permintaan pembatalan untuk kamar " + nomorKamar + " tidak ditemukan.");
        }
    }
}

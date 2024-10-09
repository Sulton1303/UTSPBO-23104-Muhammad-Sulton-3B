/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class TamuVIP {
    private ArrayList<String> daftarTamuVIP = new ArrayList<>();

    public void tambahTamuVIP(String nama) {
        daftarTamuVIP.add(nama);
    }

    public void lihatTamuVIP() {
        System.out.println("Daftar Tamu VIP:");
        if (daftarTamuVIP.isEmpty()) {
            System.out.println("Tidak ada tamu VIP yang terdaftar.");
        } else {
            for (String tamu : daftarTamuVIP) {
                System.out.println(tamu);
            }
        }
    }

    public void hapusTamuVIP(String nama) {
        if (daftarTamuVIP.remove(nama)) {
            System.out.println("Tamu VIP " + nama + " telah dihapus.");
        } else {
            System.out.println("Tamu VIP " + nama + " tidak ditemukan.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

/**
 *
 * @author Lenovo
 */
public class Customer extends LevelAkses {
    public Customer() {
        super("Customer");
    }
    
    @Override
    public void tampilkanMenu() {
        System.out.println("=============================================");
        System.out.println("    Selamat Datang Di Hotel Karawang Indah ");
        System.out.println("=============================================");
        System.out.println(" Menu Customer: ");
        System.out.println(" 1. Pesan Kamar (0-4) ");
        System.out.println(" 2. Pesan Kamar dengan Jumlah Orang ");
        System.out.println(" 3. Cek Ketersediaan Kamar ");
        System.out.println(" 4. Lihat Detail Pesanan ");
        System.out.println(" 5. Ajukan Pembatalan Pesanan ");
        System.out.println(" 6. Berikan Ulasan ");
        System.out.println(" 0. Kembali ");
        System.out.println("=============================================");
        System.out.print("Silahkan pilih menu di atas: ");
    }
}

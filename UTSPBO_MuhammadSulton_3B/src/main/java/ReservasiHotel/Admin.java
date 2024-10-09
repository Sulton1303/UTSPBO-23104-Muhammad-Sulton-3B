/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

/**
 *
 * @author Lenovo
 */
public class Admin extends LevelAkses {
    public Admin() {
        super("Admin");
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("=============================================");
        System.out.println("\nMenu Admin:");
        System.out.println("1. Cek Ketersediaan Kamar");
        System.out.println("2. Lihat Permintaan Pembatalan");
        System.out.println("3. Acc Pembatalan Pesanan");
        System.out.println("4. Pendaftaran Tamu VIP");
        System.out.println("5. Lihat Daftar Tamu VIP");
        System.out.println("6. Hapus Tamu VIP");
        System.out.println("0. Kembali");
        System.out.println("=============================================");
        System.out.print("Silahkan pilih menu di atas: ");
            
    }
}

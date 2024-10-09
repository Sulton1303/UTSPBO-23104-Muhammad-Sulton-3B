/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ReservasiHotel;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class HotelBeraksi {

    public static void main(String[] args) {
        // Membuat objek-objek yang diperlukan
        Hotel hotel = new Hotel();
        Pembatalan pembatalan = new Pembatalan(hotel);
        TamuVIP tamuVIP = new TamuVIP();
        Admin admin = new Admin();
        Customer customer = new Customer();
        Ulasan ulasan = new Ulasan(); 

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Memilih untuk masuk sebagai Admin atau Customer
        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Masuk sebagai Admin");
            System.out.println("2. Masuk sebagai Customer");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next();
            }
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    adminMenu(admin, hotel, tamuVIP, pembatalan, scanner);
                    break;
                case 2:
                    customerMenu(customer, hotel, pembatalan, ulasan, scanner); 
                    break;
                case 0:
                    System.out.println("Terima kasih karena telah singgah di Hotel Karawang Indah.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }

    // Menu admin
    public static void adminMenu(Admin admin, Hotel hotel, TamuVIP tamuVIP, Pembatalan pembatalan, Scanner scanner) {
        int pilihan;
        System.out.println("Anda masuk sebagai Admin.");
        do {
            admin.tampilkanMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next();
            }
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hotel.cekKetersediaan();
                    break;
                case 2:
                    pembatalan.lihatPermintaan();
                    break;
                case 3:
                    System.out.print("Masukkan nomor kamar yang ingin disetujui pembatalannya: ");
                    int nomorKamar = scanner.nextInt();
                    pembatalan.accPembatalan(nomorKamar);
                    break;
                case 4:
                    System.out.print("Masukkan nama tamu VIP: ");
                    scanner.nextLine();
                    String vipName = scanner.nextLine();
                    tamuVIP.tambahTamuVIP(vipName);
                    System.out.println("Tamu VIP " + vipName + " telah ditambahkan.");
                    break;
                case 5:
                    tamuVIP.lihatTamuVIP();
                    break;
                case 6:
                    System.out.print("Masukkan nama tamu VIP yang ingin dihapus: ");
                    scanner.nextLine();
                    String hapusVipName = scanner.nextLine();
                    tamuVIP.hapusTamuVIP(hapusVipName);
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }

    // Menu customer
    public static void customerMenu(Customer customer, Hotel hotel, Pembatalan pembatalan, Ulasan ulasan, Scanner scanner) {
        int pilihan;
        System.out.println("Anda masuk sebagai Customer.");
        
        do {
            customer.tampilkanMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next();
            }
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    int roomNumber = scanner.nextInt();
                    hotel.pemesananKamar(roomNumber);
                    break;
                case 2:
                    System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
                    roomNumber = scanner.nextInt();
                    System.out.print("Masukkan jumlah orang: ");
                    int jumlahOrang = scanner.nextInt();
                    hotel.pemesananKamar(roomNumber, jumlahOrang);
                    break;
                case 3:
                    hotel.cekKetersediaan();
                    break;
                case 4:
                    hotel.lihatPesanan();
                    break;
                case 5:
                    System.out.print("Masukkan nomor kamar yang ingin dibatalkan: ");
                    int cancelledRoom = scanner.nextInt();
                    pembatalan.ajukanPembatalan(cancelledRoom);
                    break;
                case 6:
                    int userReview = 0;
                    do {
                        System.out.print("Masukkan ulasan (1-5): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("Input tidak valid. Harap masukkan angka.");
                            scanner.next();
                        }
                        userReview = scanner.nextInt();
                        if (userReview < 1 || userReview > 5) {
                            System.out.println("Ulasan harus antara 1 hingga 5.");
                        }
                    } while (userReview < 1 || userReview > 5); 

                    ulasan.tambahUlasan("Ulasan dari customer: " + userReview);
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }
}

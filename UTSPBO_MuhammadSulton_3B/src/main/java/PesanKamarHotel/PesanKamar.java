/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PesanKamarHotel;

/**
 *
 * @author Lenovo
 */
public interface PesanKamar {
    void pemesananKamar(int roomNumber);
    void pemesananKamar(int roomNumber, int jumlahOrang);
    void cekKetersediaan();
    void lihatPesanan();
}

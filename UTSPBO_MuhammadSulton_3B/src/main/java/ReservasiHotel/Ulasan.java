/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

import java.util.Stack;
/**
 *
 * @author Lenovo
 */
public class Ulasan {
     private Stack<String> daftarUlasan = new Stack<>();

    public void tambahUlasan(String ulasanBaru) {
        daftarUlasan.push(ulasanBaru);
        System.out.println("Ulasan ditambahkan: " + ulasanBaru);
    }
}
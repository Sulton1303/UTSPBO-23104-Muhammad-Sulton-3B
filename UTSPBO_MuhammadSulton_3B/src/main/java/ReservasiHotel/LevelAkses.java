/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

/**
 *
 * @author Lenovo
 */
public abstract class LevelAkses {
    private String role;

    public LevelAkses(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    // Method abstrak yang harus diimplementasikan di subclass
    public abstract void tampilkanMenu();
}

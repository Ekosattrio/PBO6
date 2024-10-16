/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author Advan
 */

public class mainloop {
    public static void main(String[] args) {
        // Bilangan Prima dan Bukan Prima dari 0-20
        BilanganPrima bilanganPrima = new BilanganPrima();
        bilanganPrima.cariPrima(20);

        // Bilangan Ganjil dan Genap dari 0-20
        BilanganGanjilGenap bilanganGanjilGenap = new BilanganGanjilGenap();
        bilanganGanjilGenap.cariGanjilGenap(20);

        // Huruf Z-A
        HurufZA hurufZA = new HurufZA();
        hurufZA.cetakHuruf();

        // Lagu Anak Ayam Turun N
        AnakAyam anakAyam = new AnakAyam();
        anakAyam.laguAnakAyam(10);
    }
}


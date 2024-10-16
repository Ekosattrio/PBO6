/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author Advan
 */

public class BilanganGanjilGenap {
    public void cariGanjilGenap(int max) {
        System.out.println("Bilangan Ganjil dan Genap dari 0 - " + max);
        for (int i = 0; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author Advan
 */

public class AnakAyam {
    public void laguAnakAyam(int n) {
        System.out.println("Lagu Anak Ayam Turun " + n);
        for (int i = n; i > 0; i--) {
            if (i > 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu Tinggal Induknya");
            }
        }
    }
}


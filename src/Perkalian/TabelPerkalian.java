/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perkalian;

/**
 *
 * @author Advan
 */

public class TabelPerkalian {
    public void cetakTabel(int n) {
        if (n > 10) {
            System.out.println("Maksimum nilai n adalah 10");
            return;
        }

        System.out.println("Tabel Perkalian " + n + "x" + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}


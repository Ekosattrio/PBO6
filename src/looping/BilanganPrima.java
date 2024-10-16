/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looping;

/**
 *
 * @author Advan
 */

public class BilanganPrima {
    public void cariPrima(int max) {
        System.out.println("Bilangan Prima dan Bukan Prima dari 0 - " + max);
        for (int i = 0; i <= max; i++) {
            if (isPrima(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " adalah bukan bilangan prima");
            }
        }
    }

    private boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


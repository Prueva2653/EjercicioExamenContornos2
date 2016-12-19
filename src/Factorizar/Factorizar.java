/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorizar;

/**
 *
 * @author dfernandezrivas
 */
public class Factorizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int j;
        int f;

        j = 8;

        int i = 0;
        f = CodigoPrincipal(j, i);

        Imprimirpantalla(f);

    }

    private static void Imprimirpantalla(int f) {
        System.out.println(f);
    }

    private static int CodigoPrincipal(int j, int i) {
        int f;
        if (j == 0) {
            f = 1;
        } else {
            f = 1;
            for (i = j; i >= 1; i--) {
                f = f * i;
            }
        }
        return f;
    }

}

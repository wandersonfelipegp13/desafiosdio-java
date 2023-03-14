package bancopan;

import java.util.Scanner;

/**
 * Programa que calcula o valor de H com N termos:
 * H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
 */
public class SomaDeHComNTermos {
    public static void main(String[] args) {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        for (int i = 1; i < n; i++) {
            h += (double) 1/i;
        }
        System.out.println(Math.round(h));
    }
}

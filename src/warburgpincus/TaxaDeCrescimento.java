package warburgpincus;

import java.util.Scanner;

/**
 * Esse programa calcula a quantidade de
 * anos que a população do país A leva
 * para atingir, ou superar, a população
 * do país B, baseados em sua taxa de
 * crescimento.
 */
public class TaxaDeCrescimento {

    public static void main(String[] args) {
        double a, b;
        Scanner input = new Scanner(System.in);
        double taxa = 1.5;

        a = input.nextInt();
        b = input.nextInt();

        int anos = 1;

        while (a < b) {
            a += (a * taxa / 100);
            anos++;
        }

        System.out.println(anos + " anos");
    }

}

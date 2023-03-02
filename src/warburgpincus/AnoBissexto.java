package warburgpincus;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int ano;

        ano = ent.nextInt();

        // Anos ímpares e anos pares, que não são
        // multíplos de 4, não são bissextos. Então,
        // não precisamos validar se o ano é impar,
        // pois, qualquer número impar, dividido por
        // um número par, resulta em algum resto, e
        // isso é feito quando verificamos se o ano
        // é múltiplo de 4. Sendo assim, só precisamos
        // validar se o ano é multiplo de 4.
        if (ano % 4 != 0) {
            System.out.println("Nao Bissexto");
        }
        else {
            System.out.println("Bissexto");
        }
    }
}

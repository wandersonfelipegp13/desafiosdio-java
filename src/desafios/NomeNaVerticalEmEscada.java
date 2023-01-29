package desafios;

import java.util.Scanner;

/**
 * Programa que solicita o nome do usuário e o imprima
 * de forma a mostrar o nome em formato de escada.
 */
public class NomeNaVerticalEmEscada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        int tamanhoPalavra = palavra.length();
        String linha = "";

        for (int i = 0; i < tamanhoPalavra; i++) {
            linha += palavra.charAt(i);
            System.out.println(linha);
        }
    }

}

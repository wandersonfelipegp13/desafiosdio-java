package desafios;
import java.util.Scanner;

/**
 * Programa para uma loja de tintas.
 *
 * O programa pede o tamanho, em metros quadrados,
 * da área a ser pintada, e então, informa a
 * quantidade de latas ou galões de tinta a serem
 * comprados, assim como o preço.
 *
 * 1l de tinta = 6m²
 * Lata de 18l = R$ 80,00.
 * Galão de 3,6l = R$ 25,00.
 */
public class LojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double metrosQuadradosPorTinta = 6;
        final double valorLata = 80;
        final double litrosPorLata = 18;
        final double valorGalao = 25;
        final double litrosPorGalao = 3.6;

        double areaCoberta = scanner.nextDouble();

        double quantidadeDeLitros = areaCoberta / metrosQuadradosPorTinta;
        int quantidadeLatas = (int) Math.ceil(quantidadeDeLitros / litrosPorLata);
        int quantidadeGaloes = (int) Math.ceil(quantidadeDeLitros / litrosPorGalao);

        System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): "
                + quantidadeLatas + " no valor R$ "
                + quantidadeLatas * valorLata);
        System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): "
                + quantidadeGaloes + " no valor R$ "
                + quantidadeGaloes * valorGalao);
    }
}
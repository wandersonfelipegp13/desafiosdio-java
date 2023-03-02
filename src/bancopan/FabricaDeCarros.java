package bancopan;

import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int percentualImpostos = scan.nextInt();

        int custoConsumidor = (custoFabrica * porcentagemDistribuidor) / 100;
        int custoImpostos = (custoFabrica * percentualImpostos) / 100;

        System.out.println(custoFabrica + custoConsumidor + custoImpostos);
    }
}

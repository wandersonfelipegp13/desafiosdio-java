package warburgpincus;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Esse programa pede o tamanho, em MB, de
 * um arquivo para download e a velocidade,
 * em Mbps, de um link de Internet e calcula
 * o tempo aproximado de download do arquivo,
 * em minutos, usando este link.
 */
public class TempoDeDownload {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tmhMB = sc.nextFloat();
        double tmhMbps = sc.nextFloat();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println( df.format( ((tmhMB * 8) / tmhMbps) / 600 ));
    }
}

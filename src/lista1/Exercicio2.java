package lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int distancia, combustivel;
        double mediaConsumo;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        distancia = ler.nextInt();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        combustivel = ler.nextInt();

        // Converte (faz um cast) do tipo int para o tipo double
        mediaConsumo = (double) distancia / combustivel;

        System.out.printf("A média de consumo por km é: %.2f km/l", mediaConsumo);
    }
}

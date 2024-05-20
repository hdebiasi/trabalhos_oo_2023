package lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = ler.nextInt();

        System.out.printf("Sucessor de %d é %d\n", numero, (numero + 1));
        System.out.printf("Antecessor de %d é %d", numero, (numero - 1));
    }
}

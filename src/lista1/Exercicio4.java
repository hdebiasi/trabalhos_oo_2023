package lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String sexo;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o sexo da pessoa [M|F]: ");
        sexo = ler.next().toUpperCase();

        if (sexo.equals("F")) {
            System.out.println("Sexo feminino");
        } else if (sexo.equals("M")) {
            System.out.println("Sexo masculino");
        } else {
            System.out.println("Entrada inválida!");
        }
    }
}

package Respostas;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao04 {
    public static void main(String[] args) {

        int numUsuario;
        int quantNum = 0;
        ArrayList<Integer> numLidos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numUsuario = scanner.nextInt();

        if (numUsuario < 0){
            System.out.println("Quantidade de números digitados: " + numUsuario + "Média dos números digitados: " +numUsuario);
        }
        else {
            while (numUsuario >= 0){
                numLidos.add(numUsuario);
                quantNum++;
                System.out.println("Informe o próximo número: ");
                numUsuario = scanner.nextInt();
            }
        }

        if (quantNum > 0){
            double soma = 0;
            for (int numControle : numLidos){
                soma += numControle;
            }
            double media = soma / quantNum;
            System.out.printf("A quantidade de números digitados foi: %d A média dos números digitados foi: %.2f%n", quantNum, media);
        }
    }
}

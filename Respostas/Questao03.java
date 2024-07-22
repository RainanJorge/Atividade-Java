package Respostas;

import java.util.Scanner;

public class Questao03 {
    public static final int ALUNOS = 3;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[ALUNOS];
        float media = 0;

        for (int i = 0; i < ALUNOS; i++) {
            System.out.println("Informe a nota do aluno(a): ");
            notas[i] = scanner.nextInt();
            media += notas[i];
        }

        media = media / ALUNOS;
        System.out.println("A media das notas foi: " + media);

        int notaAcimaMedia = 0;
        int notaAbaixoMedia = 0;

        for (float nota : notas){
            if (nota > media) {
                notaAcimaMedia += 1;
            }
            if (nota < media) {
                notaAbaixoMedia += 1;
            }
        }

        System.out.println("Notas acima da média: " + notaAcimaMedia);
        System.out.println("Notas abaixo da media: " + notaAbaixoMedia);
    }
}

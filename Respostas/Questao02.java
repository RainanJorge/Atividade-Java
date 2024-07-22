package Respostas;

public class Questao02 {
    public static void main(String[] args) {

        int limite = 30;
        int primNum = 1;
        int secNum = 1;

        System.out.println(primNum + " " + secNum + " ");

        for (int i = 1; i <= limite; i++) {
            int proxNum = primNum + secNum;
            System.out.println(proxNum + "");
            primNum = secNum;
            secNum = proxNum;
        }
    }
}
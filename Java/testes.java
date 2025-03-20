import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = 10;
        double dob = 0.5;
        char cr = '1';
        boolean boo = true;
        int dia = 1;
        int i;
        Scanner texto = new Scanner(System.in);
        String nome = texto.nextLine();
        System.out.println("Nome: " + nome);

        if (num == 10) {
            System.out.print("Eu gosto de arroz \n");

        } else {
            System.out.print("Eu gosto de feijão");
        }

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
        }

        for (i = 0; i <= 20; i++) {
            System.out.println();

        }



    }
}
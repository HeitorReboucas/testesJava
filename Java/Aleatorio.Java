import java.security.Principal;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner socorro = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeroSecreto = aleatorio.nextInt(10) + 1;//Numero aleatorio de 1 a 10
        int tentativa = 0;
        System.out.println("Coco: " + numeroSecreto);
        while (tentativa != numeroSecreto) {
            System.out.println("Advinhe o número secreto de 1 a 10");
            tentativa = socorro.nextInt();
            if (tentativa > numeroSecreto) {
                System.out.println("Tente um número menor");

            } else if (tentativa < numeroSecreto) {
                System.out.println("Tente um numero maior");

            }

        }


    }
}
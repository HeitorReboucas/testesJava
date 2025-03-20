import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


Scanner socorro = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        String nome = socorro.nextLine();

        System.out.println("Escreva sua idade");
        int idade = socorro.nextInt();

        System.out.println("Escreva sua altura");
        int altura = socorro.nextInt();

        System.out.println("Olá, " + nome + " você tem " + idade + " anos e mede " + altura + "cm");

        
    }

}
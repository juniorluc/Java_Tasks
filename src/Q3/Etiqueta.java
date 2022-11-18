package Q3;

import java.util.Scanner;

public class Etiqueta {

    static void pulaLinha() {
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = entrada.nextLine();

        System.out.print("Qual é o seu endereço? ");
        String endereco = entrada.nextLine();

        System.out.print("Qual é o seu bairro? ");
        String bairro = entrada.nextLine();

        System.out.print("Qual é o seu CEP? ");
        String cep = entrada.nextLine();

        pulaLinha();

        System.out.println("Etiqueta de informação pessoal");
        System.out.println("******************************");
        System.out.println("Nome: " + nome +"\nEndereço: " + endereco +"\nBairro: " + bairro + "\nCEP: " +cep);
        System.out.println("******************************");

    }

}

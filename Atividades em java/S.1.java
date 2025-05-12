//1 - Faça um programa que permita ao usuário digitar o seu nome e em seguida mostre o nome do usuário de trás para frente utilizando somente letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou minúsculas.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();
        nome = nome.toUpperCase();
        String nomeI = new StringBuilder(nome).reverse().toString();
        System.out.println("Seu nome ao contrário é: " + nomeI);

        s.close();
    }
}
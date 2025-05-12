//2 - Escreva um programa que pergunte ao usuário um número e após, escreva na tela a soma total de 1 até o número lido. Exemplo: 5: 1 + 2 + 3 + 4 + 5 = 15

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva o valor para a soma: ");
        int valor=s.nextInt();
        int soma = 0;
        for (int i = 1; i <= valor; i++) {
            soma=soma+i;
        }
        System.out.print("O valor da soma é: "+soma);
        s.close();
    }
}

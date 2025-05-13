//2 - Dado uma string com uma frase informada pelo usuário (incluindo espaços em branco), conte:
//
//quantos espaços em branco existem na frase.
//quantas vezes aparecem as vogais a, e, i, o, u

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = s.nextLine().toLowerCase();
        int espacos = 0;
        int vogalA = 0;
        int vogalE = 0;
        int vogalI = 0;
        int vogalO = 0;
        int vogalU = 0;
        for (char c : frase.toCharArray()) {
            if (c == ' ') {
                espacos++;
            } else if (c == 'a') {
                vogalA++;
            } else if (c == 'e') {
                vogalE++;
            } else if (c == 'i') {
                vogalI++;
            } else if (c == 'o') {
                vogalO++;
            } else if (c == 'u') {
                vogalU++;
            }
        }
        System.out.println("Número de espaços: " + espacos);
        System.out.println("Número de vezes que cada vogal aparece");
        System.out.println("A: " + vogalA);
        System.out.println("E: " + vogalE);
        System.out.println("I: " + vogalI);
        System.out.println("O: " + vogalO);
        System.out.println("U: " + vogalU);
        s.close();
    }
}

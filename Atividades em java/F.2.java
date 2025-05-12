//2 - Crie uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.

import java.util.Scanner;

class Somas {
    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = s.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = s.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = s.nextInt();
        int total = Somas.soma(num1, num2, num3);
        System.out.println("A soma dos três números é: " + total);
        s.close();
    }
}
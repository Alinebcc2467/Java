//5 - Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em uma variável inteira), imprima cada um dos seus dígitos por extenso. Exemplo:
//
// Entre o número: 4571
// Resultado: quatro, cinco, sete, um
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = s.nextInt();
        String numeroStr = Integer.toString(numero);
        String[] extenso = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        System.out.print("Cada número por extenso é: ");
        for (char digito : numeroStr.toCharArray()) {
            System.out.print(extenso[Character.getNumericValue(digito)] + ", ");
        }
        s.close();
    }
}
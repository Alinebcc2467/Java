//5 - Crie uma função que receba o comprimento de cada um dos três lados de um triângulo e retorne se esse triângulo é isósceles 
//(dois lados iguais e um diferente), escaleno (todos os lados diferentes), equilátero (todos os lados são iguais) ou se não é um 
//triangulo (algum lado é maior que a soma dos outros dois lados).

import java.util.Scanner;

class Triangulos {
    public static String tiposTri(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return "Não é um triângulo";
        }
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor de cada lado do triângulo.");
        System.out.print("Lado 1: ");
        double a = s.nextDouble();
        System.out.print("Lado 2: ");
        double b = s.nextDouble();
        System.out.print("Lado 3: ");
        double c = s.nextDouble();
        System.out.println("O triângulo é: " + Triangulos.tiposTri(a, b, c));

        s.close();
    }
}

//7 - Faça um programa que leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. A fórmula de conversão é: ℉ = (9 × ℃ + 160) ÷ 5, na qual ℉ é a temperatura em Fahrenheit e ℃ é a temperatura em Celsius.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva o valor para calcular: ");
        float valor = s.nextFloat();
        float f = ((valor * 9) + 160)/5;
        System.out.println("A temperatura " + valor + "°C em Fahrenheit é " + f + "°F");
        s.close();
    }
}

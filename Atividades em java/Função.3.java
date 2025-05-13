//3 - Faça um programa com duas funções, uma que recebe uma temperatura em Fahrenheit e retorna em Celcius e outra que faz o inverso.
//Lembrando que as fórmulas são ℃ = (℉ - 32) ÷ 1,8 e ℉ = ℃ × 1,8 + 32.

import java.util.Scanner;

class Conversor {
    public static double FpC(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
    public static double CpF(double celsius) {
        return celsius * 1.8 + 32;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o tipo de conversão desejada: C = Celcius para Fahrenheit ou F = Fahrenheit para Celcius: ");
        String escolha = s.nextLine();
        escolha = escolha.toUpperCase();
        if (escolha.equals("C")){
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = s.nextDouble();
            System.out.print("Temperatura em Fahrenheit: "+ Conversor.CpF(celsius));
        }
        else if(escolha.equals("F")){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = s.nextDouble();
            System.out.print("Temperatura em Celsius: "+ Conversor.FpC(fahrenheit));
        }
        else{
            System.out.println("O caractere digitado não corresponde as alternativas mostradas");
        }
        s.close();
    }
}

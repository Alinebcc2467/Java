//9 - Faça um programa que efetue a leitura de três valores numéricos representando os lados de um triângulo. O programa deverá 
//verificar e informar se os lados fornecidos formam realmente um triângulo (cada lado é menor que a soma dos outros dois lados). 
//Se esta condição for verdadeira, deverá ser indicado qual tipo de triângulo foi formado: isósceles (dois lados iguais e um 
//diferente), escaleno (todos os lados diferentes) ou eqüilátero (todos os lados são iguais).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Um triângulo tem 3 lados. Digite valor de cada lado do Triângulo.");
        System.out.print("Lado 1: ");
        int a=s.nextInt();
        System.out.print("Lado 2: ");
        int b=s.nextInt();
        System.out.print("Lado 3: ");
        int c=s.nextInt();

        if (a==b && b==c){
            System.out.println("É um Triângulo Equilátero");
        }
        else if(a==b || a==c || b==c){
            System.out.println("É um Triângulo Isósceles");
        }
        else{
            System.out.println("É um Triângulo Escaleno");
        }
        s.close();
    }
}

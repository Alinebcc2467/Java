//14 - Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva o tamanho em m² da área que será pintada: ");
        int area=s.nextInt();
        float latas = (float) (area / 3) /18;
        if(latas%18==0) {
            int preco = (int) (latas * 80);
            System.out.println("Serão necessária " + latas + " latas de tinta, Você irá gastar: " + preco + "R$.");
        }
        else{
            latas++;
            int preco = (int) (latas * 80);
            System.out.println("Serão necessária " + latas + " latas de tinta, Você irá gastar: " + preco + "R$.");
            s.close();
        }
    }
}

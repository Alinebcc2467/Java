//6 - Escrever um programa que lê um vetor com 20 números inteiros e o escreve na tela. Troque, a seguir, o 1º elemento com o último, o 2º com o penúltimo etc. até o 10º com o 11º e escreva na tela o vetor N assim modificado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            nums[i] = s.nextInt();
        }
        System.out.println("\nVetor 1:");
        for (int b = 0; b < nums.length; b++) {
            System.out.println("nums[" + b + "] = " + nums[b]);
        }
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println("\nVetor 2:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
        s.close();

    }
}
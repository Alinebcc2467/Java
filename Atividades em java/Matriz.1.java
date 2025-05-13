//1 - Faça um programa para ler e imprimir uma matriz 2 × 4 de números inteiros.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] nums = new int[2][4];

        for (int l = 0; l < nums.length; l++) {
            for (int c = 0; c < nums[l].length; c++) {
                System.out.print("Digite o número para posição [" + l + "][" + c + "]: ");
                nums[l][c] = s.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        for (int c = 0; c < nums[0].length; c++) {
            System.out.print(nums[0][c] + "\t");
        }
        System.out.println();
        for (int c = 0; c < nums[1].length; c++) {
            System.out.print(nums[1][c] + "\t");
        }
        System.out.println();

        s.close();
    }
}

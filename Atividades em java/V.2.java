//2 - Faça um programa que copie o conteúdo de um vetor em um segundo vetor.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums1 = new int[5];
        int[] nums2 = new int[5];
        for (int a = 0; a < 5; a++) {
            System.out.print("Escreva o número desejado: ");
            nums1[a] = s.nextInt();
        }
        System.arraycopy(nums1, 0, nums2, 0, nums1.length);
        System.out.println("Vetor1:");
        for (int j = 0; j < nums1.length; j++) {
            System.out.print("Posição[" + j + "] = " + nums2[j]+"; ");
        }
        System.out.println();
        System.out.println("Vetor2:");
        for (int j = 0; j < nums2.length; j++) {
            System.out.print("Posição[" + j + "] = " + nums2[j]+"; ");
        }
        s.close();
    }
}
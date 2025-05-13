//2 - Dada a seguinte matriz, calcule:
//1	2	3	4
//5	6	7	8
//9	10	11	12
//13	14	15	16
//A soma dos elementos de primeira coluna;
//O produto dos elementos da primeira linha;
//A soma de todos os elementos;
//O produto da diagonal principal.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int coluna = 0;
        int linha = 1;
        int Total = 0;
        int diagonal = 1;
        for (int i = 0; i < nums.length; i++) {
            coluna += nums[i][0];
            Total += nums[i][0] + nums[i][1] + nums[i][2] + nums[i][3];
            diagonal *= nums[i][i];
        }
        for (int j = 0; j < nums[0].length; j++) {
            linha *= nums[0][j];
        }
        System.out.println("Soma da primeira coluna: " + coluna);
        System.out.println("Produto da primeira linha: " + linha);
        System.out.println("Soma de todos os elementos: " + Total);
        System.out.println("Produto da diagonal principal: " + diagonal);

        s.close();
    }
}

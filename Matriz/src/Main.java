import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] nums = new int[3][3];
        System.out.print("O tamanho da matriz é 3x3, portanto pode receber 9 números. Quantos números você deseja adicionar?: ");
        int quantidade = s.nextInt();
        while (quantidade < 0 || quantidade > 9) {
            System.out.print("O tamanho inválido. Digite um número entre 1 e 9 para adicionar: ");
            quantidade = s.nextInt();
        }
        int a = 0;
        while (a < quantidade) {
            System.out.print("Escreva a linha (de 0 a 2) para adicionar o número desejado: ");
            int l = s.nextInt();
            System.out.print("Escreva a coluna (de 0 a 2) para adicionar o número desejado: ");
            int c = s.nextInt();
            if (l >= 0 && l < 3 && c >= 0 && c < 3) {
                System.out.print("Escreva o número desejado: ");
                int num = s.nextInt();
                nums[l][c] = num;
                a++;
            } else {
                System.out.println("Posição inválida. Por favor, insira valores entre 0 e 2 para linha e coluna.");
            }
        }
        System.out.println("Matriz:");
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
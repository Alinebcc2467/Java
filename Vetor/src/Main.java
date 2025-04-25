import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.print("O tamanho do vetor é 5. Quantos números você deseja adicionar?: ");
        int quantidade = s.nextInt();
        while (quantidade <= 0 || quantidade >= 5) {
            System.out.print("O tamanho é inválido. Digite um número de 1 a 4 para adicionar: ");
            quantidade = s.nextInt();
        }
        int a = 0;
        while (a < quantidade) {
            System.out.print("Escreva a posição (de 0 a 4) para adicionar o número desejado: ");
            int i = s.nextInt();
            if (i >= 0 && i < 5) {
                System.out.print("Escreva o número desejado: ");
                int num = s.nextInt();
                nums[i] = num;
                a++;
            } else {
                System.out.println("Posição inválida. Por favor, insira um valor entre 0 e 4.");
            }
        }
        System.out.println("Vetor:");
        for (int j = 0; j < nums.length; j++) {
        System.out.println("nums[" + j + "] = " + nums[j]);
        }
        s.close();
    }
}
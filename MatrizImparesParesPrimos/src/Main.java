import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] nums = new int[4][4];
        System.out.print("O tamanho da matriz é 4x4, portanto pode receber 16 números. Quantos números você deseja adicionar?: ");
        int quantidade = s.nextInt();
        while (quantidade < 0 || quantidade > 16) {
            System.out.print("O tamanho inválido. Digite um número entre 0 e 16 para adicionar: ");
            quantidade = s.nextInt();
        }
        int a = 0;
        while (a < quantidade) {
            System.out.print("Escreva a linha (de 0 a 3) para adicionar o número desejado: ");
            int l = s.nextInt();
            System.out.print("Escreva a coluna (de 0 a 3) para adicionar o número desejado: ");
            int c = s.nextInt();
            if (l >= 0 && l < 4 && c >= 0 && c < 4) {
                System.out.print("Escreva o número desejado: ");
                int num = s.nextInt();
                nums[l][c] = num;
                a++;
            } else {
                System.out.println("Posição inválida. Por favor, insira valores entre 0 e 3 para linha e coluna.");
            }
        }
        System.out.println("Matriz:");
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Números Impares e Pares:");
        for (int[] num : nums) {
            for (int i : num) {
                if(i % 2 == 1){
                    System.out.println(i + " é impar, ");
                }
                else{
                    System.out.println(i + " é par, ");
                }
            }
        }
        System.out.println();

        int soma = 0;
        for (int[] num : nums) {
            for (int i : num) {
                soma += i;
            }
        }
        System.out.println("Soma: "+soma);
        System.out.println();

        boolean primo;
        System.out.println("Primos");
        for (int[] num : nums) {
            for (int i : num) {
                if (i < 2) {
                    continue;
                }
                primo = true;
                int b = 2;
                int c = i/2;
                while (b <= c) {
                    if (i % b == 0) {
                        primo = false;
                        break;
                    }
                    b++;
                }
                if (primo) {
                    System.out.println(i);
                }
            }
        }

        s.close();
    }
}
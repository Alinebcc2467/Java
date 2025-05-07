//8 - Ler 100 números de matriculas de alunos e armazenar em um vetor. Esses números são distintos, ou seja, não existem números de matriculas iguais. Caso o usuário informa um número de matrículo que já existe, o programa deverá emitir um alerta.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[100];
        System.out.print("O número máximo de matriculas é 100. Quantas matrículas você deseja adicionar?: ");
        int quantidade = s.nextInt();
        while (quantidade < 0 || quantidade > 100) {
            System.out.print("O tamanho é inválido. Digite um número de 1 a 100 para adicionar: ");
            quantidade = s.nextInt();
        }
        int a = 0;
        while (a < quantidade) {
            System.out.print("Escreva o número desejado: ");
            int num = s.nextInt();
            boolean existe = false;
            for (int i = 0; i < a; i++) {
                if (nums[i] == num) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                System.out.println("Matrícula já existe. Tente novamente.");
            } else {
                nums[a] = num;
                a++;
            }
        }
        System.out.println("Matrículas Adicionadas:");
        for (int j = 0; j < quantidade; j++) {
            System.out.println("Matrícula = " + nums[j]);
        }
        s.close();
    }
}
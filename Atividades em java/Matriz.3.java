//3 - Dada as matrizes A e B determine A + B.
//
//A =  -10	1	4	6
//      2	3	2   8
//B =	1	8	4  -1
//      0	6	3  -3

public class Main {
    public static void main(String[] args) {
        int[][] A = {
                {-10, 1, 4, 6},
                {2, 3, 2, 8}
        };
        int[][] B = {
                {1, 8, 4, -1},
                {0, 6, 3, -3}
        };
        int soma1 = 0;
        for (int[] num : A) {
            for (int i : num) {
                soma1 += i;
            }
        }
        int soma2 = 0;
        for (int[] num : B) {
            for (int i : num) {
                soma2 += i;
            }
        }
        int soma=soma1+soma2;
        System.out.println("Soma: "+ soma);
    }
}

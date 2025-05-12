//6 - A empresa paga ao corretor uma comissão calculada de acordo com o valor de suas vendas. Se o valor da venda de um corretor for maior que R$ 50.000,00 a comissão será de 12% do valor vendido. Se o valor da venda do corretor estiver entre R$ 30.000,00 e R$ 50.000,00 (incluindo extremos) a comissão será de 9,5%. Em qualquer outro caso, a comissão será de 7%. Escreva um programa onde será informado nome do corretor e o valor da venda, após isto o programa irá calcular o valor da comissão.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva o seu nome: ");
        String nome=s.nextLine();
        System.out.print("Escreva o valor da venda: ");
        float valor=s.nextFloat();
        if (0<valor && valor<30000){
            float comissao=(valor/100)*7;
            System.out.println("O valor da comissão é: "+comissao);
        }
        else if(30000<valor && valor<50000){
            double comissao=(valor/100)*9.5;
            System.out.println("O valor da comissão é: "+comissao);
        }
        else if(valor>50000){
            float comissao=(valor/100)*12;
            System.out.println("O valor da comissão é: "+comissao);
        }
        else{
            System.out.println("Valor Inválido");
        }
        s.close();
    }
}

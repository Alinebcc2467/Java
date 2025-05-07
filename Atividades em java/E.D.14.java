//14 - Uma quitanda está vendendo frutas com a seguinte tabela de preços. Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
//
//           Até 5Kg	  Acima de 5kg
//Morango	R$2,50 / kg	  R$2,20 / kg
//Maçã	    R$1,80 / kg	  R$1,50 / kg

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva quantos Kg de Morango voçê quer: ");
        float morango=s.nextFloat();
        System.out.print("Escreva quantos Kg de Maça voçê quer: ");
        float maca=s.nextFloat();
        float total;
        float valorMaca;
        float valorMorango;
        if (morango<=5){
            valorMorango= (float) (morango*2.50);
        }
        else {
            valorMorango= (float) (morango*2.20);
        }
        if (maca<=5){
            valorMaca= (float) (maca*1.80);
        }
        else {
            valorMaca= (float) (maca*1.50);
        }

        total=valorMaca+valorMorango;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Foi comprado "+morango+" kg de morango = R$"+df.format(valorMorango)+".");
        System.out.println("Foi comprado "+maca+" kg de maca = R$"+df.format(valorMaca)+".");

        if(maca+morango>8 || total>25){
            double desconto=((total)/100)*10;
            total= (float) (total-desconto);
            System.out.println("Teve desconto de R$"+df.format(desconto)+".");
        }

        System.out.println("O total a pagar = R$"+df.format(total)+".");
    }
}

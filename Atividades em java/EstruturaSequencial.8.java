//8 - Faça um programa que calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12Km 
//por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média durante ela. Desta forma, 
//será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO × VELOCIDADE. Tendo o valor da distância, basta calcular 
//a quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA ÷ 12. O programa deve apresentar 
//os valores da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Qual o tempo da viagem em horas? ");
        int tempo=s.nextInt();
        System.out.print("Qual a velocidade média?");
        int velocidade=s.nextInt();
        int distancia=tempo*velocidade;
        double litros= distancia/12;
        System.out.println("A duração da viagem é de "+tempo+" horas, a velocidade média é de "+velocidade+"km/h, a distância percorrida foi de "+distancia+"Km, o combustível total gasto foi: "+litros+" litros.");
        s.close();
    }
}

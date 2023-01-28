import java.util.Scanner;
public class VariavelUsuárioSistema {
    public static void main (String [] args){
        double altura,largura,alturaA,larguraA,metrosQ,calculo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a altura da parede: ");
        altura =sc.nextDouble();
        System.out.println("Entre com a largura da parede: ");
        largura=sc.nextDouble();
        System.out.println("Entre com a Altura do Azulejo: ");
        alturaA=sc.nextDouble();
        System.out.println("Entre com a Largura do Azulejo: ");
        larguraA=sc.nextDouble();
        calculo=altura*largura/alturaA*larguraA;
        System.out.println("Você precisará de " +calculo%2f+" Azulejos");

    }
}

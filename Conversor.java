import java.util.Scanner;

public class Conversor {
    public static void main (String [] args) {
        double dolar = 5.09;
        double euro =5.52;
        double iene =0.039;
        double libraEsterlina = 6.30;
        double pesosArg = 0.027;
        double real = 0, conver;
        Scanner ler=new Scanner(System.in);
        System.out.println("CONVERSOR DE MOEDAS.");
        System.out.print("Digite quantos Reais você tem: R$ ");
        real = ler.nextDouble();
        System.out.println(real);

        conver = real /dolar;
        System.out.println("Com o Valor de R$" + real +"Você consegue: US$ " + conver+" Dolares");
        conver = real /euro;
        System.out.println("Com o Valor de R$" + real +" Você consegue: € " + conver+" Euros");
        conver = real /iene;
        System.out.println("Com o Valor de R$" + real +" Você consegue: ¥ " + conver+" Iene");
        conver = real /libraEsterlina;
        System.out.println("Com o Valor de R$" + real +" Você consegue: £ " + conver+" Libras");
        conver = real /pesosArg;
        System.out.println("Com o Valor de R$" + real +" Você consegue: $ " + conver+" Pesos Argentinos");

    }

}

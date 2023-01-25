import java.util.Scanner;

public class Convertor {
    public static void main (String [] args) {
        double valor = 5.10;
        double real = 0, conver;
        Scanner ler=new Scanner(System.in);
        System.out.println("CONVERSOR DE DOLLAR.");
        System.out.println("Digite quantos Dolares você tem? ");
        real = ler.nextDouble();
        System.out.println(real);

        conver = real * valor;
        System.out.println("Com o Valor de R$" + real +"\nVocê consegue: $ " + conver);
    }

}

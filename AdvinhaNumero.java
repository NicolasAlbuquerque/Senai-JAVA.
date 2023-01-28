import java.util.Scanner;
import java.util.Random;
public class AdvinhaNumero {
    public static void main(String []args) {
        int num=0, rand=0;
        Scanner sc=new Scanner(System.in);
        Random gerador=new Random();
        rand = gerador.nextInt(1000);
        System.out.println(rand);
        System.out.println("Escolha um numero: ");
        num= sc.nextInt();

        while(rand != num) {
            if (num > rand) {
                System.out.println("O numero selecionado é maior que o sorteado.");

            }
            if (num <= rand) {
                System.out.println("O numero é selecionado é menor que o sorteado.");
            }
            System.out.println("Escolha um numero: ");
            num= sc.nextInt();

        }

            System.out.println("Você Acertou o valor");
        }

    }



import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int impar, par;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero impar: ");
        impar = sc.nextInt();
        System.out.println("Digite um numero par: ");
        par = sc.nextInt();

        if (par % 2 == 0) {
            System.out.println("Os numeros: " + y +" e "+ par + " São Números pares.");

        }  if (impar % 2 == 1) {
            System.out.println("Os numeros " + x +" e " + impar + " São Números Impares");

        }
    }
}
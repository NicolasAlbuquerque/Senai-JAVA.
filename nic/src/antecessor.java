import java.util.Scanner;
public class antecessor {
    public static void main (String [] args) {
        int ant = -1, suc =1;
        int valor=0;
        System.out.println("Entre com um valor: ");
        Scanner ler=new Scanner(System.in);
        valor =ler.nextInt();
        System.out.println("O valor digitado foi: "+ valor + "\n O Antecessor deste valor é " + (valor + ant) );
        System.out.println("O Sucessor desse valor é: "+ (valor+suc));
    }
}

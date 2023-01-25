import java.util.Scanner;
public class tabuada {
    public static void main(String [] args) {
        System.out.println("Tabuada");
       int entrada=0;
       int multi=0;
       int oper =0;
        System.out.println("Digite um numero: ");
        Scanner ler =new Scanner (System.in);
       entrada= ler.nextInt();
        System.out.println(entrada);
            while (multi<=10)
    {
                int resultado= (entrada * multi);
                System.out.println(entrada +" x "+ multi+" = " +resultado);
                 multi++; oper++;

            }




    }
}

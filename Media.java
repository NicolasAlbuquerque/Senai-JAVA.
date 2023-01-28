import java.util.Scanner;
public class Media {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int x=1;
       double cont= 0, nota,soma=0;
       double maior=0,menor=10, media=0;
        System.out.printf("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print(nome);
        for(cont =0; cont <= 4; cont++){
            System.out.printf(" Informe suas notas: ");
            nota=sc.nextDouble();
            soma=soma+nota;
            if (nota > maior){
                maior=nota;

            }
            if (nota< menor) {
                menor=nota;
            }


        }
        media=soma/5;
        System.out.println("Sua média é: " + media);
        System.out.println("a Maior nota foi: "+ maior);
        System.out.println("a Menor nota foi: "+ menor);
        }

    }



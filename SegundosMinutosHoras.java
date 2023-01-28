import java.util.Scanner;
public class SegundosMinutosHoras {
    public static void main (String [] args) {
        int horas=0,minutos=0,segundos;
        Scanner sc=new Scanner (System.in);
        System.out.println("Entre com o Valor em Segundos: ");
        segundos= sc.nextInt();
        for( horas=0; horas <=22;horas++)
        {
            horas=horas+1;

        }  for(minutos=0;minutos <=58;minutos++) {
            horas=horas+1;

        }
        for (segundos=0;segundos<=58;) {
            segundos = segundos + 1;
        }

        System.out.println(horas + " : " +minutos+ " : " + segundos);


    }
}

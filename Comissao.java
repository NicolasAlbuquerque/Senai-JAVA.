import java.util.Scanner;
public class Comissao {
    public static void main (String []args){
      float valorCarro, porcentagem=17, valorcomiss;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre com o Valor do Veículo Vendido: ");
        valorCarro = sc.nextFloat();
        valorcomiss= valorCarro*17/100;
        System.out.println(valorcomiss);
        System.out.println("O valor do Carro é de R$ "+valorCarro+ " com uma comissão de "+porcentagem+" sob o valor di veículo é de: R$" +valorcomiss);
    }
}

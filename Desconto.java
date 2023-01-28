public class Desconto {
    public static void main (String [] args){
        double valor=985, desconto=43, total;
        total=valor*desconto/100;
        System.out.println("O valor do produto é de R$ "+ valor+ "Com desconto de 43%\n o preço a se pagar é de: R$ " + (total-desconto));
    }
}

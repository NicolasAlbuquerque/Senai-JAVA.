import java.math.BigDecimal;
public class ReajusteSalarial {
    public static void main (String [] args ) {
        //Scanner entrada =new Scanner (System.in);
        double aumento=1.5, salario = 1000, ano= 2015;
        System.out.println("O valor do Salário atualizado é de: " + salario);

                for (ano =2015; ano <=2023; ano++){
            salario = (salario * aumento) / 100;
        }

        System.out.println("O valor do Salário atualizado é de: " + salario);

    }

}

import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
        int a, b, c, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculando a Área de um Triangulo");
        System.out.println("Digite o Valor correspondente a Base do Triangulo: ");
        b= sc.nextInt();
        System.out.println("Digite o valor Correspondente a Altura do triangulo: ");
        a= sc.nextInt();
        area = b*a/2;
        System.out.println("A àrea do Triangulo é: " + area);



    }
}

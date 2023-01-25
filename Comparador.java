import java.net.SocketOption;

public class Comparador {
    public static void main(String[] args) {

        double decimal1 = 5;
        double decimal2 = 10;

        if (decimal1 != decimal2) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        float pont1 = 2.5f;
        float pont2 = 2.0f;
        if (pont2 == pont1) {
            System.out.println("Os valores são Iguais");
        }
        else {
            System.out.println("Valores Diferentes");
        }

        String [] list = {"Verde", "Azul"};
        String [] list2 = {"Verde", "Azul"};

            if (list != list2){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }

    }
}
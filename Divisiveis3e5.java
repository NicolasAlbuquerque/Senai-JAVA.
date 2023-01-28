public class Divisiveis3e5 {
    public static void main (String [] args ){
        int cont=0;
        int x=0;
        int div3,div5;

      //  for(cont =0; cont<=99; cont++){
            for (x=0;x<=99;x++){

                if(x%3==0){
                    System.out.println(x +" é um número Divisível por 3.");

            }
            }
            for (x=0;x<=99;x++){
                if (x%5==0){
                    System.out.println(x + " é um número Divisível por 5.");
                }
            }
            for (x=0;x<=99;x++){
                if ((x%5==0)&& (x%3==0)){
                    System.out.println(x+ " é um número Divisível por 3 e 5.");
            }
        }

    }


         }
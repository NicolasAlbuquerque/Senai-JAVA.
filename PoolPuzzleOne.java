public class PoolPuzzleOne {

    public static void main (String [] args){
        int x = 0;

        while (x<4) {


            if (x<1) {
                System.out.print("a ");
                System.out.println("noise\n");
                x++;

            }
            if (x <=1){
                System.out.println("annoys\n");
                x=x-1;

            }
            if (x==0){
                System.out.print("an");
                x=x+2;

            }
            if (x>1) {
                System.out.print(" oyster");
                    x+=2;

            }
            System.out.println(" ");



        }
    }
}

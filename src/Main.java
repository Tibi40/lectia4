public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int y = 2;
        double x = 3 + 6 * y--;
        System.out.println(x);

        if ((3 % 5) >= 1) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        int q = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(q++); // De ce se printeaza doar de 10 ori si nu de in infinit de ori

            /* La q++ = numaratoare se face incepand cu valoarea initiala
            la ++q = numaratoarea se face continuand cu valoarea initiala
             */

        boolean xw = true;
        boolean yw = !xw;
        int Dayhour = 10;

        if(Dayhour > 8) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        }

        int counter = 0;

        for(int i = 1; i < 5; i++) {
            counter++;

            if (counter == 3 ) {
                System.out.println("Please change your password!");
            }
        }
    }


}
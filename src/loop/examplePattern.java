package loop;

public class examplePattern {
    public static void main(String[] args) {
        //kotak
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //segitiga
        //outer loop (baris)
        for (int i = 0; i <= 5; i++) {
            //inner loop (kolom)
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            //inner loop (kolom)
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int n= 6;

        for (int i = n; i >= 1; i--) {

            // inner loop to handle columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}

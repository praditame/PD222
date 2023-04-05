package loop;

public class examplePattern {
    public static void main(String[] args) {
        //kotak
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");
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
    }
}

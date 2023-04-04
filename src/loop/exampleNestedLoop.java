package loop;

public class exampleNestedLoop {
    public static void main(String[] args) {

        //1
//        int weeks = 3;
//        int days = 7;
//
//        // outer loop prints weeks
//        for (int i = 1; i <= weeks; ++i) {
//            System.out.println("Week: " + i);
//
//            // inner loop prints days
//            for (int j = 1; j <= days; ++j) {
//                System.out.println("  Day: " + j);
//            }
//        }

        //segitiga angka
        int rows = 5;

        // outer loop
        for (int i = 1; i <= rows; ++i) {

            // inner loop to print the numbers
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        //break pada looping
        int weeks = 3;
        int days = 7;

        // outer loop
        for(int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            // inner loop
            for(int j = 1; j <= days; ++j) {

                // break inside the inner loop
                if(i == 2) {
                    break;
                }
                System.out.println("  Days: " + j);
            }
        }
    }
}

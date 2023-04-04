package loop;

public class exampleLoop1 {
    public static void main(String[] args) {

        //print angka 1-10
//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
//
//        System.out.println();
//
        //print kata i love u sebanyak 5 kali
//        int kata = 5;
//        for (int i = 0; i < kata; i++) {
//            System.out.println("i love u");
//        }

        //infinite loop: perulangan hingga memory runs out (tidak ada kondisi false-nya)
//        for (int i = 1; i <= 10; --i) {
//            System.out.println("Hello");
//        }

        //penjumlahan angka dari 1 - 10
        int sum = 0;
        int n = 10;
        for (int i = 1; i < n; i++) {
            sum += i;
            System.out.println("sum + i: " + sum);
            System.out.println();
        }
        System.out.println("sum all : " + sum);

        //penjumlahan angka dari 10 - 1
        for (int i = n; i > 1; i--) {
            sum += i;
            System.out.println("sum + i: " + sum);
            System.out.println();
        }
        System.out.println("sum all : " + sum);
    }
}

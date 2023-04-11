package loop;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class exampleWhile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int angka = 0, sum =0;
        try {
            while (angka >= 0){
                sum += angka;
                System.out.print("Entri number : ");
                angka = Integer.parseInt(br.readLine());
            }
            System.out.println("Total: " + sum);
        }catch (Exception e){
            System.out.println("Maaf, isian harus angka \n" + e.getMessage());
        }

//        try {
//            boolean b = true;
//            while (b){
//                System.out.print("Entri nama : ");
//                String nama = br.readLine();
//                System.out.print("Entri nim : ");
//                int nim = Integer.parseInt(br.readLine());
//                System.out.println("=== output ===");
//                System.out.println("NIM "+ nim + ", Nama " + nama);
//            }
//        } catch (Exception e) {
//
//        }
    }
}

package arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class array2D {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi array 2D
        String[][] ips = new String[3][4];

        //karena array bertipe string, maka ada konversi tipe data ke int bagi data sks, bobot, total, jumlah sks, ip
        //menampung hasil konversi pada variabel
        //3.5 --> double
        double sks, bobot, totalBobot, jumlahSKS, grandTotal=0, ip;

        try {
            //input data nim dan nama
            System.out.print("NIM : ");
            String nim = br.readLine();
            System.out.print("Nama : ");
            String nama = br.readLine();

            //input data MK (jumlah data MK > 1)
            for (int i = 0; i < ips.length; i++) {
                System.out.print("Nama MK : ");
                ips[i][0] = br.readLine();
                System.out.print("SKS : ");
                ips[i][1] = br.readLine();
                //konversi tipe data dari ips[i][1] (string) ke double
                sks = Double.parseDouble(ips[i][1]);
                System.out.print("Bobot : ");
                ips[i][2] = br.readLine();
                bobot = Double.parseDouble(ips[i][2]);

                //memasukkan perhitungan IPS
                totalBobot = sks * bobot;

                //total bobot per index
                //konversi dari numeric (int, double. dll) ke string --> String.valueOf
                ips[i][3] = String.valueOf(totalBobot);
                System.out.println("Total = " + ips[i][3]);

                //hitung grandtotal
                grandTotal = grandTotal + totalBobot;
                System.out.println("---------------------------------");
            }

            System.out.println("Grand total (SKS * Bobot) = " + grandTotal);
            //hitung IP
            System.out.println("Jumlah SKS yang diambil : ");
            jumlahSKS = Double.parseDouble(br.readLine());
            ip = grandTotal / jumlahSKS;
            System.out.println("IP anda semester ini adalah " + ip);

        }catch (Exception e){

        }
    }
}

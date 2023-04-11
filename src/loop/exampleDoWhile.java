package loop;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class exampleDoWhile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int i = 0;
            do {
                System.out.println("Do While");
                i++;
            } while (i < 5);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



//        try {
//            String nim = null, nama= null, mk = null, prodi= null, cari = null;
//            int uts = 0, uas= 0, tgs= 0, na= 0;
//
//            do {
//                System.out.println("=== Menu Mahasiswa ===");
//                System.out.println("1. Entri Mahasiswa");
//                System.out.println("2. Hitung Nilai Mahasiswa");
//                System.out.println("3. Cetak Rapor Nilai");
//                System.out.println("4. Keluar Program");
//                System.out.print("Silahkan pilih menu : ");
//                int menu = Integer.parseInt(br.readLine());
//                switch (menu){
//                    case 1:
//                        System.out.println("=== Menu Entri Mahasiswa ===");
//                        System.out.print("NIM : ");
//                        nim = br.readLine();
//                        System.out.print("Nama : ");
//                        nama = br.readLine();
//                        System.out.print("Prodi : ");
//                        prodi = br.readLine();
//                        System.out.print("Nama MK : ");
//                        mk = br.readLine();
//                        System.out.println();
//                        break;
//                    case 2:
//                        System.out.println("=== Hitung Nilai Mahasiswa ===");
//                        System.out.print("Cari nim mahasiswa : ");
//                        cari = br.readLine();
//                        if (cari.equalsIgnoreCase(nim)){
//                            System.out.print("Entri nilai uts : ");
//                            uts = Integer.parseInt(br.readLine());
//                            System.out.print("Entri nilai uas : ");
//                            uas = Integer.parseInt(br.readLine());
//                            System.out.print("Entri nilai tugas : ");
//                            tgs = Integer.parseInt(br.readLine());
//
//                            na = (uts * 30/100) + (uas * 30/100) + (tgs * 40/100);
//                            System.out.println();
//                        } else {
//                            System.out.println("Data tidak ditemukan");
//                        }
//
//                        break;
//                    case 3:
//                        System.out.println("=== Cetak Rapor Nilai ===");
//                        System.out.print("Cari nim mahasiswa : ");
//                        cari = br.readLine();
//                        if (cari.equalsIgnoreCase(nim)){
//                            System.out.println(nim  + " " + nama);
//                            System.out.println("UTS : " + uts + ", " + "UAS : " + uas + ", " + "Tugas : " + tgs);
//                            System.out.println("Nilai akhir : " + na);
//                            if (na >= 80){
//                                System.out.println("Nilai huruf : A");
//                            } else if (na >= 75 && na <= 79 ){
//                                System.out.println("Nilai huruf : B+");
//                            } else if (na >= 65 && na <= 74) {
//                                System.out.println("Nilai huruf : B");
//                            }
//                            System.out.println();
//                        } else {
//                            System.out.println("Data tidak ditemukan");
//                        }
//                        break;
//                    default:
//                        System.out.println("Berhasil logout");
//                        System.exit(0);
//                }
//            } while (true);
//        } catch (Exception e) {
//            System.out.println("Isian menu/nilai harus angka");
//        }
    }
}

package uts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class soalB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tahun, anggaran, jmlDivisi, anggaranDivisi = 0, jmlKegiatan, anggaranKegiatan = 0, totalDivisi = 0, totalKegiatan = 0;
        String namaDivisi;
        String divisi[][];
        String kegiatan[][] = new String[0][];

        System.out.print("Tahun proker : ");
        tahun = Integer.parseInt(br.readLine());
        System.out.print("Anggaran periode proker : ");
        anggaran = Integer.parseInt(br.readLine());
        System.out.println();

        System.out.println("===== PENGISIAN DIVISI =====");
        System.out.print("Masukkan jumlah divisi : ");
        jmlDivisi = Integer.parseInt(br.readLine());
        divisi = new String[jmlDivisi][3];
        for (int i = 0; i < divisi.length; i++) {
            System.out.print("Nama Divisi : ");
            divisi[i][0] = br.readLine();
            System.out.print("Jumlah Anggota Divisi : ");
            divisi[i][1] = br.readLine();
            System.out.print("Anggaran Divisi : ");
            divisi[i][2] = br.readLine();
            anggaranDivisi = Integer.parseInt(divisi[i][2]);
            totalDivisi += anggaranDivisi;
            System.out.println();
        }

        System.out.println("Total anggaran divisi : " + totalDivisi);
        if (totalDivisi > anggaran) {
            System.err.println("Anggaran divisi terlalu besar, anggaran terakhir akan dihapus");
            totalDivisi -= anggaranDivisi;
            System.err.println("Total anggaran divisi : " + totalDivisi);
        }
        System.out.println();

        System.out.println("===== PENGISIAN PROKER TIAP DIVISI =====");
        System.out.print("Masukkan nama divisi untuk pengisian proker : ");
        namaDivisi = br.readLine();
        for (int i = 0; i < divisi.length; i++) {
            if (namaDivisi.equalsIgnoreCase(divisi[i][0])) {
                System.out.print("Jumlah kegiatan yg diisi : ");
                jmlKegiatan = Integer.parseInt(br.readLine());
                kegiatan = new String[jmlKegiatan][3];
                for (int j = 0; j < kegiatan.length; j++) {
                    System.out.print("Nama Kegiatan : ");
                    kegiatan[j][0] = br.readLine();
                    System.out.print("Bulan Kegiatan : ");
                    kegiatan[j][1] = br.readLine();
                    System.out.print("Anggaran Kegiatan : ");
                    kegiatan[j][2] = br.readLine();
                    anggaranKegiatan = Integer.parseInt(kegiatan[j][2]);
                    System.out.println();

                    totalKegiatan += anggaranKegiatan;
                }

                System.out.println("Total anggaran kegiatan : " + totalKegiatan);
                if (totalKegiatan > anggaranKegiatan) {
                    System.err.println("Anggaran proker divisi terlalu besar, anggaran terakhir akan dihapus");
                    totalKegiatan -= anggaranKegiatan;
                    System.err.println("Total anggaran proker : " + totalKegiatan);
                }
                System.out.println();


            } else if (!namaDivisi.equalsIgnoreCase(divisi[i][0])) {
                System.out.println("Data tidak ditemukan");
            }
        }

//        System.out.println("===== DATA DIVISI DAN PROKER HMSI TAHUN " + tahun + "=====");
//        for (int i = 0; i < divisi.length; i++) {
//            System.out.println("Nama Divisi : " + divisi[i][0]);
//            System.out.println("Jumlah Anggota : " + divisi[i][1]);
//            System.out.println("Anggaran Divisi : " + divisi[i][2]);
//            System.out.println("Total Anggaran Divisi : " + totalDivisi);
//            System.out.println("");
//        }
//
//        for (int i = 0; i < kegiatan.length; i++) {
//            System.out.println("Nama Kegiatan : " + kegiatan[i][0] + ", bulan " + kegiatan[i][1]);
//            System.out.println("Anggaran Kegiatan : " + kegiatan[i][2]);
//            System.out.println("Total Anggaran Kegiatan : " + totalKegiatan);
//        }


    }
}

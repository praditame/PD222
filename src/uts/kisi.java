package uts;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class kisi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bkpj = 0, bkb, pjm, intsubpj, intsubpb, selisihkmb, denda;
        String kemb, subspj, subspb;
        String[][] peminjam;
        String[][] buku = new String[0][];

        System.out.println("------------------------------------------");
        System.out.println("\t\t PERPUSTAKAAN UNDIKA");
        System.out.println("------------------------------------------");
        System.out.println("** PEMINJAMAN BUKU **");
        System.out.print("Masukkan jumlah peminjam : ");
        pjm = Integer.parseInt(br.readLine());
        peminjam = new String[pjm][2];
        System.out.println();
        for (int i = 0; i < peminjam.length; i++) {
//                        System.out.print("NIM mahasiswa " + (i+1) + " : ");
            System.out.print("NIM mahasiswa ke " +(i+1)+ " : ");
            peminjam[i][0] = br.readLine();
            System.out.print("Nama mahasiswa " +(i+1)+ " : ");
            peminjam[i][1] = br.readLine();
            System.out.print("Jumlah buku yang dipinjam : ");
            bkpj = Integer.parseInt(br.readLine());
            buku = new String[bkpj][4];
            System.out.println("------------------------------------------------------------");
            for (int j = 0; j < buku.length; j++) {
                System.out.print("Kode buku ke " + (j + 1) + " : ");
                buku[j][0] = br.readLine();
                System.out.print("Nama buku ke  " + (j + 1) + " : ");
                buku[j][1] = br.readLine();
                System.out.print("Tanggal pinjam (DDMMYY) buku ke " + (j + 1) + " : ");
                buku[j][2] = br.readLine();
                System.out.print("Batas kembali 3 hari setelah peminjaman dan tidak melebihi bulan yang sama \nTanggal kembali (DDMMYY) buku ke " + (j + 1) + " :");
                buku[j][3] = br.readLine();
                System.out.println();
            }
            System.out.println("----------------------------------------------------");
        }
        System.out.println();
        System.out.println("** PENGEMBALIAN BUKU **");
        System.out.println("Apabila pengembalian buku melewati batas waktu, denda per buku adalah Rp 500/hari");
//                    peminjam = new String[pjm][2];
        System.out.print("NIM mahasiswa peminjam : ");
        String nim = br.readLine();
        for (int i = 0; i < peminjam.length; i++) {
            if (nim.equalsIgnoreCase(peminjam[i][0])) {
                System.out.println("Nama peminjam : " + peminjam[i][1]);
                System.out.print("Jumlah buku yang kembali : ");
                bkb = Integer.parseInt(br.readLine());
                //buku = new String[bkb][4];
                if (bkb > bkpj) {
                    System.err.println("Jumlah buku yang dipinjam tidak sesuai dengan jumlah yang " +
                            "dikembalikan");
                } else {
//                    buku = new String[bkpj][4];
                    for (int j = 0; j < bkb; j++) {
                        System.out.print("Kode buku yang dikembalikan : ");
                        String kode = br.readLine();
//                        System.out.println(buku[j][0]);
                        if (kode.equalsIgnoreCase(buku[j][0])) {
                            System.out.println("Nama buku : " + buku[j][1]);
                            System.out.print("Tanggal kembali : ");
                            kemb = br.readLine();
                            subspj = buku[j][3].substring(0, 2);
                            intsubpj = Integer.parseInt(subspj);
                            subspb = kemb.substring(0, 2);
                            intsubpb = Integer.parseInt(subspb);
                            if (intsubpb > intsubpj) {
                                selisihkmb = intsubpb - intsubpj;
                                System.out.println("Jumlah hari terlambat : " + selisihkmb);
                                denda = selisihkmb * 500;
                                System.err.println("Mohon maaf, anda dikenakan denda karena tanggal " +
                                        "kembali telah melewati batas maksimal kembali buku. \n" +
                                        "Denda anda adalah Rp. " + denda);
                                System.out.println("Terima kasih telah mengembalikan buku ini");
                                System.out.println();
                            } else {
                                System.out.println("Terima kasih telah mengembalikan buku sesuai batas waktu");
                                System.out.println();
                            }
                        } else {
                            System.err.println("Data tidak ditemukan");
                            System.out.println();
                        }
                    }

                }

            }
//            else {
//                System.err.println("Data tidak ditemukan");
//            }
        }


    }
}

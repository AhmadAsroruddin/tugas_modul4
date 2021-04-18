package com.example;

import java.util.Scanner;

public class TugasModul4 {
    public class pilihKamar {
        public void kamarPilihan(int jumlah, String pilihan, String[][] kamar){
            for(int k=0; k<= jumlah;k++){
                if(pilihan.equals(kamar[k][0])){
                    if(kamar[k][0].equals(pilihan)){
                        kamar[k][1] = "Penuh";
                    }
                }
            }
        }
    }
    static void KamarTersedia(String[][]ruang){
        for(int i = 0; i<=3; i++){
            if(ruang[i][1].equals("kosong")){
                String[] available = new String[4];
                available[i] = ruang[i][0];
                System.out.println(available[i]);
            }
        }
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String [][] kamar = {{"Cendana", "kosong"}, {"Mawar", "kosong"}, {"Melati", "kosong"}, {"Sakura","kosong"}};
        System.out.println("Selamat Datang di Rumah Sakit Suka Sembuh");

        System.out.println("Siapa nama anda?");
        String pasien = scan.nextLine();
        int i =0;
        do{
            if(KamarTersedia(kamar) == 0){
                System.out.println("Kamar mana yang anda ambil?");
                String pilihan = scan.nextLine();

                com.example.pilihKamar objek = new com.example.pilihKamar();
                objek.kamarPilihan(3, pilihan,kamar);
            } else {
                System.out.println("Kamar Penuh!!!");
                break;
            }

        }while(i>=0);

    }

}

package com.example;

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


}

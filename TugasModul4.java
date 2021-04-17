package com.example;

public class TugasModul4 {
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

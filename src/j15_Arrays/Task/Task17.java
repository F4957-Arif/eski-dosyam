package j15_Arrays.Task;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        //Task-sayi arrdeki en buyuk elemanı prın eden code creat edınız
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};//24 bulunacak
        int maxEleman=sayi[0][0];//1
        for (int kat = 0; kat < sayi.length ; kat++) {
            for (int daire = 0; daire < sayi[kat].length ; daire++) {
                if (sayi[kat][daire]>maxEleman){
                    maxEleman=sayi[kat][daire];
                }

            }

        }
        System.out.println("maxEleman = " + maxEleman);//24
    }
}

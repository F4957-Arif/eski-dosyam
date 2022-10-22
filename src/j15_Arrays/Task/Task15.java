package j15_Arrays.Task;

public class Task15 {

    //task-> arr tum elemanların carpımını print eden code creta edıniz
    public static void main(String[] args) {
        int sayi[][] = {{1, 2, 3}, {9, 8}};

        int çarpım=1;//ilk deger 1 verılır carpmada

        for (int kat = 0; kat < sayi.length ; kat++) {//kat kontrolu
            for (int daire = 0; daire < sayi[kat].length ; daire++) {//daire kontrolu
                çarpım*=sayi[kat][daire];


            }


        }
        System.out.println("çarpımı = " + çarpım);//432


    }
}

package j15_Arrays.Taskyeni;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */
        int intt[][]={{2,3,2} , {4,1,5} , {7,2,5}};
        for (int i=0;i<intt.length;i++){
            for (int j=0;j<intt[i].length;j++){
                if(intt[i][j]==2){
                    intt[i][j]=6;               }          }     }
        System.out.println(Arrays.deepToString(intt)); }



}
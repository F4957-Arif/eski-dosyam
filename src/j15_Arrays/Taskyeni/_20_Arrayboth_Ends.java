package j15_Arrays.Taskyeni;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        int array[]={1,2,3,4};
        int arrayy[]=new int[2];
        for(int i=0;i<=array.length-1;i++){
            if(i==0){
                arrayy[0]=array[0];
            }if (i==array.length-1){
                arrayy[1]=array[i];	}    }
        System.out.println(Arrays.toString(arrayy)); }

}
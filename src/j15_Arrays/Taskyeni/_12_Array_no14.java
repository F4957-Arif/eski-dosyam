package j15_Arrays.Taskyeni;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        int array[] = {1, 2, 3, 4};
        boolean flag = false;
        int birk = 0;
        int dork = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                birk = 1;
            }
            if (array[i] == 4) {
                dork = 4;
            }
        }
        if (dork - birk == 3) {
            flag = false;
        } else flag = true;
        System.out.println(false);
        /*
        int num1[]= {1,2,3,4};
		boolean flag1 = false;
		boolean flag4=false;
		for(int i = 0 ; i<=num1.length-1;i++) {
			flag1 = (num1[i]==1 ? true : false);
			flag4 = (num1[i]==4 ? true : false);
		}
		System.out.println((flag1 == false && flag4 == false)? false : true);
         */

    }
}
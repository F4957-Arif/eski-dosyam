package j15_Arrays.Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        artieksi();

    }

    private static void artieksi() {
        System.out.print("kaç elemanlı bir Array düşünüyorsun?: ");
        int sayiArr[]= new int[sc.nextInt()];
        for (int i=0; i<sayiArr.length; i++)
        {
            System.out.print(i + ". index elemanı girin");
            sayiArr[i]=sc.nextInt();
            sayiArr[i]*=-1;
        }

        System.out.println(Arrays.toString(sayiArr));
    }


}
/*
 */
//int arr[] = {1, 2, -3, 4, -5, -6};

  //      syınınTersi(arr);
   //     }

//private static void syınınTersi(int[] arr) {

     //   for (int a:arr){
     //   a*=-1;
   //     System.out.print(a+" ");
 //       }

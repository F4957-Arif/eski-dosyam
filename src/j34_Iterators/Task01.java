package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    //verilen bir int Listen tek eleman karesinin tersten print eden code creat edene code creat edınız
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>(Arrays.asList(7,8,12,4,5,3));
        System.out.println(liste);
        ListIterator<Integer> ıt = liste.listIterator();
        while (ıt.hasNext()){
            ıt.next();
        }
        while (ıt.hasPrevious()){
            int kare = ıt.previous();
            if (kare % 2==1){
                kare *= kare;
                System.out.print(kare+" ");
            }
        }
        System.out.println();
    }
}

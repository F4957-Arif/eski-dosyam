package j16_ArrayList.Taskk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */
static ArrayList<Integer>num=new ArrayList<>(List.of(5,3,4,6,7));
    public static void main(String[] args) {
        System.out.println("secondMax(num) = " + secondMax(num));


    }

    private static int secondMax(ArrayList<Integer> num) {
        ArrayList<Integer>numbers=new ArrayList<>();
        Collections.sort(numbers);
        int secondMax=num.get(num.size()-2);

        return secondMax;



    }
}


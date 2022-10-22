package j16_ArrayList.Taskk;

import java.util.ArrayList;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */
static ArrayList<String>cities=new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
    public static void main(String[] args) {
        System.out.println("Stringlerin uzunlugu) = " + gerLength(cities));


    }

    private static ArrayList<Integer> gerLength(ArrayList<String> cities) {
        ArrayList<Integer>ranges=new ArrayList<>();
        int length=0;
        for (String city:cities) {
            ranges.add(city.length());

        }return ranges;
    }
}
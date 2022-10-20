package j16_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        //size();-> arr deki lenght gibi listen eleman sayısını verır
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));
        System.out.println(listSehir.size());//4

    }
}

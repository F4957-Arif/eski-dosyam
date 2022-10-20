package j16_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        //get();-> Listte istenmen elemanı return eder.  arr[3]-> arrr' ın 3. indexindekı elemanı veri
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));
        System.out.println(listSehir.get(1));//1. ındexi getirir.losAngeles
       // System.out.println(listSehir.get(11));//olmayan ındex elemanı RTE verır.


    }
}

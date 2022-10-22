package j15_Arrays.Taskyeni;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int num11[]= {12,14,21,23,10,4};
        int toplam11 = 0;
        for (int value : num11) {
            toplam11+=value;
        }
        System.out.println("Array ortalaması = " + (double)(toplam11 / num11.length));
        /*
             int arr[]={12,14,21,23,10,4};
        int ort=0;
        for (int i=0;i<arr.length;i++){
            ort+=arr[i];       }
        System.out.println("Ortalamasi : "+(ort/arr.length));   }
         */

    }
}
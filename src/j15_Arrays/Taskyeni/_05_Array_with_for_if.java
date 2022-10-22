package j15_Arrays.Taskyeni;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.

         */
 /*       int arr[]={ 5,6,8,12,14,19};
        int sayi05[] = {5,6,8,12,14,19};
        int tekSayilar = 0;
        int ciftSayilar = 0;
        for (int i=0; i<=sayi05.length-1 ; i++) {
            tekSayilar+=(sayi05[i]%2==1 ? sayi05[i]*-1 : 0);
            ciftSayilar+=(sayi05[i]%2==0 ? sayi05[i] : 0);
        }
        System.out.println("toplamlar = " + (tekSayilar + ciftSayilar));
 */
        int arr[] = {5, 6, 8, 12, 14, 19};
        int sonuc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sonuc += arr[i];
            } else sonuc -= arr[i];
        }
        System.out.println(sonuc);
    }



}

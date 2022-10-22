package j15_Arrays.Taskyeni;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        String str16 = "$12 $23 $10 $2 $5 $2";
        String arr16[]=str16.replace("$", "").split(" ");
        int toplam16=0;
        for (String value : arr16) {
            toplam16+=Integer.parseInt(value);
        }System.out.println("Toplam $ lar = " + toplam16);
        /*
        String str="$12 $23 $10 $2 $5 $2";
        String strr[]=str.split(" ");
        int toplam=0;
        for (int i=0;i<strr.length;i++){
            toplam+=Integer.parseInt(strr[i].replace("$",""));       }
        System.out.println(toplam);    }
         */
    }
}
package j15_Arrays.Taskyeni;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        int sayilar08[]= {14 , 19 , 5 , 21};
        int min = sayilar08[0];
        for(int i = 0 ; i<=sayilar08.length-1;i++) {
            min = (min < sayilar08[i] ? min : sayilar08[i]);
        }System.out.println("minimum sayı = " + min);


    }
}


package j15_Arrays.Taskyeni;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
        int numm=123;
        String num[]= Integer.toString(numm).split("");
        for (int i=num.length-1; i>=0; i--){
            System.out.print(num[i]);   } }


}



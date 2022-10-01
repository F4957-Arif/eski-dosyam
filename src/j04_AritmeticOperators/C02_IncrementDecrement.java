package j04_AritmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("   **** Artırma *****    ");

        int a = 7;
        System.out.println(++a);//8
        System.out.println(a++);//8 yazdırır    a =9 olur
        System.out.println(a);//9
        System.out.println(a++ + ++a);//20



        int k = 5;
        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);



    }
}

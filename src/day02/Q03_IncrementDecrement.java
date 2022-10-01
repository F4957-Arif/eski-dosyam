package day02;

public class Q03_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("--------Arttırma--------");


        int a = 1 ;

        System.out.println(++a);//2
        System.out.println(a++);//2 value -> 3
        System.out.println(a);

        System.out.println("-----Azalma-----");

        int b = 5;

        System.out.println(--b);//4 yazar value 4
        System.out.println(b--);//4 yazar value 3
        System.out.println(b);

        //TASK-> 1
        int x = 20;
        int y = 15;

        System.out.println(++x + y--);//21+15=36 yaz y=14 kalsın
        System.out.println("x ="+x);//21
        System.out.println("y ="+y);//14

        System.out.println(++x + --y);//21+14 =35
        System.out.println("x = " + x);//22
        System.out.println("y = " + y);//13

        //TASK->2
        int k = 5;
                          //6    6     7      7    7     6
        System.out.println(++k + k++ + k++ + --k + k-- + k);
        System.out.println("k :"+k);
    }
}

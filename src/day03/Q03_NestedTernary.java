package day03;

import java.util.Scanner;

public class Q03_NestedTernary {

    public static void main(String[] args) {
/*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
        char finalNotu = 'A';

        String result = finalNotu =='A' ? "Gayet Basarili":
                finalNotu == 'B' ? "Basarili":
                        finalNotu == 'C' ? "Ha gayret": "Digerleri";
        System.out.println("result = " + result);


















    }
}

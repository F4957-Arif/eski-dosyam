package Day04;

import java.util.Scanner;

public class Q09_StringManipulation {

    public static void main(String[] args) {


      Scanner scan = new Scanner(System.in);
      String name1 = scan.nextLine().toLowerCase();
      String name2 = scan.nextLine().toLowerCase();
        if (name1.length()%2==0){
            System.out.println(name1.substring(0, name1.length() / 2).concat(name2).concat(name1.substring(name1.length() / 2)));
        }else{
            System.out.println("name 1 cigt sayı olmadıgı ıcın ortasına bır sayı yerleştıremedık");
        }

//farklı yol
     //   Scanner sc = new Scanner(System.in);
       // System.out.println("birinci kelimeyi gir");
        //String kelime1 = sc.nextLine();

        //System.out.println("ikinci kelimeyi gir");
        //String kelime2 = sc.nextLine();

        //if (kelime1.length() % 2 == 0) {
          //  System.out.println(kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length() / 2));
      //  } else {
           // System.out.println("kelime2 kelime1 e eklenemez");












    }
}


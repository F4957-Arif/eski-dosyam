package j29_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
/*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException("Hava Gerçekten soğuk dışarı çıkma");

}

main(){
Scanner ...
try{
 sicaklikKontrol(int sıcaklık);
}
catch (IOException e) {
}

}
 */

        Scanner scn = new Scanner(System.in);
       System.out.println("hava sıcaklığını giriniz");
       int sıcaklık = scn.nextInt();

       try {

           if (sıcaklık < 10) {
               System.out.println("hava buzzzz sakın burnunu çıkarma");
           } else System.out.println("hava güzel d vitamini al");
           throw new IOException("hava cok soğuk dışarı çıkma");


       } catch (IOException e) {
           System.out.println(e);
           e.getStackTrace();
           System.out.println(e.getMessage());


       }




   }
   private static void sıcaklık(int sıcaklık)throws IOException{
       System.out.println(sıcaklık);
       throw  new IOException("bu mesajı okuduysan evinde otur");

    }

}

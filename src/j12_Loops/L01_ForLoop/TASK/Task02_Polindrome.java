package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
       /*
       girilen ifadenin polidrome olmasını kontrol eden method creat edınız ?
       HEr iki yonde okundugunda eşit olan ifadeler
       ey edip adanapide ye gibi
        */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen metin giriniz: ");
        String str = scan.nextLine();

        plindrome(str);// String parametreli method call yaptım
    }//main dışı

    private static void plindrome(String str) {
        String tersSTr="";//boş bir Strıng kutu actım
        for (int i =str.length()-1 ; i>=0  ; i--){
            tersSTr+=str.charAt(i);//str nin i ci karekterını tersStr ye ekler concat yani

        }
        System.out.println("girilen ifadenin tersi :" +tersSTr);
         if (str.equalsIgnoreCase(tersSTr)){
             System.out.println("girilen ifade POLİDROM");
         }  else System.out.println("Girilen ifade POLİDROM degıl");
    }


    public static class Task01 {
        /*
           Interview Question

                   Girilen  100’den kucuk bir tamsayi için
                   1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
                  - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
                  - Sayi 5’in kati ise sayi yerine "CAN'dır" yazdirin.
                  - Sayi hem 3’un hem 5’in kati ise sayi yerine "JavaCAN" prnt eden code create ediniz

    */
        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.println("Lütfen bir sayi giriniz :");
            int sayi = scan.nextInt();

            if (sayi>100){//girilen sayının 100 den kucuk olma sartı
                System.out.println("Lütfen 100 den kucuk sayi giriniz");
            }else {
                for (int i = 1 ; i<sayi; i++){
                    if (i%3==0 && i%5==0){//girilen sayıya kadar 3 e ve 5 e bolunmesını kontrol ettım
                        System.out.println("javaCAN");

                    } else if (i%3==0) {//girilen sayıya kadar 3 e bolunme kuralı
                        System.out.println("Java");
                    } else if (i%5==0) {
                        System.out.println("CAN'dır");
                    }else System.out.println(i+ " girdiginiz sayi hiç bir şart sağlamıyor");


                }
            }










        }
    }
}

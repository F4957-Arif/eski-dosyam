package Day06;

public class Q02_Forloop {
    public static void main(String[] args) {
//Interview Question
// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

     //  System.out.println( " ******* for ile******" );
     //  for (int i = 0; i <=255 ; i++) {
     //      char karekter = (char) i;
     //      System.out.println(i+ "-> "+karekter);

     //  }

      // System.out.println("  *****while*****  ");
      // int a=0;
      // while (a<=255){
      //     char c= (char) a;
      //     System.out.println(a+ " ->" + c);
      //     a++;
      // }
        System.out.println("  *****do while*****");
        int x=0;
        do {
            char k= (char) x;
            System.out.println(x+ " -->" + k);
            x++;
        }while (x<=255);





    }
}

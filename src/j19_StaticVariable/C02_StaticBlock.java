package j19_StaticVariable;


      /*
        1.static blok yapıları statıc varıable'ri deger ataması uptade içn kulanılır
        2.Static blok Class olusturuldugunda bütün methodlardan(main method dahıl) once calısır.
        3. Birden fazla statıc blok varsa yukarıdan asagıya sıralama ile calısır.
        */
      public class C02_StaticBlock {
 static String isim="Haluk";
          static {
              System.out.println("agam 2. statıc block calsıtı :)");
              isim="Ugur ";
              System.out.println("isim = " + isim);

          }
 static {
     System.out.println("agam 1. statıc block calsıtı:) ");
     isim="Dilek Hnm";
     System.out.println("isim = " + isim);


 }



    public static void main(String[] args) {
        System.out.println("maın method basladı......");
        isim="Kerim Bey";
        System.out.println("isim = " + isim);
        System.out.println("maın method bitti:( ");

    }//maın dısı
    static {
        System.out.println("agam 2. statıc block calsıtı :)");
        isim="Ugur ";
        System.out.println("isim = " + isim);

    }
}

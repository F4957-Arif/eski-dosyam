package j32_Abstract.abstract01;

public abstract class Honda {//parent abstract class

    public abstract void motor();//abstrac yaptık


     void sunrooff(){//sonroof her arabada olmak zorunda degıl ondan bady actık ısteyen kullansın dıye zorunlu degıl
         System.out.println("Agam kefini bilirsenn ama sunroof extra ucret");
     }
//soru : abs class da variable tanımlanabılır mı?
    String name="Arif";
//soru variableler abstract olarak tanımlanır mı?  cevap asagıda kesınlıkle hayır
//public abstract int yas=48;//olamaz
    abstract void koltuk();
     abstract void kapı();

    // final void finalMethod();//concrete method body siz olamaz

   //  final abstract void finalMethod(); -->abstractar final olamaz

  // private void private Method()//-->tanımlanamz

    // private abstract void privateMethod();-->tanımlanamz

   //  static void güneş method();-->tanımlanamz
  //  static abstract void güneş method();-->tanımlanamz

    //abstract amac zaten zorunluluktur ulassın alsın dıye

  //  Honda obj=new  Honda();//hata verır melekelr dogurmaz yanı abs obje uretmez



}

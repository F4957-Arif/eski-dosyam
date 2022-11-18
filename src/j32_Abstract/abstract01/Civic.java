package j32_Abstract.abstract01;

public class Civic extends Lastik{//Honda parent abs Class extend child concrete class
    /*
    extend Honda yazılarak Honda classa consrete bir Civik Class tanımlandı
    java CTR verdı..
    cozum olarak
    a)Unımplemented(Uyarlanmamıs) method implement edılmelı
    b)Parent Hond da classdan abstartc keyword kaldırılmamalı
    c)concerete olan child Ciciv class abstract yapılmalı..
     */

    //concrete class'da abstact method tanımlanır mı?
    //El cevap :
    //public abstract void absMethod();// ya class abs olmalı ya da method concrete body olmalı
    //TRICK-> child concrete class parent abs class'ın abs methodlarını mutlaka ımplement ovverıde etmelı



    @Override
    public void motor() {
        System.out.println("1.6 eco motor az yakar cok kacar agam");

    }

    @Override
    void koltuk() {
        System.out.println("agam ucus olsun dıye kumas koltuk  temız kullanın ");

    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan");

    }
    public int vites(){
        return 5;//concrete child method.Cıvıc Clasta kenımız method creat ettık ...
    }

    @Override
    public void lastikEbat() {
        System.out.println("21 inç lastık ");
    }


   // Honda obj=new Civic();//honda oglu cıvık
    //Civic obj1=new Civic();//Civic oglu cıvık yazdık
}

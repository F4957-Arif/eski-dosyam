package j32_Abstract.abstract01;

public abstract class Lastik extends Honda{//lastıkte abs oldugu ıcın Honda da abs oldugu ıcın uyarı vermedı

    public abstract void lastikEbat();//abs method yazıldı

    public void kıslastıgı(){//concrete method cunku parentezı var
        System.out.println("agam pis cezası var ıhmal etme");
    }
}

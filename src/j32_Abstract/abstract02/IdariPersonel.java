package j32_Abstract.abstract02;

public class IdariPersonel extends Personel {
    @Override//mecbur implement edılmelı
    public void maasHesapla() {//Personel parent class'dan ovverride abs meth.
        System.out.println("Agam frapan idarecımize saat bası $120 gayme ver");

    }

    @Override//mecbur implement edılmelı
    public void maasBilgisi() {////Personel parent class'dan ovverride abs meth.
        System.out.println("Agam cincık code yazan idari personele extradan bir ay ikramiye");

    }

    @Override//tercıhen ovverride edıldı
    public void sigorta() {//personel parent class dan ovverıde cons edılen
        System.out.println("agam cıncık coder personel full sıgorta");;
    }
}

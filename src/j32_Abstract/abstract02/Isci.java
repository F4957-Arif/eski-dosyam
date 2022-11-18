package j32_Abstract.abstract02;

public class Isci extends Personel{//abs Personel parent Clas'a extends->concrete child Isci class
    @Override
    public void maasHesapla() {//Personel parent class'dan ovverride abs meth.
        System.out.println("Agam marabalara en cok 499 gayme verıyoruz");

    }

    @Override
    public void maasBilgisi() {//Personel parent class'dan ovverride abs meth.
        System.out.println("Agam marabalar cay-cügara harıc gunde 8 saat kürek mahkumu ");

    }
}

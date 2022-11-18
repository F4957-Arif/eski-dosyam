package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1=new Isci();
        mrb1.maasBilgisi();//Agam marabalar cay-cügara harıc gunde 8 saat kürek mahkumu
        mrb1.maasHesapla();//Agam marabalara en cok 499 gayme verıyoruz
        mrb1.name="Ebubekir Bey";// Ebubekir Bey
        //name direk olusmaz
        System.out.println("mrb1.name = " + mrb1.name);// Ebubekir Bey
        mrb1.sigorta();//abs parent Clasdakı concreat meth obj call edıldı

        IdariPersonel cncCdr=new IdariPersonel();//Agam Özel Sigorta Kapsamındasın:)
        cncCdr.name="Dilek orjiklerın efendısı:)";
        System.out.println("cncCdr.name = " + cncCdr.name);// Dilek orjiklerın efendısı:)
        cncCdr.sigorta();//agam cıncık coder personel full sıgorta
        cncCdr.maasHesapla();//Agam frapan idarecımize saat bası $120 gayme ver
        cncCdr.maasBilgisi();//Agam cincık code yazan idari personele extradan bir ay ikramiye


    }
}

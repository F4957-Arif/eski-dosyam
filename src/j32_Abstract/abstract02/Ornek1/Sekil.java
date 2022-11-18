package j32_Abstract.abstract02.Ornek1;

public abstract class Sekil {
    private String name;

    public Sekil(){//p.siz parent cons

    }

    public Sekil(String name) {//p.li paren cons
        setName(name);
    }

    public String getName(String dikdörtgen_) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double alanHesapla();
    public abstract double cevreHesapla();
   // public void ciz(){
     //   System.out.println(this.name + "cizildi");
   // }
   public String ciz(){
       return this.name+ " cizildi";
   }

    @Override
    public String toString() {//obj valuelerı print eder
        return
                "şekilismi='" + this.name + '\'' +
                        "\n şekil alanı : "+this.alanHesapla()+//method call
                        "\n şekil cevre : "+this.cevreHesapla()+//method call
                        "\n sekil " +this.ciz();//ciz methodcall edildi

    }
}

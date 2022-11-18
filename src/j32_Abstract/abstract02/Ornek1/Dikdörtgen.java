package j32_Abstract.abstract02.Ornek1;

public class Dikdörtgen extends Sekil{

    private double uzunKenar;//ins varıable
    private double kisaKenar;

    public Dikdörtgen(double uzunKenar, double kisaKenar) {//ful p.li cons
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return (this.uzunKenar+this.kisaKenar)*2;
    }
}

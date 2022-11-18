package j32_Abstract.abstract02.Ornek1;

public class Cember extends Sekil{

    private double yariCap;
    private final double pi=3.14;//final degısmemesı ıcın

    public Cember(double yariCap) {//p.li cons
        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getPi() {// seti gelmedı cunku fınal
        return pi;
    }

    @Override
    public double alanHesapla() {
        return pi*this.yariCap*this.yariCap;
    }

    @Override
    public double cevreHesapla() {
        return 2*pi*this.yariCap;
    }
}

package GarryProjeler.YiyecekİcecekMakinesi;

public class Urun {

private double kraker=2.5;
private double cips=2.2;
private double CocaCola=2.2;
private double fanta=2.0;
private double su=1.0;
private double cay=1.5;
private double filtreKahve=1.99;
private double productNum;
private double price;

    public double getKraker() {
        return kraker;
    }

    public void setKraker(double kraker) {
        this.kraker = kraker;
    }

    public double getCips() {
        return cips;
    }

    public void setCips(double cips) {
        this.cips = cips;
    }

    public double getCocacola() {
        return CocaCola;
    }

    public void setCocacola(double cocacola) {
        this.CocaCola = cocacola;
    }

    public double getFanta() {
        return fanta;
    }

    public void setFanta(double fanta) {
        this.fanta = fanta;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getCay() {
        return cay;
    }

    public void setCay(double cay) {
        this.cay = cay;
    }

    public double getFiltreKahve() {
        return filtreKahve;
    }

    public void setFiltreKahve(double filtreKahve) {
        this.filtreKahve = filtreKahve;
    }

    public double getProductNum() {
        return productNum;
    }

    public void setProductNum(double productNum) {
        this.productNum = productNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Urun: " +
                " \n 1-kraker=₺" + kraker +
                ",\n 2-cips=₺" + cips +
                ",\n 3-cocacola=₺" + CocaCola +
                ",\n 4-fanta=₺" + fanta +
                ",\n 5-su=₺" + su +
                ",\n 6-cay=₺" + cay +
                ",\n 7-filtreKahve=₺" + filtreKahve +
                '}';
    }
}

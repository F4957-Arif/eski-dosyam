package j32_Abstract.abstract02.Ornek2;

public abstract class Salad extends Food{


    public abstract void madeIn();//parant ve child abs. classlardan aynı isim
    @Override
    public void taste() {
        System.out.println( "Agam salatan çoban söğüş mü verelim:) ");
    }
}

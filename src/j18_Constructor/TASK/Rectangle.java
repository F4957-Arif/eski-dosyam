package j18_Constructor.TASK;

public class Rectangle {
    /* Task 01 >
    fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
    Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */

    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public void cevre(){
        System.out.println("Dikdortgen Cevre = " + (width + length) * 2);
    }
    public void alan(){
        System.out.println(" Dikdörtgen Alan = " + (width * length));
    }
}

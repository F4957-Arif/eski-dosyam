package j26_Inheritance.Inheritance01;

public class Kedi extends Mammal{//Mammal parent Class child-torun
    /*
    Chilld class obj olmadan parent class variable ve methodlara ulasabılır
     */



    public Kedi(){//p,siz cons
        System.out.println("Agam ahan da kedi p,siz cons....");

    }
    public void cırmala(){
        System.out.println("kedi fena cırmalar miyavlar....");
    }
}

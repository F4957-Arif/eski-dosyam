package j25_Encapsulation.encapsulation01.encapsulation02;

public class Runner {
    public static void main(String[] args) {


    Kisi obj1=new Kisi("Ümit","K",33,"umitK33");
        System.out.println("obj1.ad = " + obj1.ad);//Ümit
        obj1.ad="Güzel İnsan umıt Bey";
        System.out.println("obj1.ad = " + obj1.ad);//Güzel İnsan umıt Bey
        System.out.println("obj1.soyad = " + obj1.soyad);//K
        System.out.println("obj1.getPassword() = " + obj1.getPassword());//UmitK33
        obj1.setYas(-34);
        System.out.println("obj1.getYas() = " + obj1.getYas());//-34//34

    }
}

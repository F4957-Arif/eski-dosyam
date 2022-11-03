package j25_Encapsulation.encapsulation01.encapsulation03;

public class Runner {//^3.step
    public static void main(String[] args) {
        //4
        Arac honda=new Arac("accord","siyah",-200,2012);//p.li
        Arac volvo=new Arac("s80","beyaz",2000,-2015);//p.li
        Arac hacıMurat=new Arac();//p.siz
        hacıMurat.setModel("serce");
        hacıMurat.setMotor(1300);
        hacıMurat.setYil(1974);
        hacıMurat.setRenk("cücük SARI");
        System.out.println("honda ne ararsan var onda "+honda);
        System.out.println("haci murat"+hacıMurat);
        System.out.println("isvec tankı "+volvo);















    }
}

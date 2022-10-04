package j11_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        String name = "Arif";
        System.out.println("car car" + name);
        C04_MethodDepo.gecmeNotu(24);//Depo klastan class name ile method kol ettik.C04_MethodDepo
        C04_MethodDepo.topla(3,5);
        /*
        farklı class dan method call etmek ıcın...
        1.method statıc ->göktekı güneş gibi
        2.ClasName.methodName() şeklinde caal edılır.
          aynı class daki method dogrudan mrthodName call edılır
         */
        selamVer();//aynı classdan methodName ile call edıldı//bunu buda calıstık cagırmadık


    }//main dısı
    public  static void selamVer(){
        System.out.println("agam selam damke ");
    }


}

package j11_MethodCreation;

public class C04_MethodDepo {

    //Main method olmayacak//malzeme tasıyan romörk gibi.bu romörko motora baglayacagız
    //ilk defa mainsiz calısacagız anketod olarak
    /*
    her clas' da main method yoktur
    */
    public static void gecmeNotu(int not){

        if (not>=85) {
            System.out.println("agam tebrık cok basarılı");
        } else if (not>=70) {
            System.out.println("agam basarılı");
        } else if (not>=60) {
            System.out.println("agam sadece gectın");
        } else if (not>=45) {
            System.out.println("agam ucuz yırttın ");
        }else System.out.println("agam fena caktın");

    }
    public  static void topla(int a,int b){
        System.out.println(a+b);
    }























}

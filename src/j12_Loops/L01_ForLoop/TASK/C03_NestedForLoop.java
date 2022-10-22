package j12_Loops.L01_ForLoop.TASK;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
        eger bir dongunun boody' sinde başka bir döngü bulunuyorsa bu tür döngülere
        nested-loop-->içiçe denir
        iç içe döngü dış döngünün her adımda tekrar çalısır
        iç içe döngulerde emn içteki dongü en önce calısır
         */

        for (int apt = 1; apt<=10; apt++){
            System.out.println("apt döngü:  " +apt);
            for (int daire= 1; daire<6; daire++){
                System.out.println("apt " +apt+ " için döngü daire " +daire);
            }
        }



    }
}

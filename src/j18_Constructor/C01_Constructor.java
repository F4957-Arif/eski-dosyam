package j18_Constructor;

public class C01_Constructor {

        /*
        1-constructor ismi Calss bome ile aynı olmalı.Büyük harf ile başlamalı
        2-constructor creta edıldıgınde name den sonra() {} mutlaka kullanılmalı
        3-eger p'li cons.create edıldginde java default cons ezer(siler)
        4-cons. return ype olmaz method'dan ayıran özelliğidir
        5-Class oluştşgşnda java default cons. kendi creat eder.
         */
            String str;//inst variable yanı obje varıable
            String selam="güzel insan";

           // C01_Constructor obj1         =new               C01_Constructor();
        public static void main(String[] args) {
            //class name  //obje name   new keyword         default cons.
            C01_Constructor obj1         =new               C01_Constructor();
            C01_Constructor obj2         =new               C01_Constructor();
            C01_Constructor obj3         =new               C01_Constructor();
            C01_Constructor obj4         =new               C01_Constructor();

            obj1.str="javacan";//str ins variable obj1 ile call edılerek obj1 javacan degeri atandı

            obj2.str="javatar";//str ins variable obj2 ile call edılerek obj1 javatar degeri atandı

            System.out.println(obj3.selam);//güzel insan
            System.out.println("obj1.str = " + obj1.str);//obj1.str = javacan
            System.out.println("obj2.str = " + obj2.str);//obj2.str = javatar
            System.out.println("obj4.str = " + obj4.str);//obj4.str = null
            obj3.aga();//agama selam soyle:)
            obj2.aga();//agama selam soyle:)

        }//main sonu
        public  void aga(){
            System.out.println("agama selam soyle:) ");
        }
}

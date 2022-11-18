package j26_Inheritance.task01;

public class Runner {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("a.mesaj = " + a.mesaj);//Agam a A Class' dan hörmetler
        System.out.println("A.mesaj = " + A.mesaj);//A class ile statıc varıable call
        B b = new B();

        System.out.println("b.mesaj = " + b.mesaj);//static varıable inheritance da ClassName olmadan call edılır
        System.out.println("B.mesaj = " + B.mesaj);


    }
}
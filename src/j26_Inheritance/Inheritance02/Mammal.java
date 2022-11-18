package j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancık {
    public Mammal() {//p'siz cons
        this('Y');//bu class ın paremetrelı cons call edıldı
        System.out.println("Agam ahan da Mammal p'siz cons...");
    }
    public Mammal(char c) {//p'li cons
        super(17);//parent Hayvancık plas paremetrelı cons call edıldı
        System.out.println("Agam ahan da Mammal p'li cons...");
    }
    public void mC(){
        System.out.println(" mC - > Mammal  class meth call.");
    }
    int m=1;
    int c=4;

    @Override
    public void mM() {//parentten  ezen method
        System.out.println(" mM - > Mammal  class meth call.");
    }
}// Class sonu



package j014_Scope;

public class C03_Scope {
//C01 Clasından method call edıyoruz
    public static void main(String[] args) {
        C01_InstanceVariable kus =new C01_InstanceVariable();//istedıgım
        kus.name="HÜMA";
        kus.developerMı=false;
        System.out.println("kus.name = " + kus.name);
        C01_InstanceVariable.staticMethod();//class mail ile statıc method call edıldı.
        kus.non_staticMethod();//obje ıle statıc olmayan yanı nan statıc method call ettık


    }
}

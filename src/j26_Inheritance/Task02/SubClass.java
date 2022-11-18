package j26_Inheritance.Task02;

public class SubClass extends SuperClass {//2 madde

    public static void main(String[] args) {

        SubClass obj=new SubClass();
        obj.my_method();

    }

    int num=10;
    public void my_method(){
        goster();//Sub class call yano kendı class
        super.goster();//Super Class yanı ata baba call
        System.out.println("SubClass num : " + num);
        System.out.println("SuperClass num :" +super.num);

    }

    @Override
    public void goster() {

        System.out.println("Bu method Sub Classın görüntüleme metehodudur");
    }

}

package j32_Abstract.abstract01;

public class Accord extends Honda {
    @Override
    public void motor() {// almak zorundasın  abs method
        System.out.println("Agam 2.0 turbo ateile hız felaket ttir");

    }

    @Override
    void koltuk() {//almak kzorundasın abs method
        System.out.println("Agam deri koltuk ter yapar pişik olmayasın");

    }

    @Override
    void sunrooff() {// bunu alsamda almasamda olur ama dıger methodlar mecbur
        System.out.println("agam cugara yakınca sunroof acmayı unutma");
    }

    @Override
    void kapı() {//almak zorundasın abs method
        System.out.println("Agam vakumlu kapı çarpılmayasan:) ");

    }
}

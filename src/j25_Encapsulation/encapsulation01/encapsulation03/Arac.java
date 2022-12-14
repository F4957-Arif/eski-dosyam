package j25_Encapsulation.encapsulation01.encapsulation03;

public class Arac {
    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
  olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- Runner isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz
     */
    //fields
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Arac(String model, String renk, int motor, int yil) {//2.step full pli cons
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        setMotor(motor);//set method call edıldı
        //this.yil = yil;
        setYil(yil);
    }

    public Arac() {//p.siz cons 4.step
    }
    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("agam bisiklete bineydın daha hızlı giderdin ");
            this.motor=1001;
        }else this.motor = motor;

    }
    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("agam nişeding milattan once araba vardı da biz mi binemedık");
        }else this.yil = yil;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }



    public int getYil() {
        return yil;
    }



    @Override
    public String toString() {
        return "agam tekere taş degmesın " +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil ;

    }
}

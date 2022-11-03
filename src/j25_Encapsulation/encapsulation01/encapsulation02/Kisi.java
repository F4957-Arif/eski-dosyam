package j25_Encapsulation.encapsulation01.encapsulation02;

public class Kisi {//pojo class

  /*
    task->kisi pojo clas için fields-> ad, soyad, password(String),yas
    tüm  field ları kullanıcı görebilmeli ve password hariç update edebilmeli
    (password encapsuleted, update edilmemeli)
    yas variable negatif değer girmeye karşı encapsule et

    runner class da obj ile field ları print eden

    code creat ediniz

     */

    //fields
    String ad;
    String soyad;
    private int yas;
    private String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);//paremetre gelen yas - den kurtulması ıcın bu method
   if (yas<0){
       this.yas=yas*(-1);
   }else this.yas=yas;
    }

    public String getPassword() {
        return password;
    }
}

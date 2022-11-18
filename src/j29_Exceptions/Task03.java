package j29_Exceptions;

public class Task03 {
    public static void main(String[] args) {
        //'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
//int v = vize
//int f = final
//Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
//Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
//Diğer durumlarda ise,
//vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
//vizeye 120, finale 80 girin.Programın çalışmasını sağlayın. (handle edin)


        ortalama(120,80);
    }

    public static void ortalama(int v,int f ) {
        try {

            if((v<0 || v>100 ) || (f<0 || f>100)){
                throw new ArithmeticException();
            }else System.out.println(((v * 0.40 + f * 0.60)));


        }catch (ArithmeticException e){
            System.out.println("Notlar 0-100 arasında olmalı");
        }
    }}


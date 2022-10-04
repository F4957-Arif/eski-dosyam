package j11_MethodCreation;

import java.util.Scanner;

public class TaskMesaiSorusu {

    /*
Fazla mesaiyi hesaplayan bir  method create ediniz
Yazacağınız program toplam kazancı return etsin.

Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

Daha sonra şu şekilde bir program yazınız :

Örnek :
saatlik çalışma ücreti : 40.0
hangi saat başladı : 9.0
hangi saat bitti : 20.0
mesaiyi kaçla katlayacağız : 1.8

ucretHesapla(9.0,20.0,40.0,1.8);

9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

toplam = 536.0
*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("mesa başlama satınızı yazınız :");
        double star= scan.nextDouble();
        System.out.println("mesai bitiş saatını yazınız :");
        double finish= scan.nextDouble();

        System.out.println("mesai saat ücretini yazınız :");
        double satUcreti= scan.nextDouble();

        System.out.println("fazla mesai  ücret katsayısını yazınız :");
        double ucretKatsayi= scan.nextDouble();

        System.out.println(ucretHesapla(9.0, 20.0, 40.0, 1.8));
        System.out.println(ucretHesapla(star, finish, satUcreti, ucretKatsayi));//Dynamik kod


    }//main dısı

    private static double ucretHesapla(double baslama, double bitiş, double saatUcreti, double ucretKatsayısı) {
       double yevmiye1= (17-baslama)*saatUcreti;
       double yevmiye2= (bitiş-17)*saatUcreti*ucretKatsayısı;


        return yevmiye1+yevmiye2;





    }


}

package j10_StringManipulations;

import java.util.Scanner;

public class C07_IndexOf_lastlndexOf {

    public static void main(String[] args) {

        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str = "Good";
        System.out.println(str.indexOf('o'));//1
        System.out.println(str.indexOf('d'));//3
        System.out.println(str.indexOf('D'));//-1 D karekterı olmadıgı ıcın
        //Olmayan karekter index sorgulanırsa -1 return eder.
        System.out.println("Od nun yeri index nosu : "+str.indexOf("od"));//2
        System.out.println("Od nun yeri index nosu : "+str.indexOf("Od"));//-1

/** lastIndexOf()
 *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
 *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */

    String isim= "Mustafa Nizamoğlu";
        System.out.println(isim.indexOf('a'));//4
        System.out.println(isim.lastIndexOf('a'));//11
        System.out.println(isim.lastIndexOf("fa"));//fa
        System.out.println(isim.indexOf("fa"));//fa

/*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */

        Scanner sc = new Scanner(System.in);
        System.out.print("kafi mikta bir cümle  giriniz : ");

        String cumle = sc.nextLine().toLowerCase();
        if (cumle.indexOf("java") == -1) {
            System.out.println("Girilen cumle java icermiyor");
        }else if (cumle.indexOf("java") == cumle.lastIndexOf("java")){
            System.out.println("Girilen cumle 1 tane java iceriyor");
        }else System.out.println("Girilen cumlede birden fazla java var");

    }
}

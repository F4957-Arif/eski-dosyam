package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task02_Bakkal {
    static Scanner scan = new Scanner(System.in);
    static List<String> gunler = new ArrayList<>(Arrays.asList(" 1.Gun ", " 2.gun ", " 3.gun ", " 4.gun ", " 5.gun ", " 6.gun ", " 7.gun "));
    static List<Integer> kazanc = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */

        int toplamkzanc=0;
        Scanner scan = new Scanner(System.in);
        int dongu = 0;
        do {
            System.out.println(gunler.get(dongu) + " kazanc bilgisi giriniz");
            kazanc.add(scan.nextInt());
            toplamkzanc += kazanc.get(dongu);
            dongu++;
        } while (dongu < 7);
        scan.close();
        System.out.println("Son 7 gun icindeki ortalama kazanciniz = " + getOrtalamaKazanc(toplamkzanc));
        System.out.println("Ortalamanin altinda kazanmadiginiz gunler : " + getOrtalamaninUstundeKazancGünleri(getOrtalamaKazanc(toplamkzanc)));
        System.out.println("Ortalamanin altinda kazandiginiz gunler : " + getOrtalamaninAltindaKazancGünleri(getOrtalamaKazanc(toplamkzanc)));
    }
    public static double getOrtalamaKazanc(int toplamkzanccc) {
        return toplamkzanccc / gunler.size();
    }
    public static String getOrtalamaninUstundeKazancGünleri(double g) {
        String kazancgunleri = "";
        for (int i = 0; i < gunler.size() ; i++) {
            if (kazanc.get(i) > g) {
                kazancgunleri += gunler.get(i);
            }
        }
        return kazancgunleri;
    }
    public static String getOrtalamaninAltindaKazancGünleri(double g) {
        String kayipgunleri = "";
        for (int i = 0; i < gunler.size() ; i++) {
            if (kazanc.get(i) < g) {
                kayipgunleri += gunler.get(i);
            }
        }
        return kayipgunleri;



    }
}

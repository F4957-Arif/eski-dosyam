package j15_Arrays.Task;

public class Task16 {
    public static void main(String[] args) {

        //sayi Array dakı son elemnalrının carpımını prınt eden code creat edınız
        int sayi[][]={{1,2,3},{9,8},{24,0,4}};
        int carpım=1;
        for (int kat = 0; kat < sayi.length; kat++) {

                carpım*=sayi[kat][sayi[kat].length-1];




        }
        System.out.println("carpım = " + carpım);//96->3*8*4
    }
}

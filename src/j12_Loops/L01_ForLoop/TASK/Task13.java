package j12_Loops.L01_ForLoop.TASK;

public class Task13 {
    public static void main(String[] args) {
        /*
A
B B
C C C
D D D D
E E E E E
F F F F F F
şekli yazdırınız
*/
        char harf=65;//a nın char degeri
        for (int i=0;i<6;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (harf + i) + " ");
            }
            System.out.println();

        }
    }
}

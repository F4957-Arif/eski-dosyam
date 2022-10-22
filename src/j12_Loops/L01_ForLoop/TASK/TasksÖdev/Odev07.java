package j12_Loops.L01_ForLoop.TASK.TasksÖdev;

public class Odev07 {
    public static void main(String[] args) {
      //  TASK7:

//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        int k = 5;
        for (int i = 1; i <= k; i++) {
            int f = k - 1;
            int v = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(v + " ");
                v += f;
                f--;
            }
            System.out.println();
        }

    }
}

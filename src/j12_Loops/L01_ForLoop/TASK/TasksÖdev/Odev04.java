package j12_Loops.L01_ForLoop.TASK.TasksÖdev;

public class Odev04 {
    public static void main(String[] args) {

         /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.
         */

        for (int i = 0; i <=100 ; i++) {
          //   if (i%5==0 && i%4==0){
           //     System.out.println(i+ " sayisi hem 4 e hem 5 e aynı anda bolunebılır");

                String s = (i % 5 == 0 && i % 4 == 0) ? i + " " : "";
            System.out.print(s);

            }
        }


    }


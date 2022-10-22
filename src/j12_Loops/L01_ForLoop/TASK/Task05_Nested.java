package j12_Loops.L01_ForLoop.TASK;

public class Task05_Nested {
    public static void main(String[] args) {

        /*
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #

konsolda bu şekli versin

         */

for (int i=1; i<=6; i++){

    for (int j=1; j<6; j++){
        System.out.print(" # ");
    }
    System.out.println();//boş komut hayalı
}
/*
         farklı yol
         for (int i = 1 ; i <= 5 ; i++) {
	    System.out.println(" ");
		for (int j = 1 ; j<=5;j++) {
		System.out.print("#");}
		}
 */


    }
}

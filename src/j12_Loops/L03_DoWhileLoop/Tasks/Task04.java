package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
		Scanner scan =new Scanner(System.in);
		int adet =0;
		int i=999;
		while (i>=100){
			if (i%4==0&& i%6==0){
				adet++;
				System.out.print(i+" ");}
			i--;
		}System.out.print("\n" + adet +"\tadet sayı 4 ve 6 ya tam bölünebilmektedir.");

		
		
			
	}

}

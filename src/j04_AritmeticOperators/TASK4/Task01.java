package j04_AritmeticOperators.TASK4;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//4+1
        x += x;//5+5=10
        --x;//-1+10=9
        x = 7 + x;//9+7=16
        x *= x;//16*16=256
        x -= 3;//256-3

        System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;//3+4,5=7,5
        a+=d;//7,5+3=10,5
        d-=a;//7,5-10=-2,5
        a-=d;//10 - - 2,5= 12,5

        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );


        
        

	}

}

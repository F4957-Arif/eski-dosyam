package j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {
        /*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
        */
        int sayi=5;
        String str1="muharrem";
        String str2="ugur";
        String str3="ebıkGAbık";
        /*
        farklı yol:
        public static void a(int a , String ... str) {
		String flag="";
		for(String value : str) {
			flag=value.length()>flag.length()? value : flag;
		}
		System.out.println(a*flag.length());
	}
         */




        carpStringEnUzun(sayi, str1, "JavaCan", str2, str3);//45


    }//main sonu

    public static void carpStringEnUzun(int carpacakSayi, String ... str) {
        String enUzun = "";
        for (String a : str) {
            if (a.length() > enUzun.length()) {
                enUzun = a;
            }
        }
        System.out.println("agam istedigin deger : " + (carpacakSayi * enUzun.length())+" "+enUzun);
    }
}

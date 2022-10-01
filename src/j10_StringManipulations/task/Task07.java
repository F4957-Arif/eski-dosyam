package j10_StringManipulations.task;

public class Task07 {
    public static void main(String[] args) {

      /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   */
        String  harfDepo = "ABCDEFGHIİJKLMNOPQRSTUVWXYZ";
        char a = harfDepo.charAt(harfDepo.indexOf("A"));
        char r = harfDepo.charAt(harfDepo.indexOf("R"));
        char i = harfDepo.charAt(harfDepo.indexOf("İ"));
        char f = harfDepo.charAt(harfDepo.indexOf("F"));
        System.out.println(a+r+i+f);//asciiii verir
        System.out.println("" +a+r+i+f);//arif
































    }
}

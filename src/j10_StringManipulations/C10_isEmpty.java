package j10_StringManipulations;

public class C10_isEmpty {
    public static void main(String[] args) {
        /*
  StringIsEmpty
   String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
  isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
  Yani o String'in length() 0 demektir.
 */
//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler



        String str = "hi";
        System.out.println("Str bos mu : "+str.isEmpty());//false
        System.out.println(str.replaceAll("\\w", "").isEmpty());


    }
}

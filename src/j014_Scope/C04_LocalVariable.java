package j014_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {//maın bası
        int yas=33;//maın method local varıable

        System.out.println("yas = " + yas);
        for (int i = 0; i <7 ; i++) {
            System.out.println(yas+" :)");//yass local varıable aynı locale call edıldı.
        i++;//i loop varıable loop ıcıne call edıldı .
        }//for sonu
        //i=34;//local dısı call edılemez
        yas=35;//local varıable call edıldı

    }//maın dısı
    //yas=48;//local dısı call edılemz
}

package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    /*
    arr ve varargs methot
     */
    public static void main(String[] args) {
        int arr[]={24,43,33,19,34,45,58,38};
        System.out.println("arrtopla(arr) = " + arrtopla(arr));//294
        System.out.println("varargsTopla = " + varargsTopla(24, 43, 33, 19, 34, 45, 58, 38));//294
        System.out.println("varargsTopla(arr) = " + varargsTopla(arr));//294

        //ahan da trıck kosesınde bugun : varargs method paaremetrelerın array gibi tanımladıgı ıcın varargs methoda perametre olarak array de verılebılır

        //task1->verılen array elemanları toplamını prınt eden code creat ewdınız
        //task2->task1 varargs ile alısınız

    }//main sonu
    public static int arrtopla(int[] a){//task1
        int toplam=0;
        for (int w:a) {
            toplam+=w;

        }

        return toplam;

    }
    public static int varargsTopla(int ... b){//Task 2
        int toplam=0;
        for (int s:b) {
            toplam+=s;

        }

        return toplam;

    }






}


package j17_ForEachLoup;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task array elamanlarının çarpımını print eden code create ediniz...-> with for-each


        int arr[][]={{2,3},{4},{5,6,7}};
        int carpım=1;
        for (int kç[]:arr) {
            for (int a:kç) {
               carpım*=a;
            }

        }
        System.out.println("carpım = " + carpım);//carpım = 5040

    }
}

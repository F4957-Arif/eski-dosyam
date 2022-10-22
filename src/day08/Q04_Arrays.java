package day08;

public class Q04_Arrays {
    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz
     * int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */
    public static void main(String[] args) {
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        toplamDokuz(arr,istenenToplam);

    }

    private static void toplamDokuz(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length ; i++) {//outer loop
            for (int j =i+1;  j <arr.length ; j++) {//inner Loop
            if (arr[i]+arr[j]==istenenToplam){
                System.out.println(arr[i]+ " ve " + arr[j]+"toplam: " +istenenToplam );
            }

            }


        }
    }
}

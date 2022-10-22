package day08;

public class Q02_Arrays {
    /*
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan veortalamadan büyük olan
     * elamanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     * Outpur2:5,6,7
     *
     */
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];

        }
        double ortalam =toplam/arr.length;
        System.out.println("ortalam = " + ortalam);


        System.out.println("ortalamadan buyuk olan elemanlar: ");
        for (int i = 0; i <arr.length ; i++) {
            if (ortalam<arr[i]){
                System.out.print("arr[i] = " + arr[i]+" ");
            }

        }
    }

}

package day11;

public class Q06_Varargs02 {
    public static void main(String[] args) {
        // Create a multiply method with double varargs (return double)


       carp();


    }

    private static int carp(int... a) {
        int carpim=1;
        for(int value : a) {
            carpim+=value;
        }
        return carpim;
    }
}

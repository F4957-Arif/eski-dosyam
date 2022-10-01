package Day04;

import java.util.Scanner;

public class Q07_StringManipulation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
       String s = "xy.z";
       boolean xyzİçeriyormu = false;
       if (s.contains("xyz")){
           xyzİçeriyormu=true;
           System.out.println(xyzİçeriyormu);
       }else {
           xyzİçeriyormu=false;
           System.out.println(xyzİçeriyormu);
       }


    }
}

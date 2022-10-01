package j10_StringManipulations;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class TaskReplace {
    public static void main(String[] args) {
        String isim="Arif Nihat  ";
        String soyisim="ASYA";
        String kartno="1234123412341234";
        String yeniİsim=isim.charAt(0)+isim.substring(1,isim.indexOf(" ")+1).replaceAll("\\w","*")
                +isim.charAt(isim.indexOf(" ")+1)+isim.substring(isim.indexOf(" ")+2).replaceAll("\\w","*");
        String yenisoyisim=soyisim.charAt(0)+soyisim.substring(1).replaceAll("\\w","*");
        String yenikartno="**** **** **** "+kartno.substring(12);
        System.out.println("isim-soyisim: "+yeniİsim+yenisoyisim+" kartno: "+yenikartno);
    }
}

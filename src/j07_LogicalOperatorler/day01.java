package j07_LogicalOperatorler;

public class day01 {
    public static void main(String[] args) {
       // System.out.println("S\nU\nC\nC\nE\nS\nS\nWİTH \nC\nL\nA\nR\nU\nS\nW\nA\nY");


        System.out.println("welcome to Java Classs");
        /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         * !!! soutv degeri ile yazdirma
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //Her veri turuyle bir tane olmak uzere  degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim


        byte bytemin = Byte.MIN_VALUE;
        System.out.println("bytemin = "+ bytemin);
        byte bytemax = Byte.MAX_VALUE;
        System.out.println("bytemax = "+ bytemax);
        short shortmin = Short.MIN_VALUE;
        System.out.println("mindeger ="+ shortmin);
        short shortmax =Short.MAX_VALUE;
        System.out.println("maxDeger = "+shortmax);
        long min = Long.MIN_VALUE;
        System.out.println("min = "+min);
        long max = Long.MAX_VALUE;
        System.out.println("max = "+ max);
        double minDeger = Double.MIN_VALUE;
        System.out.println("minD =" + minDeger);
        double maxDeger = Double.MAX_VALUE;
        System.out.println("maxdeger ="+maxDeger);
        float sayi =Float.MIN_VALUE;
        System.out.println("deger = "+sayi);
        float sayii =Float.MIN_VALUE;
        System.out.println("deger = "+ sayii);

        float laptopFiyat = 9999.99F;
        double kilometre = 123.5;
        char cinsiyet = 'E';
        boolean dogruMu = true;
        System.out.println("laptopFiyat = " + laptopFiyat);
        System.out.println("kilometre = " + kilometre);
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("dogruMu = " + dogruMu);



    }



    }


package j24_AccessModifier.farkliPackage;

import j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {
    private  String privaTeamLead="Hakan Bey";
    String defaultName="Cebrail Bey";
    protected  String protectedName="Dilek Hanım";
    public String publicName="Gamze Hanım";


        public static void main(String[] args) {

            C01_AccessModifier obj9= new C01_AccessModifier(23,63);//public cons.
            //agama public cons. selam :)
            System.out.println("obj9.publicYas = " + obj9.publicYas);//48->public variable
            // obj9.defaultYas// default variable package dısı erişlimez
            // obj9.protectedMethod()//protected methoc package dışı call edilemez


        }

}

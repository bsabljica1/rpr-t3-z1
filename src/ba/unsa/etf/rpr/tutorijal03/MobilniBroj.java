package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mob_mreza;
    private String br;



    MobilniBroj (int mobilnaMreza, String broj) {
        mob_mreza=mobilnaMreza;
        br=broj;
    }

    public String ispisi() {
        String s=new String();
        s=mob_mreza+/+br;
        System.out.println(s);
    }
}

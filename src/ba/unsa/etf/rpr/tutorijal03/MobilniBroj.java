package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mob_mreza;
    private String br;
    MobilniBroj (int mobilnaMreza, String broj) {
        mob_mreza=mobilnaMreza;
        br=broj;
    }

    @Override
    public String ispisi() {
        String s=new String();
        s="0"+mob_mreza+"/"+br;
        return s;
    }
}

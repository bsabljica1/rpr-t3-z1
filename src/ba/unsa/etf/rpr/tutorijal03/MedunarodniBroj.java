package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private int broj;
    public MedunarodniBroj(String drz, int br){
        drzava = drz;
        broj = br;
    }

    @Override
    public String ispisi(){
        String s = new String();
        s = drzava + broj;
        return s;
    }
}
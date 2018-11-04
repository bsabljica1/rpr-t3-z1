package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;
    public MedunarodniBroj(String drz, String br){
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
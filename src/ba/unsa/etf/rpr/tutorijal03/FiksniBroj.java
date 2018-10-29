package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private String fiksnibroj;
    private Grad gradovi;
    private int[] pozivni={030,031,032,033,034,035,036,037,038,039,049};


    public enum Grad {TRAVNIK,ODZAK,ZENICA,SARAJEVO,LIVNO,TUZLA,MOSTAR,BIHAC,GORAZDE,LJUBUSKI,BRCKO};

    FiksniBroj (Grad grad, String broj) {
        fiksnibroj=broj;
        gradovi=grad;
    }

    public String ispisi() {
        String s=new String();
        s=pozivni[gradovi]+/+fiksnibroj;
        System.out.println(s);
    }
}

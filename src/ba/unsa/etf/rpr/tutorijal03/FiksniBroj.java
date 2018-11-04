package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private String fiksnibroj;
    private Grad grad;
    private int[] pozivni={30,31,32,33,34,35,36,37,38,39,49};
    private int p;


    public enum Grad {TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKI_BRIJEG, BRCKO};

    FiksniBroj (Grad grad, String broj) {
        fiksnibroj=broj;
        this.grad=grad;
        if (grad==Grad.TRAVNIK) p=0;
        else if (grad==Grad.ORASJE) p=1;
        else if (grad==Grad.ZENICA) p=2;
        else if (grad==Grad.SARAJEVO) p=3;
        else if (grad==Grad.LIVNO) p=4;
        else if (grad==Grad.TUZLA) p=5;
        else if (grad==Grad.MOSTAR) p=6;
        else if (grad==Grad.BIHAC) p=7;
        else if (grad==Grad.GORAZDE) p=8;
        else if (grad==Grad.SIROKI_BRIJEG) p=9;
        else if (grad==Grad.BRCKO) p=10;
    }

    public Grad getGradZaPozivni() {
        return grad;
    }

    @Override
    public String ispisi() {
        String s=new String();
        s="0"+pozivni[p]+"/"+fiksnibroj;
        return s;
    }
}

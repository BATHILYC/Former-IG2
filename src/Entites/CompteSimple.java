package Entites;

public class CompteSimple extends Compte {
    private float decouvert;

    public CompteSimple(int code, float solde, float decouvert) {
        super(code, solde);
        this.decouvert = decouvert;
    }

    public CompteSimple(float decouvert) {
        this.decouvert = decouvert;
    }

    public CompteSimple(int code, float solde) {
        super(code, solde);
    }

    public CompteSimple() {
        super();
    }

    @Override
    public void retirer(float mt) {
        super.retirer(mt);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

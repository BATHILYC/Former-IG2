package Entites;

import java.lang.ref.Cleaner;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class CompteEpargne extends Compte {
    private float taux;

    public CompteEpargne(int code, float solde, float taux) {
        super(code, solde);
        this.taux = taux;
    }

    public CompteEpargne(float taux) {
        this.taux = taux;
    }

    public CompteEpargne() {
        super();
    }

    public void catcullnterets() {

    }

    public CompteEpargne(int code, float solde) {
        super(code, solde);
    }

    @Override
    public void verser(float mt) {
        super.verser(mt);
    }

    @Override
    public void retirer(float mt) {
        super.retirer(mt);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public float getTaux() {
        return taux;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "taux=" + taux +
                ", solde=" + solde +
                '}';
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
}

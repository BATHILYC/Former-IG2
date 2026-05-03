package Entites;

import java.util.Date;

public class Compte {

    private int code;
    protected float solde;
    private static int nbComptes;
    private Date createdDate;
    private Date updatedDate;

    public Compte(int code, float solde) {
        this.code = code;
        this.solde = solde;
    }

    public Compte(int code, float solde, Date createdDate, Date updatedDate) {
        this.code = code;
        this.solde = solde;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Compte( ){
        ++nbComptes;
        code=nbComptes;
        this.solde=0;
    }
    public void verser(float mt){
        solde+=mt;
    }
    public void retirer(float mt){
        if(mt<solde) solde-=mt;
    }
    public String toString(){
        return("Code="+code+" Solde="+solde);
    }

}

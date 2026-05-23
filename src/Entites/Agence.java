package Entites;

import java.lang.ref.Cleaner;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class Agence {
    private int Nagence;
    private String nom;
    private String Adresse;
    private String contact;
    private String email;
    private int nbpersonne;

    public Agence(int nagence, String nom, String adresse, String contact, String email, int nbpersonne) {
        Nagence = nagence;
        this.nom = nom;
        Adresse = adresse;
        this.contact = contact;
        this.email = email;
        this.nbpersonne = nbpersonne;
    }

    public int getNagence() {
        return Nagence;
    }

    public void setNagence(int nagence) {
        Nagence = nagence;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNbpersonne() {
        return nbpersonne;
    }

    public void setNbpersonne(int nbpersonne) {
        this.nbpersonne = nbpersonne;
    }

    /**
     * Constructs a new object.
     */
    public Agence() {
        super();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Agence{" +
                "Nagence=" + Nagence +
                ", nom='" + nom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", nbpersonne=" + nbpersonne +
                '}';

    }
}

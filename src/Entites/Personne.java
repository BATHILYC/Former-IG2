package Entites;

import java.util.Date;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String adress;
    private  String phone;
    private Date dateNaiss;
    private Date createDate;
    private Date updatedDate;
    private  Date createdDate;
    private Date UpdatedDate;

    public Personne(int id, String nom, String prenom, int age, String adress, String phone, Date dateNaiss, Date createDate, Date updatedDate, Date createdDate, Date updatedDate1) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
        this.dateNaiss = dateNaiss;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
        this.createdDate = createdDate;
        UpdatedDate = updatedDate1;
    }

    public Personne(int id, String kane, String boureima, int age, String kalaban, String number, int i, int i1, int i2, int i3, int i4) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        String s= "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", dateNaiss=" + dateNaiss +
                ", createDate=" + createDate +
                ", updatedDate=" + updatedDate +
                ", createdDate=" + createdDate +
                ", UpdatedDate=" + UpdatedDate +
                '}';
        System.out.println(s);
        return s;
    }

}

package Principales;

import Entites.*;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Compte CP2= new Compte(15,75,new Date(),new Date());
        Compte CP3= new Compte(12,45,new Date(),new Date());
        Compte CP4= new Compte(16,15,new Date(),new Date());
        Compte CP5= new Compte(18,95,new Date(),new Date());
        Compte CP6= new Compte(12,25,new Date(),new Date());

        System.out.println(CP2.toString());
        System.out.println(CP3.toString());
        System.out.println(CP4.toString());
        System.out.println(CP5.toString());
        System.out.println(CP6.toString());


        CompteEpargne CPE2= new CompteEpargne(145);
        CompteEpargne CPE3= new CompteEpargne(25);
        CompteEpargne CPE4= new CompteEpargne(45);
        CompteEpargne CPE5= new CompteEpargne(24);

        System.out.println(CPE2.toString());
        System.out.println(CPE3.toString());
        System.out.println(CPE4.toString());
        System.out.println(CP5.toString());





        ComptePayant CPP2= new ComptePayant(120,152);
        ComptePayant CPP3= new ComptePayant(121,153);
        ComptePayant CPP4= new ComptePayant(122,154);
        ComptePayant CPP5= new ComptePayant(123,155);
        ComptePayant CPP6= new ComptePayant(124,156);

        System.out.println(CPP2.toString());
        System.out.println(CPP3.toString());
        System.out.println(CPP4.toString());
        System.out.println(CPP5.toString());
        System.out.println(CPP6.toString());




        CompteSimple CPS2= new CompteSimple(400);
        CompteSimple CPS3= new CompteSimple(405);
        CompteSimple CPS4= new CompteSimple(407);
        CompteSimple CPS5= new CompteSimple(4005);
        CompteSimple CPS6= new CompteSimple(409);

        System.out.println(CPS2.toString());
        System.out.println(CPS3.toString());
        System.out.println(CPS4.toString());
        System.out.println(CPS5.toString());
        System.out.println(CPS6.toString());

        Personne p1= new Personne(1,"Kane","Boureima",18,"Kalaban","82821463",new Date(),new Date(),new Date(),new Date(),new Date());
        Personne p2= new Personne(2,"Toure","Mata",22,"Kati","82821463",new Date(),new Date(),new Date(),new Date(),new Date());
        Personne p3= new Personne(3,"Maiga","Fanta",14,"Segou","82821463",new Date(),new Date(),new Date(),new Date(),new Date());
        Personne p4= new Personne(4,"Kamaté","Baba",18,"Kidal","82821463",new Date(),new Date(),new Date(),new Date(),new Date());
        Personne p5= new Personne(5,"Zouboye","Amar",25,"Niamakorocourani","82821463",new Date(),new Date(),new Date(),new Date(),new Date());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());






    }
}

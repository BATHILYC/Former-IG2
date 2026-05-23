package View;

import Entites.Agence;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AgenceForm extends JFrame {

    private JTextField txtId, txtNom, txtAdresse,
            txtContact, txtEmail, txtNbPersonne;

    private JButton btnEnregistrer, btnSupprimer, btnListe;

    private ArrayList<Agence> listeAgences = new ArrayList<>();

    public AgenceForm() {

        setTitle("Formulaire Agence");
        setSize(450, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // FORMULAIRE
        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(7, 2, 10, 10));

        panel.setBorder(
                BorderFactory.createEmptyBorder(
                        15,
                        15,
                        15,
                        15
                )
        );

        panel.add(new JLabel("ID Agence"));
        txtId = new JTextField();
        panel.add(txtId);

        panel.add(new JLabel("Nom"));
        txtNom = new JTextField();
        panel.add(txtNom);

        panel.add(new JLabel("Adresse"));
        txtAdresse = new JTextField();
        panel.add(txtAdresse);

        panel.add(new JLabel("Contact"));
        txtContact = new JTextField();
        panel.add(txtContact);

        panel.add(new JLabel("Email"));
        txtEmail = new JTextField();
        panel.add(txtEmail);

        panel.add(new JLabel("Nombre Personnes"));
        txtNbPersonne = new JTextField();
        panel.add(txtNbPersonne);

        // BOUTONS
        btnEnregistrer = new JButton("Enregistrer");
        btnSupprimer = new JButton("Supprimer");
        btnListe = new JButton("Liste");

        // PANEL BOUTONS
        JPanel panelBoutons = new JPanel();

        panelBoutons.setLayout(
                new FlowLayout(
                        FlowLayout.CENTER,
                        20,
                        10
                )
        );

        panelBoutons.add(btnEnregistrer);
        panelBoutons.add(btnSupprimer);
        panelBoutons.add(btnListe);

        // AJOUT
        add(panel, BorderLayout.CENTER);
        add(panelBoutons, BorderLayout.SOUTH);

        // ACTION ENREGISTRER
        btnEnregistrer.addActionListener(e -> enregistrerAgence());

        // ACTION SUPPRIMER
        btnSupprimer.addActionListener(e -> supprimerAgence());

        // ACTION LISTE
        btnListe.addActionListener(e -> afficherListe());

        setVisible(true);
    }

    // ENREGISTRER
    private void enregistrerAgence() {

        try {

            int id = Integer.parseInt(txtId.getText());
            String nom = txtNom.getText();
            String adresse = txtAdresse.getText();
            String contact = txtContact.getText();
            String email = txtEmail.getText();
            int nb = Integer.parseInt(txtNbPersonne.getText());

            Agence agence = new Agence(id, nom,
                    adresse, contact, email, nb);

            listeAgences.add(agence);

            JOptionPane.showMessageDialog(this,
                    "Agence enregistrée");

            // Vider les champs après ajout
            txtId.setText("");
            txtNom.setText("");
            txtAdresse.setText("");
            txtContact.setText("");
            txtEmail.setText("");
            txtNbPersonne.setText("");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this,
                    "Erreur de saisie");
        }
    }

    // SUPPRIMER PAR ID
    private void supprimerAgence() {

        try {

            int id = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            this,
                            "Entrer ID à supprimer"
                    )
            );

            boolean trouve = false;

            for (int i = 0; i < listeAgences.size(); i++) {

                if (listeAgences.get(i).getNagence() == id) {

                    listeAgences.remove(i);
                    trouve = true;

                    JOptionPane.showMessageDialog(this,
                            "Agence supprimée");

                    break;
                }
            }

            if (!trouve) {

                JOptionPane.showMessageDialog(this,
                        "Agence introuvable");
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this,
                    "Erreur");
        }
    }

    // AFFICHER LISTE
    private void afficherListe() {

        if (listeAgences.isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Aucune agence enregistrée");

            return;
        }

        StringBuilder liste = new StringBuilder();

        for (Agence a : listeAgences) {

            liste.append(a.toString())
                    .append("\n\n");
        }

        JTextArea area = new JTextArea(liste.toString());
        area.setEditable(false);

        JScrollPane scroll = new JScrollPane(area);

        JOptionPane.showMessageDialog(
                this,
                scroll,
                "Liste des Agences",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // MAIN
    public static void main(String[] args) {

        new AgenceForm();
    }
}
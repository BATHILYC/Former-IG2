package View;
import javax.swing.*;
import java.awt.*;

public class PersonneForm extends JFrame {

    // Déclaration des composants
    private JTextField txtId, txtNom, txtPrenom, txtAge, txtAdresse, txtPhone, txtDateNaiss, txtCreatedAt, txtUpdatedAt;
    private JButton btnEnregistrer;

    public PersonneForm() {
        // Configuration de la fenêtre
        setTitle("Formulaire Personne");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Utilisation d'un JPanel avec GridBagLayout pour un alignement propre
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(5, 5, 5, 5); // Marges entre les éléments
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Initialisation des champs
        txtId = new JTextField(15);
        txtNom = new JTextField(15);
        txtPrenom = new JTextField(15);
        txtAge = new JTextField(15);
        txtAdresse = new JTextField(15);
        txtPhone = new JTextField(15);
        txtDateNaiss = new JTextField(15);
        txtCreatedAt = new JTextField(15);
        txtUpdatedAt = new JTextField(15);
        btnEnregistrer = new JButton("Enregistrer");

        // Ajout des composants au panel
        ajouterLigne(panel, gbc, 0, "ID :", txtId);
        ajouterLigne(panel, gbc, 1, "Nom :", txtNom);
        ajouterLigne(panel, gbc, 2, "Prénom :", txtPrenom);
        ajouterLigne(panel, gbc, 3, "Âge :", txtAge);
        ajouterLigne(panel, gbc, 4, "Adresse :", txtAdresse);
        ajouterLigne(panel, gbc, 5, "Téléphone :", txtPhone);
        ajouterLigne(panel, gbc, 6, "Date Naiss :", txtDateNaiss);
        ajouterLigne(panel, gbc, 7, "Créé le :", txtCreatedAt);
        ajouterLigne(panel, gbc, 8, "Modifié le :", txtUpdatedAt);

        // Bouton Enregistrer (centré en bas)
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnEnregistrer, gbc);

        // Ajout du panel à la fenêtre
        add(panel);
    }

    // Méthode utilitaire pour ajouter une étiquette et un champ sur une ligne
    private void ajouterLigne(JPanel p, GridBagConstraints c, int row, String label, JTextField textField) {
        c.gridwidth = 1;
        c.gridy = row;

        c.gridx = 0;
        p.add(new JLabel(label), c);

        c.gridx = 1;
        p.add(textField, c);
    }

    public static void main(String[] args) {
        // Lancement de l'interface
        SwingUtilities.invokeLater(() -> {
            new PersonneForm().setVisible(true);
        });
    }
}


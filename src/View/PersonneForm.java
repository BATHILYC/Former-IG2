package View;
import javax.swing.*;
import java.awt.*;

public class PersonneForm extends JFrame {
    private JTextField txtId, txtNom, txtPrenom, txtAge, txtAdresse, txtPhone, txtDateNaissance, txtCreatedAt, txtUpdatedAt;
    private JButton btnEnregistrer;

    public PersonneForm() {
        setTitle("Formulaire Personne");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new java.awt.Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        txtId = new JTextField(15);
        txtNom = new JTextField(15);
        txtPrenom = new JTextField(15);
        txtAge = new JTextField(15);
        txtAdresse = new JTextField(15);
        txtPhone = new JTextField(15);
        txtDateNaissance = new JTextField(15);
        txtCreatedAt = new JTextField(15);
        txtUpdatedAt = new JTextField(15);
        btnEnregistrer = new JButton("Enregistrer");
        ajouterLigne(panel, gbc, 0, "ID :", txtId);
        ajouterLigne(panel, gbc, 1, "Nom :", txtNom);
        ajouterLigne(panel, gbc, 2, "Prénom :", txtPrenom);
        ajouterLigne(panel, gbc, 3, "Âge :", txtAge);
        ajouterLigne(panel, gbc, 4, "Adresse :", txtAdresse);
        ajouterLigne(panel, gbc, 5, "Téléphone :", txtPhone);
        ajouterLigne(panel, gbc, 6, "Date_Naissance :", txtDateNaissance);
        ajouterLigne(panel, gbc, 7, "Créé le :", txtCreatedAt);
        ajouterLigne(panel, gbc, 8, "Modifié le :", txtUpdatedAt);
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(btnEnregistrer, gbc);
        add(panel);
    }
    private void ajouterLigne(JPanel p, GridBagConstraints c, int row, String label, JTextField textField) {
        c.gridwidth = 1;
        c.gridy = row;

        c.gridx = 0;
        p.add(new JLabel(label), c);

        c.gridx = 1;
        p.add(textField, c);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PersonneForm().setVisible(true);
        });
    }
}


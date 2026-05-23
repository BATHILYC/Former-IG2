package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class CompteForm extends JFrame {
    private JTextField txtCode;
    private JTextField txtSolde;
    private JLabel lblCode;
    private JLabel lblSolde;
    private JLabel lblDateCreation;
    private JLabel lblDateModification;

    public CompteForm() {

        setTitle("Gestion Compte");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        panel.add(new JLabel("Code :"));
        txtCode = new JTextField();
        panel.add(txtCode);

        panel.add(new JLabel("Solde :"));
        txtSolde = new JTextField();
        panel.add(txtSolde);

        JButton btnAjouter = new JButton("Ajouter");

        panel.add(btnAjouter);
        panel.add(new JLabel(""));

        panel.add(new JLabel("Code saisi :"));
        lblCode = new JLabel("");
        panel.add(lblCode);

        panel.add(new JLabel("Solde saisi :"));
        lblSolde = new JLabel("");
        panel.add(lblSolde);

        panel.add(new JLabel("Date création :"));
        lblDateCreation = new JLabel("");
        panel.add(lblDateCreation);

        panel.add(new JLabel("Date modification :"));
        lblDateModification = new JLabel("");
        panel.add(lblDateModification);

        // Action bouton
        btnAjouter.addActionListener((ActionEvent e) -> {

            String code = txtCode.getText();
            String solde = txtSolde.getText();

            Date maintenant = new Date();

            lblCode.setText(code);
            lblSolde.setText(solde);
            lblDateCreation.setText(maintenant.toString());
            lblDateModification.setText(maintenant.toString());

            JOptionPane.showMessageDialog(
                    null,
                    "Compte ajouté avec succès !"
            );
        });

        add(panel);
    }

    // MAIN
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new CompteForm().setVisible(true);

        });
    }
}
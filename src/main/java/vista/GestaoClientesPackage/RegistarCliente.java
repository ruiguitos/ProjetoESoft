package vista.GestaoClientesPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistarCliente extends JFrame{

    private JTextField textNome;
    private JTextField textTelemovel;
    private JTextField textMorada;
    private JTextField textNif;
    private JTextField textMail;
    private JPanel panelRegistar;
    private JLabel labelNome;
    private JLabel labelNif;
    private JLabel labelMorada;
    private JLabel labelTelemovel;
    private JLabel labelMail;
    private JLabel labelDataNascimento;
    private JButton btnRegistar;
    private JButton btnVoltar;


    public RegistarCliente() {
        setContentPane(panelRegistar);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);

        btnRegistar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textNome.getText().length() < 2) {
                    JOptionPane.showMessageDialog(null, "Nome incompleto",
                            "Nome!", JOptionPane.INFORMATION_MESSAGE);
                } else if (textMorada.getText().length() < 2) {
                    JOptionPane.showMessageDialog(null, "Morada incompleta",
                            "Morada!", JOptionPane.INFORMATION_MESSAGE);
                } else if (textNif.getText().length() != 9) {
                    JOptionPane.showMessageDialog(null, "Nif invalido",
                            "Nif!", JOptionPane.INFORMATION_MESSAGE);
                } else if (textTelemovel.getText().length() != 9) {
                    JOptionPane.showMessageDialog(null, "Numero telemovel invalido",
                            "Telemovel!", JOptionPane.INFORMATION_MESSAGE);
                } else if (textMail.getText().length() <2) {
                    JOptionPane.showMessageDialog(null, "Mail invalido",
                            "Mail!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    ClienteRegistado clienteRegistado = new ClienteRegistado();
                    clienteRegistado.setVisible(true);
                }

            }


        });
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelRegistar);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

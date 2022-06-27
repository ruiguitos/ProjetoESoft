package vista.GestaoClientesPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditarCliente extends JFrame{

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton brnConcluir;
    private JTextField textField5;
    private JPasswordField passwordField1;
    private JButton btnVoltar;
    private JLabel labelNome;
    private JLabel labelNif;
    private JLabel labelMorada;
    private JLabel labelTelemovel;
    private JLabel labelMail;
    private JLabel labelData;
    private JPanel panelEditarCliente;

    public EditarCliente() {
        setContentPane( panelEditarCliente);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);
        brnConcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane( panelEditarCliente);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });
        brnConcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuardarDados guardarDados=new GuardarDados();
                guardarDados.setVisible(true);
            }
        });
    }
}

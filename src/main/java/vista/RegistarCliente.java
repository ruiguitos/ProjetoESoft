package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistarCliente extends JFrame{

    private JTextField textNome;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPasswordField passwordField1;
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
               ClienteRegistado clienteRegistado=new ClienteRegistado();
                clienteRegistado.setVisible(true);
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
}

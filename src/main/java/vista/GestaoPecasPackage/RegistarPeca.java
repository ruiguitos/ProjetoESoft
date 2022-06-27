package vista.GestaoPecasPackage;

import vista.MenuPrincipal2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistarPeca extends JFrame{
    private JTextField textField1;
    private JLabel labelNome;
    private JRadioButton consumivelRadioButton;
    private JRadioButton peçaRadioButton;
    private JComboBox boxMarca;
    private JComboBox boxLocalizacao;
    private JButton btnFinalizar;
    private JButton btnVoltar;
    private JPanel panelRegistarPeca;

    public RegistarPeca() {
        setContentPane(panelRegistarPeca);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
        btnFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelRegistarPeca);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });
        btnFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistarPecaConfirmacao registarPecaConfirmacao=new RegistarPecaConfirmacao();
                registarPecaConfirmacao.setVisible(true);
            }
        });
    }
}

package vista.GestaoPecasPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultarPeca extends JFrame {


    private JPanel panelConsultarPeca;
    private JTextField textField1;
    private JComboBox boxMarcas;
    private JComboBox boxCidades;
    private JRadioButton consumivelRadioButton;
    private JRadioButton peçaRadioButton;
    private JButton btnPesquisar;
    private JButton btnVoltar;
    private JLabel labelNome;

    public ConsultarPeca() {
        setContentPane(panelConsultarPeca);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelConsultarPeca);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });
    }

}

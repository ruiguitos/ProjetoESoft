package vista.GestaoPecasPackage;

import javax.swing.*;

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
    }

}

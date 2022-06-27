package vista.GestaoPecasPackage;

import javax.swing.*;

public class EncomendarPeca extends JFrame {
    private JTextField textField1;
    private JLabel labelNome;
    private JComboBox boxMarcas;
    private JComboBox boxLocalizacao;
    private JButton btnPesquisar;
    private JButton btnVoltar;
    private JTextField textField2;
    private JLabel labelQuantidade;
    private JPanel panelEncomendar;

    public EncomendarPeca() {setContentPane(panelEncomendar);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);

    }
}

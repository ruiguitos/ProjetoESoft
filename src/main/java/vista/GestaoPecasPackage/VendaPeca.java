package vista.GestaoPecasPackage;

import javax.swing.*;

public class VendaPeca extends JFrame {

    private JPanel panelVendaPeca;
    private JTextField textArtigo;
    private JTextField textNome;
    private JTextField textQuantidade;
    private JButton btnFinalizar;
    private JButton btnVoltar;
    private JLabel labelArtigo;

    public VendaPeca() {
        setContentPane(panelVendaPeca);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

}

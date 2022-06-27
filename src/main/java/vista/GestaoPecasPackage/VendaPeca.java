package vista.GestaoPecasPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelVendaPeca);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });
    }

}

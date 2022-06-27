package vista.GestaoPecasPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransferirPeca extends JFrame {

    private JPanel panelTransferirPeca;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton finalizarButton;
    private JButton btnVoltar;
    private JLabel labelArtigo;
    private JLabel labelQuantidade;

    public TransferirPeca() {
        setContentPane(panelTransferirPeca);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelTransferirPeca);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });
    }

}

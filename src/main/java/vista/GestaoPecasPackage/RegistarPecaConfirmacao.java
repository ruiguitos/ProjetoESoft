package vista.GestaoPecasPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistarPecaConfirmacao extends JFrame {
    private JPanel panelRegistarConfirmacao;
    private JButton btnSim;
    private JButton btnNao;

    public RegistarPecaConfirmacao() {
        setContentPane(panelRegistarConfirmacao);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);

        btnNao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelRegistarConfirmacao);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });
    }
}

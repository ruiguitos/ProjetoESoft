package vista.GestaoEventosPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErroEventoJaRegistado extends JFrame {
    private JPanel panelRegistado;
    private JButton btnVoltar;

    public ErroEventoJaRegistado() {
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelRegistado);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);


            }
        });
    }
}

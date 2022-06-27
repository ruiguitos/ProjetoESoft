package vista.GestaoEstatisticasPackage.menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstatisticasEventos extends JFrame {

    private JPanel panelEstatisticasEventos;
    private JButton voltarButton;

    public EstatisticasEventos(){

        setContentPane(panelEstatisticasEventos);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelEstatisticasEventos);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });
    }
}

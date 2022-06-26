package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestaoClientes  extends JFrame{
    private JButton btnRegistar;
    private JButton btnConsultar;
    private JButton btnVoltar;
    private JPanel panelGestaoClientes;


    public GestaoClientes() {

            setContentPane(panelGestaoClientes);
            // Destrói esta janela, removendo-a completamente da memória.
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
            pack();
            setVisible(true);



        btnRegistar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistarCliente registarCliente=new RegistarCliente();
                registarCliente.setVisible(true);
            }
        });
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setContentPane(panelGestaoClientes);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });
    }
}

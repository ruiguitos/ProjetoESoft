package vista.GestaoDeVeiculosPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestaoDeVeiculos extends JFrame {

    private JPanel panelVeiculos;
    private JButton compraVeiculo;
    private JButton voltarButton;
    private JButton consultarVeiculo;

    public GestaoDeVeiculos(){
        setContentPane(panelVeiculos);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelVeiculos);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });

        consultarVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListarAutomovel listarAutomovel = new ListarAutomovel();
                listarAutomovel.setVisible(true);
            }
        });

        compraVeiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdicionarAutomovel adicionarAutomovel = new AdicionarAutomovel();
                adicionarAutomovel.setVisible(true);
            }
        });
    }


}

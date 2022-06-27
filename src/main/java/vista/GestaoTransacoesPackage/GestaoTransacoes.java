package vista.GestaoTransacoesPackage;

import vista.GestaoDeVeiculosPackage.ListarAutomovel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestaoTransacoes extends JFrame {

    private JButton registarTransacao;
    private JPanel panel1;
    private JButton consultarTransacao;
    private JButton voltarButton;

    public GestaoTransacoes(){
        setContentPane(panel1);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panel1);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });


        registarTransacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            CompraAutomovel compraAutomovel = new CompraAutomovel();
            compraAutomovel.setVisible(true);
            }
        });

        consultarTransacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListarTransacoes listarTransacoes = new ListarTransacoes();
                listarTransacoes.setVisible(true);
            }
        });
    }
}

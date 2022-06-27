package vista;

import vista.GestaoDeVeiculosPackage.GestaoDeVeiculos;
import vista.GestaoPecasPackage.GestaoPeca;
import vista.GestaoTransacoesPackage.GestaoTransacoes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal2 extends JFrame {
    private JButton btnGestaoVeiculos;
    private JButton btnGestaoPecas;
    private JButton btnGestaoTransações;
    private JButton btnVoltar;
    private JButton gestaoDeVeiculosButton;
    private JButton gestaoDePecasButton;
    private JPanel panelMain2;
    private JButton gestaoDeTransacoesButton;
    private JButton voltarButton;

    public MenuPrincipal2() {
        setContentPane(panelMain2);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);

        gestaoDeTransacoesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestaoTransacoes gestaoTransacoes=new GestaoTransacoes();
                gestaoTransacoes.setVisible(true);
            }
        });

        gestaoDePecasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestaoPeca gestaoDePecas=new GestaoPeca();
                gestaoDePecas.setVisible(true);
            }
        });
        gestaoDeVeiculosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestaoDeVeiculos gestaoVeiculos=new GestaoDeVeiculos();
                gestaoVeiculos.setVisible(true);
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelMain2);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });
    }
}
package vista;

import vista.GestaoEventosPackage.GestaoDeEventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal2 extends JFrame{
    private JButton btnGestaoVeiculos;
    private JButton btnGestaoPecas;
    private JButton btnGestaoTransações;

    private JPanel panelMenuprincipal2;
    private JButton btnVoltar;

    public MenuPrincipal2() {
        setContentPane(panelMenuprincipal2);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);


        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelMenuprincipal2);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });

        btnGestaoVeiculos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                GestaoDeVeiculos gestaoDeVeiculos=new GestaoDeVeiculos();
//                gestaoDeVeiculos.setVisible(true);
            }
        });

        btnGestaoPecas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                GestaoDePecas gestaoDePecas=new GestaoDePecas();
//                gestaoDePecas.setVisible(true);
            }
        });

        btnGestaoTransações.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                GestaoDeTransacoes gestaoDeTransacoes=new GestaoDeTransacoes();
//                gestaoDeTransacoes.setVisible(true);
            }
        });
    }
}

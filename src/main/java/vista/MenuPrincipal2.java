package vista;

<<<<<<< HEAD
import vista.GestaoEventosPackage.GestaoDeEventos;
=======
import vista.GestaoPecasPackage.GestaoPeca;
>>>>>>> 48922e2cb44379fd21820a4051321f209d411209

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
<<<<<<< HEAD

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
=======
        btnGestaoPecas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestaoPeca gestaoPeca=new GestaoPeca();
                gestaoPeca.setVisible(true);
>>>>>>> 48922e2cb44379fd21820a4051321f209d411209
            }
        });
    }
}

package vista.GestaoEventosPackage;

import vista.GestaoClientesPackage.RegistarCliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestaoDeEventos extends JFrame {


    private JPanel panelGestaoEventos;
    private JButton registarEventoButton;
    private JButton descriçãoDeEventosButton;
    private JButton veículosEmExposiçãoButton;
    private JButton voltarButton;

    public GestaoDeEventos(){
        setContentPane(panelGestaoEventos);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);


        registarEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistarEventos registarEventos=new RegistarEventos();
                registarEventos.setVisible(true);
            }
        });
        descriçãoDeEventosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DescricaoEventos descricaoEventos = new DescricaoEventos();
                descricaoEventos.setVisible(true);
            }
        });


        veículosEmExposiçãoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VeiculosEmExposicao veiculosEmExposicao = new VeiculosEmExposicao();
                veiculosEmExposicao.setVisible(true);
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelGestaoEventos);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });
    }





}

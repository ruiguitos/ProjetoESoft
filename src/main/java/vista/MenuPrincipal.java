package vista;

import vista.GestaoClientesPackage.GestaoClientes;
import vista.GestaoEstatisticasPackage.GestaoEstatisticas;
import vista.GestaoEventosPackage.GestaoDeEventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private JButton btnGestaoStock;
    private JButton btnGestaoEventos;
    private JButton btnGestaoClientes;
    private JButton btnGestaoEstatisticas;
    private JButton btnSair;
    private JPanel jpanelMenuPrincipal;

    public MenuPrincipal() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(jpanelMenuPrincipal);
        pack();

        btnGestaoStock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal2 menuPrincipal2 = new MenuPrincipal2();
                menuPrincipal2.setVisible(true);
            }
        });

        btnGestaoClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestaoClientes gestaoClientes = new GestaoClientes();
                gestaoClientes.setVisible(true);
            }
        });

        btnGestaoEstatisticas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestaoEstatisticas gestaoEstatisticas = new GestaoEstatisticas();
                gestaoEstatisticas.setVisible(true);
            }
        });

        btnGestaoEventos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestaoDeEventos gestaoDeEventos = new GestaoDeEventos();
                gestaoDeEventos.setVisible(true);
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new MenuPrincipal().setVisible(true);
    }
}



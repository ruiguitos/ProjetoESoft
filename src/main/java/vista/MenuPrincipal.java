package vista;

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


            btnGestaoClientes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    GestaoClientes gestaoClientes=new GestaoClientes();
                    gestaoClientes.setVisible(true);
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



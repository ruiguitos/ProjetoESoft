package vista.GestaoEstatisticasPackage;

import vista.GestaoEstatisticasPackage.menu.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestaoEstatisticas extends JFrame {


    private JPanel panelEstatisticas;
    private JButton estatisticasVeiculosButton;
    private JButton faturacaoPorBalcaoButton;
    private JButton voltarButton;
    private JButton estatísticasClientesButton;
    private JButton estatisticasEventosButton;
    private JButton pecasEmStockButton;
    private JButton reparacoesButton;

    public GestaoEstatisticas(){

        setContentPane(panelEstatisticas);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);

        estatisticasVeiculosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EstatisticasVeiculos estatisticasVeiculos = new EstatisticasVeiculos();
                estatisticasVeiculos.setVisible(true);
            }
        });

        estatísticasClientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EstatisticasClientes estatisticasClientes = new EstatisticasClientes();
                estatisticasClientes.setVisible(true);
            }
        });

        estatisticasEventosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EstatisticasEventos estatisticasEventos = new EstatisticasEventos();
                estatisticasEventos.setVisible(true);
            }
        });

        faturacaoPorBalcaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FaturacaoPorBalcao faturacaoPorBalcao = new FaturacaoPorBalcao();
                faturacaoPorBalcao.setVisible(true);
            }
        });

        pecasEmStockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PecasEmStock pecasEmStock = new PecasEmStock();
                pecasEmStock.setVisible(true);
            }
        });

        reparacoesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reparacoes reparacoes = new Reparacoes();
                reparacoes.setVisible(true);
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelEstatisticas);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });
    }
}

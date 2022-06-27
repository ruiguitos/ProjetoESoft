package vista.GestaoClientesPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DadosCliente extends JFrame{
    private JPanel panelDadosCLiente;
    private JButton btnEditar;
    private JButton btnHistoricoTransacoes;
    private JButton btnVoltar;
    private JTable tableDadosCliente;

    public  DadosCliente(){
        setContentPane( panelDadosCLiente);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);


        btnHistoricoTransacoes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HistoricoTransacoes historicoTransacoes=new HistoricoTransacoes();
                historicoTransacoes.setVisible(true);
            }
        });
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane( panelDadosCLiente);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });
        btnEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditarCliente editarCliente=new EditarCliente();
                editarCliente.setVisible(true);
            }
        });
    }

}

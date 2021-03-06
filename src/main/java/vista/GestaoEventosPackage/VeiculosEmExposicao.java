package vista.GestaoEventosPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VeiculosEmExposicao extends JFrame {


    private JPanel panelVeiculosExposicao;
    private JButton voltarButton;
    private JTable table1;
    private JLabel table;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JButton pesquisarButton;
    private JComboBox comboBox1;

    public VeiculosEmExposicao(){

        setContentPane(panelVeiculosExposicao);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelVeiculosExposicao);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });

        pesquisarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            VeiculosEmExposicaoPorData veiculosEmExposicaoPorData = new VeiculosEmExposicaoPorData();
            veiculosEmExposicaoPorData.setVisible(true);
            }
        });
    }
}

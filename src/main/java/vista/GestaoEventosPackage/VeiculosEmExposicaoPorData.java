package vista.GestaoEventosPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VeiculosEmExposicaoPorData extends JFrame {


    private JPanel JPanel;
    private JPanel panelData;
    private JTable table1;
    private JButton voltarButton;
    private JLabel table;
    private JButton pesquisarButton;
    private JCheckBox checkBox2;
    private JCheckBox checkBox6;
    private JCheckBox checkBox5;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox1;
    private JComboBox comboBox1;

    public VeiculosEmExposicaoPorData(){

        setContentPane(JPanel);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelData);
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
            VeiculosEmExposicao veiculosEmExposicao = new VeiculosEmExposicao();
            veiculosEmExposicao.setVisible(true);
            }
        });
    }
}

package vista.GestaoEventosPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistarEventos extends JFrame {

    private JPanel panelRegistarEventos;
    private JTextField JTextNome;
    private JLabel labelNome;
    private JButton registarButton;
    private JButton voltarButton;
    private JLabel labelMorada;
    private JLabel labelFilial;
    private JLabel labelDuracao;
    private JLabel labelDataFim;
    private JLabel labelDataInicio;
    private JTextField JTextMorada;
    private JTextField JTextFilial;
    private JTextField JTextDataInicio;
    private JTextField JTextDataFim;
    private JTextField JTextDuracao;
    private JRadioButton xxXxXxRadioButton;
    private JRadioButton xxXxXxRadioButton1;
    private JRadioButton xxXxXxRadioButton2;
    private JRadioButton radioButton4;
    private JButton consultarButton;
    private JComboBox comboBox1;
    private JButton btnRegistar;
    private JButton btnVoltar;


    public RegistarEventos(){
        setContentPane(panelRegistarEventos);
        // Destrói esta janela, removendo-a completamente da memória.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
        pack();
        setVisible(true);

        registarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventoRegistado eventoRegistado=new EventoRegistado();
                eventoRegistado.setVisible(true);
                setContentPane(panelRegistarEventos);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelRegistarEventos);
                // Destrói esta janela, removendo-a completamente da memória.
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                // Causes this Window to be sized to fit the preferred size and layoutsof its subcomponents.
                pack();
                setVisible(false);
            }
        });
        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DescricaoEventos descricaoEventos = new DescricaoEventos();
                descricaoEventos.setVisible(true);
            }
        });
    }













}

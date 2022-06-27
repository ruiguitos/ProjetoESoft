package vista.GestaoPecasPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestaoPeca extends JFrame{
    private JPanel panelGestaoPeca;
    private JButton btnRegistarPeca;
    private JButton btnConsultarPeca;
    private JButton btnVendaPeca;
    private JButton btnTransferir;
    private JButton btnEncomendar;
    private JButton btnVoltar;
    private JTable table1;

    public GestaoPeca() {
        setContentPane(panelGestaoPeca);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(panelGestaoPeca);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                pack();
                setVisible(false);
            }
        });
        btnRegistarPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistarPeca registarPeca=new RegistarPeca();
                registarPeca.setVisible(true);
            }
        });
        btnEncomendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EncomendarPeca encomendarPeca=new EncomendarPeca();
                encomendarPeca.setVisible(true);
            }

        });
        btnConsultarPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsultarPeca consultarPeca=new ConsultarPeca();
                consultarPeca.setVisible(true);
            }

        });
        btnVendaPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VendaPeca vendaPeca=new VendaPeca();
                vendaPeca.setVisible(true);
            }
        });
        btnTransferir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransferirPeca transferirPeca=new TransferirPeca();
                transferirPeca.setVisible(true);
            }
        });
    }
}

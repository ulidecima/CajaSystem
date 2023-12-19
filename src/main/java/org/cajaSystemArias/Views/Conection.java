package org.cajaSystemArias.Views;

import org.cajaSystemArias.SQL.ConnectionSQL;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conection extends JFrame {
    private JButton conectarButton;
    private JButton desconectarButton;
    private JPanel mainPanel;

    private ConnectionSQL connectionsql = new ConnectionSQL();

    public Conection() {
        conectarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(conectarButton, "CONECTANDO...");
                connectionsql.doConection();
            }
        });

        desconectarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(desconectarButton, "DESCONECTANDO...");
                connectionsql.closeConection();
            }
        });
    }

    public JButton getConectarButton() {
        return conectarButton;
    }

    public void setConectarButton(JButton conectarButton) {
        this.conectarButton = conectarButton;
    }

    public JButton getDesconectarButton() {
        return desconectarButton;
    }

    public void setDesconectarButton(JButton desconectarButton) {
        this.desconectarButton = desconectarButton;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }
}

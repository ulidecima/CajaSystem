package org.cajaSystemArias.Views;

import javax.swing.*;

public class Start {
    public static void main(String[] args) {
        Load open = new Load();
        open.setContentPane(open.getMainPanel());
        open.setTitle("OPEN");
        open.setLocationRelativeTo(null);
        open.pack();
        open.setVisible(true);
        open.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

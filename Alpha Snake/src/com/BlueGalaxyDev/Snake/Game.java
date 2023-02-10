package com.BlueGalaxyDev.Snake;

import javax.swing.*;

public class Game extends JFrame {

    public Game() {
        this.add(new Panel());
        this.setTitle("Alpha Snake");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}

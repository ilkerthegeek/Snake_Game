package com.company;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
    public Snake(){
    add(new Board());
    setResizable(false);
    pack();
    setTitle("Ilker'in Snake Oyunu");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame ex =new Snake();
                ex.setVisible(true);
            }
        });
    }
}

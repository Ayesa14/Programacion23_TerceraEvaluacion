package selectorcolores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectorColores {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Selector de colores");
        String[] colores = {"", "Naranja" , "Azul" , "Rojo"};
        JComboBox<String> comboBox = new JComboBox<>(colores);
        comboBox.setPreferredSize(new Dimension(150, 30));
        JButton boton = new JButton("selección");
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(60,40));
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboBox.getSelectedItem();
                switch (seleccion) {
                    case "Naranja":
                        panel.setBackground(Color.ORANGE);
                        break;
                    case "Azul":
                        panel.setBackground(Color.BLUE);
                        break;
                    case "Rojo":
                        panel.setBackground(Color.RED);
                        break;
                    default:
                        break;
                }
            }
        });
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(panel);
        container.add(comboBox);
        container.add(boton);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
    
    


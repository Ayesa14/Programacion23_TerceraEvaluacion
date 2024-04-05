package temporizador;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Temporizador extends JFrame{

    private static final long serial = 3545053785228009472L;

    private JPanel panel;
    private JLabel timeLabel;

    private JPanel buttonPanel;
    private JButton startButton;
    private JButton resetButton;
    private JButton stopButton;

    
    private byte cents = 0;
    private byte segundos= 30;
    private short minutos = 0;

    private DecimalFormat timeFormatter;

    private Timer timer;

    public Temporizador() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Consolas", Font.PLAIN, 13));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(timeLabel);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                timer.start();

            }
        });
        buttonPanel.add(startButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                timer.stop();

                cents = 0;
                segundos = 30;
                minutos = 0;

                timeLabel.setText(timeFormatter.format(minutos) + ":"
                        + timeFormatter.format(segundos) + "."
                        + timeFormatter.format(cents));
            }
        });

        buttonPanel.add(resetButton);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        buttonPanel.add(stopButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        timeFormatter = new DecimalFormat("00");

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cents > 0) {
                    cents--;
                } else {
                    if (segundos == 0 && minutos == 0) {
                        timer.stop();
                    } else if (segundos > 0) {
                        segundos--;
                        cents = 99;
                    } else if (minutos > 0) {
                        minutos--;
                        segundos = 59;
                        cents = 99;
                    }
                }
                timeLabel.setText(timeFormatter.format(minutos) + ":"
                        + timeFormatter.format(segundos) + "."
                        + timeFormatter.format(cents));
            }
        });

        timeLabel.setText(timeFormatter.format(minutos) + ":"
                + timeFormatter.format(segundos) + "."
                + timeFormatter.format(cents));

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("StopwatchGUI.java");

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                new Temporizador();
            }
        });
    }
}

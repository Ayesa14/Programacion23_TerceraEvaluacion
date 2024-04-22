package conversorTemperatura;

    import javax.swing.*;
    import java.awt.FlowLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

public class Gui {

    private static JFrame ventana;
    private static JLabel temperaturaCelsius;
    private static JLabel temperaturaFahrenheit;
    private static JTextField textoCelsius;
    private static JTextField textoFahrenheit;
    private static JButton botonCelsius;
    private static JButton botonFahrenheit;

    public Gui() {

        ventana = new JFrame("Conversor de Temperatura");
        ventana.setSize(200, 250);
        ventana.setLayout(new FlowLayout());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);


        temperaturaCelsius = new JLabel("Grados Celsius:");
        temperaturaFahrenheit = new JLabel("Grados Fahrenheit");

        textoCelsius = new JTextField(10);
        textoFahrenheit = new JTextField(10);

        botonCelsius = new JButton("Convertir a Celsius");
        botonCelsius.addActionListener((ActionEvent e) -> {
            try {
                double fahrenheit = Double.parseDouble(textoFahrenheit.getText());
                double celsius = Calculos.calcularConversionTemperatura(fahrenheit, Calculos.CELSIUS);
                textoCelsius.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "Ingrese un valor válido en Fahrenheit.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        botonFahrenheit = new JButton("Convertir a Fahrenheit");
        botonFahrenheit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textoCelsius.getText());
                    double fahrenheit = Calculos.calcularConversionTemperatura(celsius, Calculos.FAHRENHEIT);
                    textoFahrenheit.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ventana, "Ingrese un valor válido en Celsius.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        ventana.add(temperaturaCelsius);
        ventana.add(textoCelsius);
        ventana.add(botonCelsius);
        ventana.add(temperaturaFahrenheit);
        ventana.add(textoFahrenheit);
        ventana.add(botonFahrenheit);

        ventana.setVisible(true);
    }
}


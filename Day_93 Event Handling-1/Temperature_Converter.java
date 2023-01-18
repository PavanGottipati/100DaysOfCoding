//Event Handling
// Java program to implement an user interface that convert temperature from Celsius to Forenheit and vice versa
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

@SuppressWarnings("serial")
public class Temperature_Converter extends JFrame{
private static final double CelsiusTOFarenheit = 9.0 / 5.0;
private static final double FahrenheitTOCelsius = 5.0 / 9.0;
private static final int offset = 32;
private JLabel LFahrenheit, LCelsius; //Labels
private JTextField TFFahrenheit, TFCelsius; //Text Fields
private JButton BConvert; //Convert Button
private ConvertButtonHandler ConvButtonHandler;

public Temperature_Converter() {
setTitle("Temperature Converter");
Container pane = getContentPane();
pane.setLayout(new GridLayout(1,5));

LFahrenheit = new JLabel("Farenheit:", JLabel.CENTER);
    pane.add(LFahrenheit);
TFFahrenheit = new JTextField();
    pane.add(TFFahrenheit);
BConvert = new JButton("Convert");
    pane.add(BConvert);
        ConvButtonHandler = new ConvertButtonHandler();
        BConvert.addActionListener(ConvButtonHandler);
LCelsius = new JLabel("Celsius:", JLabel.CENTER);
    pane.add(LCelsius);
TFCelsius = new JTextField();
    pane.add(TFCelsius);

setSize(600, 85);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private class ConvertButtonHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        double celsius = 0, fahrenheit = 0;

        DecimalFormat twoDigits = new DecimalFormat("0.00");     
                celsius = Double.parseDouble(TFCelsius.getText());
                fahrenheit = Double.parseDouble(TFFahrenheit.getText());
                    celsius = (fahrenheit - offset) * FahrenheitTOCelsius;
                    fahrenheit = celsius * CelsiusTOFarenheit + offset;
                        TFCelsius.setText(" "+ twoDigits.format(celsius));
                        TFFahrenheit.setText(" "+ twoDigits.format(fahrenheit));       
}
}

public static void main(String[] args) {
new Temperature_Converter();
}
}

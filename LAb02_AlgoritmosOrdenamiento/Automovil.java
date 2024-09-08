import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Automovil extends JFrame {

    private AtributosCarro[] cars;
    private JTextArea textArea;
    private JButton bubbleSortModelButton, bubbleSortKilometerButton;
    private JScrollPane scroll;
    private JPanel panel;
    private JLabel label;

    public Carro() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantos automoviles hay: ");
        int counCars = entrada.nextInt();
        entrada.nextLine();

        cars = new AtributosCarro[counCars];

        for (int n = 0; n < counCars; n++) {
            System.out.println("\tIngrese los datos del autos " + (n + 1));
            System.out.print("Marca: ");
            String marca = entrada.nextLine();
            System.out.print("Modelo: ");
            String modelo = entrada.nextLine();
            System.out.print("Color: ");
            String color = entrada.nextLine();
            System.out.print("Kilometraje: ");
            int Kilometraje = entrada.nextInt();
            entrada.nextLine();
            cars[n] = new AtributosCarro(marca, modelo, color, Kilometraje);
            System.out.println();
        }

        screenCars(cars);
        entrada.close();
    }

    private void screenCars(AtributosCarro[] cars) {
        setBounds(100, 130, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Aplicación CarSorting.");
        PanelesandButtons();
        TextArea();
        displayCars();
    }

    private void PanelesandButtons() {
        panel = new JPanel();
        label = new JLabel("(..(Mod)Modelo - (Km)Kilometraje...)");
        panel.setLayout(null);
        this.getContentPane().add(panel);

        label.setBounds(70,1,400,26);
        label.setForeground(Color.GRAY);
        panel.add(label);

        bubbleSortModelButton = new JButton("Mod");
        bubbleSortModelButton.setBounds(317, 50, 60, 50);
        bubbleSortModelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bubbleSort2(cars, "modelo");
                displayCars();
            }

        });

        panel.add(bubbleSortModelButton);

        bubbleSortKilometerButton = new JButton("Km");
        bubbleSortKilometerButton.setBounds(317, 200, 60, 50);
        bubbleSortKilometerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bubbleSort2(cars, "kilometraje");
                displayCars();
            }

        });

        panel.add(bubbleSortKilometerButton);

    }

    private void bubbleSort2(AtributosCarro[] array, String attribute) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (attribute.equals("modelo")) {
                    if (array[j].getModelo().compareTo(array[j + 1].getModelo()) > 0) {
                        AtributosCarro temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                } else if (attribute.equals("kilometraje")) {
                    if (array[j].getKilometraje() > array[j + 1].getKilometraje()) {
                        AtributosCarro temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    private void TextArea() {
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(0, 0, 350, 400);

        scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(26, 30, 280, 300);
        panel.add(scroll);
    }

    private void displayCars() {
        textArea.setText("");
        for (AtributosCarro car : cars) {
            textArea.append(car.toString() + "\n\n");
        }
    }

}
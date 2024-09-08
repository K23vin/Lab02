import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static JFrame frame;
    public static JButton[] boton;

    public static void main(String[] args) {
        String titulo = "Laboratorio 2: Algortimos de ordenamiento.";

        String opciones[] = { "Ejercicio de Estadistica", "Ejercicio (Sustitucion, inversion) de Strings",
        "Metodos de ordenamiento", "Aplicacion de carros"};

        final int nump = opciones.length;

        frame = new JFrame(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 200, 400, 110);
        frame.setLayout(new BorderLayout());

        JPanel Panelbuttons = new JPanel();
        Panelbuttons.setLayout(new GridLayout(nump, 1));

        boton = new JButton[nump];

        for (int n = 0; n < nump; n++) {
            final int index = n;
            boton[n] = new JButton(opciones[n]);
            boton[n].setBackground(Color.lightGray);
            boton[n].setForeground(Color.WHITE);
            boton[n].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    switch (index) {
                        case 0:
                            boton[index].setEnabled(!boton[index].isEnabled());
                            Estadistica op = new Estadistica();
                            System.out.println(op);
                            break;
                        case 1:
                            OperacionesStrings isOper = new OperacionesStrings();
                            System.out.println(isOper);
                            break;
                        case 2:
                            Ordenamientos isOrder = new Ordenamientos();
                            System.out.println(isOrder);
                            break;
                        case 3:
                            boton[index].setEnabled(!boton[index].isEnabled());
                            Carro isCars = new Carro();
                            isCars.setVisible(true);
                            break;
                    }
                }
            });

            Panelbuttons.add(boton[n]);
        }

        frame.add(Panelbuttons, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
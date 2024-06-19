package com.mecro.calificador;

import javax.swing.JOptionPane;

public class CALIFICADOR {

    public static void main(String[] args) {
        byte opcion;
        float parcial;
        float conocimiento = Float.parseFloat(JOptionPane.showInputDialog("Digite su nota en conociento"));
        float desempeño = Float.parseFloat(JOptionPane.showInputDialog("Digite su nota en desempeño"));
        float producto = Float.parseFloat(JOptionPane.showInputDialog("Digite su nota en producto"));

        do {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Elija una de estas opciones:\n"
                    + "1. Calcular promedio ponderado.\n"
                    + "2. Calcular promedio aritmético.\n"
                    + "3. Salir."));

            switch (opcion) {
                case 1:
                    parcial = conocimiento * 0.5f + desempeño * 0.3f + producto * 0.2f;
                    JOptionPane.showMessageDialog(null, "El promedio ponderado es: " + parcial);
                    break;
                case 2:
                    parcial = (conocimiento + desempeño + producto) / 3;
                    JOptionPane.showMessageDialog(null, "El promedio aritmético es: " + parcial);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);
    }
}

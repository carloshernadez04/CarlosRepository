package com.mycompany.calculadora;

import javax.swing.JFrame;

public class Calculadora {

    public static void main(String[] args) {
        // Crear una instancia de tu JFrame
        calculador ventana = new calculador();

        // Configurar la operación al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar el JFrame
        ventana.setVisible(true);
    }
}

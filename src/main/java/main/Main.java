package main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String[] nomes = new String[100];
        float[] notas = new float[100];
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));

        for (int i = 0; i < n; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + ":"));
        }
        float soma = 0;

        for (int i = 0; i < n; i++) {
            soma += notas[i];
        }
        float media = soma / n;
        System.out.println("A media das notas eh " + media);

        for (int i = 0; i < n; i++) {
            System.out.println("Nome: " + nomes[i] + " nota: " + notas[i]);
        }
    }
}

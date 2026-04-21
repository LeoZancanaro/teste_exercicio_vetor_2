package main;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

    public static void main(String[] args) {
        String[] nomes = new String[100];
        float[] notas = new float[100];
        JTextArea textArea = new JTextArea(3, 30);
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
        textArea.setText("A média dos alunos é " + media + "\n");
        
        for(int i = 0; i < n; i++) {
            textArea.append("Nome: " + nomes[i] + " nota: " + notas[i] + "\n");
        }
        textArea.setEditable(false);
        JScrollPane painelRolagem = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, painelRolagem, "Titulo", JOptionPane.WARNING_MESSAGE);
    }
}

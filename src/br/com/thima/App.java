package br.com.thima;

import br.com.thima.dao.ClientMapDAO;
import br.com.thima.dao.ClientSetDAO;
import br.com.thima.dao.IClientDAO;

import javax.swing.*;

public class App {
    private static IClientDAO iClientDAO;
    public static void main(String[] args) {

        iClientDAO = new ClientMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Green dinner", JOptionPane.INFORMATION_MESSAGE);
    }
}

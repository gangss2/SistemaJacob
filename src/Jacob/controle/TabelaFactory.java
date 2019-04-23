/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jacob.controle;

import static Jacob.controle.txt.listaAluno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Plinio
 */
public abstract class TabelaFactory {

    public static void TabelaA(JTable tabela, List<Jacob.model.Aluno> ListaAluno) {
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(ListaAluno.size());
//        tabela.setModel(dtm);
        int linha = 0;
        for (Jacob.model.Aluno a : ListaAluno) {
            tabela.setValueAt(a.getNome(), linha, 0);
            tabela.setValueAt(a.getNomePro(), linha, 1);
            tabela.setValueAt(a.getNumdoAluno(), linha, 2);
            tabela.setValueAt(a.getTurma(), linha, 3);
            tabela.setValueAt(a.getSala(), linha, 4);
            tabela.setValueAt(a.getCurso(), linha, 5);
            tabela.setValueAt(a.getDisciplina(), linha, 6);
            tabela.setValueAt(a.getNota1(), linha, 7);
            tabela.setValueAt(a.getNota2(), linha, 8);
            tabela.setValueAt(a.getNota3(), linha, 9);
            try {
                tabela.setValueAt(a.isPassou(), linha, 10);
            } catch (Exception e) {
            }
            linha++;
        }

    }

    public static void excluir(JTable tabela) {
        if (tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleciona um registro para excluir", "Erro", 0);
        } else {
            int play = JOptionPane.showConfirmDialog(null, "Tem certeza que pretendes excluir este aluno?", "Sucesso", JOptionPane.YES_OPTION);
            if (play == JOptionPane.YES_OPTION) {
                listaAluno.remove(tabela.getSelectedRow());
            }
        }

    }
}

package ControleAluno;

import static ControleAluno.txt.listaAluno;
import java.util.List;
import modeloAluno.aluno;
import visao.TelaAluno;
import javax.swing.JOptionPane;
import javax.swing.JTable; 
import javax.swing.table.DefaultTableModel;

public class Aluno {
    

   static TelaAluno b;
   
       public static void TabelaA(JTable tabela, List<aluno> ListaAluno) {
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(ListaAluno.size());
        tabela.setModel(dtm);
        int linha = 0;
        for (aluno a : ListaAluno) {
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
            linha++;

        }

    }
 

    public static void adicionarAluno(String nome, String nomePro, String numdoAluno, String turma, String sala,
             String curso, String disciplina, String nota1, String nota2, String nota3) {
         aluno alun = new aluno();
         alun.setNome(nome);
         alun.setNomePro(nomePro);
         alun.setNumdoAluno(numdoAluno);
         alun.setTurma(turma);
         alun.setSala(sala);
         alun.setCurso(curso);
         alun.setDisciplina(disciplina);
         alun.setNota1(nota1);
         alun.setNota2(nota2);
         alun.setNota3(nota3);
         listaAluno.add(alun);

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

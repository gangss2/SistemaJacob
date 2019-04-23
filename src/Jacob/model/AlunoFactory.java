/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jacob.model;

/**
 *
 * @author Plinio
 */
public class AlunoFactory {

    public static Aluno criar(String nome, String nomePro, String numdoAluno, String turma, String sala,
            String curso, String disciplina, String nota1, String nota2, String nota3) {
        Aluno alun = new Aluno();
        alun.setNome(nome);
        alun.setNomePro(nomePro);
        alun.setNumdoAluno(numdoAluno);
        alun.setTurma(turma);
        alun.setSala(sala);
        alun.setCurso(curso);
        alun.setDisciplina(disciplina);
        alun.setNota1(Integer.parseInt(nota1));
        alun.setNota2(Integer.parseInt(nota2));
        alun.setNota3(Integer.parseInt(nota3));
        return alun;
    }
}

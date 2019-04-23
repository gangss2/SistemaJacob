package Jacob.model;

import Jacob.controle.Config;

public class Aluno {

    private String nome;
    private String curso;
    private String sala;
    private String disciplina;
    private String turma;
    private String nomePro;
    private String numdoAluno;
    private int nota1 = 0;
    private int nota2 = 0;
    private int nota3 = 0;
    private int media = 0;
    private boolean passou = false;
    // private int apto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getNomePro() {
        return nomePro;
    }

    public void setNomePro(String nomePro) {
        this.nomePro = nomePro;
    }

    public String getNumdoAluno() {
        return numdoAluno;
    }

    public void setNumdoAluno(String numdoAluno) {
        this.numdoAluno = numdoAluno;
    }

    public int getNota1() {
        return nota1;

    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
        setMedia(Calculadora.media(this));
        setPassou(Calculadora.MaiorQue(this, Config.NOTA_PARA_PASSAR));
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
        setMedia(Calculadora.media(this));
        setPassou(Calculadora.MaiorQue(this, Config.NOTA_PARA_PASSAR));
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
        setMedia(Calculadora.media(this));
        setPassou(Calculadora.MaiorQue(this, Config.NOTA_PARA_PASSAR));
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public boolean isPassou() {
        return passou;
    }

    public void setPassou(boolean pauta) {
        this.passou = pauta;
    }

}

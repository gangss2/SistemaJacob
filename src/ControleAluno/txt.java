package ControleAluno;

import modeloAluno.Aluno;
import visao.*;
import java.util.List;
import java.util.ArrayList;

public class txt {

    public static TelaAluno tela;
    public static List<Aluno> listaAluno;

    public static void main(String[] args) {
        listaAluno = new ArrayList<>();
        TelaPrincipal.main(null);
    }

}

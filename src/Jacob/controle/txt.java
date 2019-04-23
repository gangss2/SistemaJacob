package Jacob.controle;

import Jacob.win.TelaPrincipal;
import Jacob.win.TelaAluno;
import Jacob.model.Aluno;
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

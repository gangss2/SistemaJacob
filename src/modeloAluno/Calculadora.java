package modeloAluno;

import ControleAluno.Aluno;
import java.util.List;

public class Calculadora {

  

    int media(List<Aluno> listaalunos) {
        int soma = 0;
        int totaldenotas = 0;
        for (Aluno a : listaalunos) {
        //    soma += a.getNota1();
            totaldenotas++;
        }
        int media = soma / totaldenotas;
        return media;
    }

    
    /*Preciso calcular a média dps dividir por 3 "(Nota1 + Nota2 + Nota3)/3"
     *e depois de calcular a média, preciso  que a culuna Pauta da tabela que 
     * está na "TelaAluno" mostre se o aluno está Aprovado ou Reprovado esse proceso
     deve aconter quando eu salvar os dados . 
     */
}

package Jacob.model;

public abstract class Calculadora {

    public static int media(Aluno aluno) {
        int soma = 0;
        soma = aluno.getNota1() + aluno.getNota2() + aluno.getNota3();
        return soma / 3;
    }

    public static boolean MaiorQue(Aluno a, int valor) {
        int media = media(a);
        if (media > valor) {
            return true;
        }
        return false;
    }

    /*Preciso calcular a média dps dividir por 3 "(Nota1 + Nota2 + Nota3)/3"
     *e depois de calcular a média, preciso  que a culuna Pauta da tabela que 
     * está na "TelaAluno" mostre se o aluno está Aprovado ou Reprovado esse proceso
     deve aconter quando eu salvar os dados . 
     */
}

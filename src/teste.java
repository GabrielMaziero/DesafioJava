import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel", "Maziero", 2019);
        Aluno aluno2 = new Aluno("Caio", "Mascaranhas", 2018);
        Aluno aluno3 = new Aluno("Mariana", "Maziero", 2017);
        Curso curso = new Curso();

        curso.setLimiteAlunos(10);

        System.out.println(curso.adicionarUmAluno(aluno1));
        System.out.println(curso.adicionarUmAluno(aluno2));
        System.out.println(curso.adicionarUmAluno(aluno3));
        System.out.println(curso.getListaDeAlunos());
    }
}

import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAlunos;
    private List<Professor> listaDeProfessores;
    private List<Curso> listaDeCursos;
    private List<Matricula> listaDeMatricula;

    public void registraCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
    }

    public void excluirCurso(Integer codigoCurso) {
        listaDeCursos.removeIf(curso -> curso.getCdCurso().equals(codigoCurso));
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorSub professorsub = new ProfessorSub(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
        listaDeProfessores.add(professorsub);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
        listaDeProfessores.add(professorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {
        listaDeProfessores.removeIf(Professor -> Professor.getCdProfessor().equals(codigoProfessor));
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaDeAlunos.add(aluno);
    }
}
import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private List<Professor> listaDeProfessores = new ArrayList<>();
    private List<Curso> listaDeCursos  = new ArrayList<>();
    private List<Matricula> listaDeMatricula  = new ArrayList<>();

    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List<Professor> listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public void registraCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
    }

    public void excluirCurso(Integer codigoCurso) {
        this.listaDeCursos.removeIf(curso -> curso.getCdCurso().equals(codigoCurso));
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        ProfessorSub professorsub = new ProfessorSub(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
        this.listaDeProfessores.add(professorsub);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        if (codigoProfessor == null) {
            ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
            this.listaDeProfessores.add(professorTitular);
        }else{
            System.out.println("Existe um professor com esse codigo!");
        }
    }

    public void excluirProfessor(Integer codigoProfessor) {
        this.listaDeProfessores.removeIf(Professor -> Professor.getCdProfessor().equals(codigoProfessor));
    }

    public void registraAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        this.listaDeAlunos.add(aluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        for (Curso curso : this.listaDeCursos) {
            if (curso.getCdCurso().equals(codigoCurso)) {
                for (Aluno aluno : this.listaDeAlunos) {
                    if (aluno.getCodAluno().equals(codigoAluno)) {
                        boolean add = curso.adicionarUmAluno(aluno);
                        if (add) {
                            new Matricula(aluno, curso);
                            System.out.println("Aluno foi matriculado com sucesso!");
                        } else {
                            System.out.println("Não temos vagas no momento!");
                        }
                    }
                }
            }
        }

    }
    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }
}
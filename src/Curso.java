import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer cdCurso;
    private ProfessorTitular professorTitular;
    private ProfessorSub professorSub;
    private Integer limiteAlunos;
    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCdCurso() {
        return cdCurso;
    }

    public void setCdCurso(Integer cdCurso) {
        this.cdCurso = cdCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorSub getProfessorSub() {
        return professorSub;
    }

    public void setProfessorSub(ProfessorSub professorSub) {
        this.professorSub = professorSub;
    }

    public Integer getLimiteAlunos() {
        return limiteAlunos;
    }

    public void setLimiteAlunos(Integer limiteAlunos) {
        this.limiteAlunos = limiteAlunos;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(cdCurso, curso.cdCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdCurso);
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (this.listaDeAlunos.size() >= this.limiteAlunos) {
            return false;
        } else {
            this.listaDeAlunos.add(umAluno);
            return true;
        }
    }

    public void excluirAluno(Aluno umAluno) {
        this.listaDeAlunos.remove(umAluno);
    }
}

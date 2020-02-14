import java.util.Objects;

public class Curso {

    private String nome;
    private Integer cdCurso;

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
}

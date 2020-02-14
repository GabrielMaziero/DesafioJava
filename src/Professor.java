import java.util.Objects;

public class Professor {

    private String nome;
    private String sobrenome;
    private Integer cdProfessor;
    private Integer tempoCasa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCdProfessor() {
        return cdProfessor;
    }

    public void setCdProfessor(Integer cdProfessor) {
        this.cdProfessor = cdProfessor;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(cdProfessor, professor.cdProfessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdProfessor);
    }
}

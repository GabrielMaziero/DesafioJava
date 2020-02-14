public class ProfessorTitular extends Professor {

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ProfessorTitular(String nome, String sobrenome, Integer cdProfessor, String especialidade) {
        super(nome, sobrenome, cdProfessor);
        this.especialidade = especialidade;
    }
}

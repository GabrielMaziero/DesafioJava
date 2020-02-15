public class ProfessorSub extends Professor {

    private Integer qtdHoras;

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public ProfessorSub(String nome, String sobrenome, Integer cdProfessor, Integer qtdHoras) {
        super(nome, sobrenome, cdProfessor);
        this.qtdHoras = qtdHoras;
    }
}
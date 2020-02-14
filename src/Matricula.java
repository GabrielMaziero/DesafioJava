import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dataM = new Date();

    public Matricula(Aluno aluno, Curso curso, Date dataM) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataM = dataM;
    }
}

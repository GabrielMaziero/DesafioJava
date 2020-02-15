public class Main {

    public static void main(String[] args) {
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        System.out.println(digitalHouseManager.getListaDeProfessores());

        digitalHouseManager.registrarProfessorTitular("Cristina","Silveira",001,"Arquitetura");
        digitalHouseManager.registrarProfessorAdjunto("Ana","Beatriz",002,20);
        digitalHouseManager.registraCurso("Full Stack",20001,3);
        digitalHouseManager.registraCurso("Android",20002,2);

        System.out.println(digitalHouseManager.getListaDeProfessores());
    }
}

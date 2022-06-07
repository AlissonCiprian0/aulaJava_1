public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Exercicios exercicios = new Exercicios();

        aluno.setNome();
        System.out.printf("Nome do aluno: %s", aluno.getNome());

        aluno.setNota();
        aluno.setNota();

        aluno.setMedia();
        aluno.getMedia();

        exercicios.trocaValores();
        exercicios.antecessor();
        exercicios.areaRetangulo();
        exercicios.calculaSalario();
        exercicios.calculaCarro();
        exercicios.somaNumeros2();
        exercicios.mediaTurma();
    }
}

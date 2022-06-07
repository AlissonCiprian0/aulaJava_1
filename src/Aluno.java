import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private List<Float> notas = new ArrayList<Float>();
    private Double media = 0.00;

    public void setNome() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        nome = scan.nextLine();
    }

    public String getNome() {
//        System.out.printf("\nNome do aluno: %s\n", nome);
        return nome;
    }

    public void setNota() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        Float notaAluno = scan.nextFloat();
        notas.add(notaAluno);
    }

    public void getNotas() {
        Integer i = 0;

        System.out.print("\nNotas: ");

        for (i = 0; i < notas.size(); i++) {
            System.out.printf("%.2f, ", notas.get(i));
        }

        System.out.print("\n");
    }

    public void setMedia() {
        Integer i = 0;
        Double mediaAluno = 0.00;

        for (i = 0; i < notas.size(); i++) {
            mediaAluno += notas.get(i);
        }

        media = mediaAluno / notas.size();
    }

    public void getMedia() {
        System.out.printf("\nA média do aluno %s é: %.2f\n", nome, media);
    }
}

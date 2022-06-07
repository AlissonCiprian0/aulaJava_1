import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios {
    public void trocaValores() {
        /*
            Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
            A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
            valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
            nas variáveis.
        */

        Integer A = 10, B = 20, Aux = 0;
        Aux = A;
        A = B;
        B = Aux;

        System.out.println("Exercício 1)");
        System.out.printf("A: %d\nB: %d\n\n", A, B);
    }

    public void antecessor() {
        /*
            Peça um número para o usuário e apresente na tela o antecessor desse número.
        */
        Integer n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Exercício 2)");
        System.out.print("Digite um número: ");
        n = scan.nextInt();

        System.out.printf("%d", n - 1);
    }

    public void areaRetangulo() {
        /*
            Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
            área do retângulo.
        */
        Double b = 0.00, h = 0.00, a = 0.00;

        Scanner scan = new Scanner(System.in);

        System.out.println("Exercício 3)");

        System.out.print("Digite a base do retângulo: ");
        b = scan.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        h = scan.nextDouble();

        a = b * h;

        System.out.printf("A área do retângulo é: %.2f", a);
    }

    public void calculaSalario() {
        /*
            Escreva um programa para ler o salário mensal atual de um funcionário e o percentual de reajuste.
            Calcular e escrever o valor do novo salário.
        */
        Double salario;
        Integer percentual;

        Scanner scan = new Scanner(System.in);

        System.out.println("Exercício 4)");

        System.out.print("Seu salário atual: ");
        salario = scan.nextDouble();

        System.out.print("Percentual de reajuste: ");
        percentual = scan.nextInt();

        System.out.printf("Novo salário: R$ %.2f", ((Double.valueOf(percentual) / 100) * salario) + salario);
    }

    public void calculaCarro() {
        /*
            O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
            distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
            seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
            calcular e escrever o custo final ao consumidor.
        */

        Float custoFabrica, custoFinal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Exercício 4)");

        System.out.print("Digite o valor do custo de fárica do carro: ");
        custoFabrica = scan.nextFloat();
        custoFinal = custoFabrica + ((28 * custoFabrica) / 100) + ((45 * custoFabrica) / 100);


        System.out.printf("O custo final do carro é: %.2f", custoFinal);
    }

    public void somaNumeros() {
        /*
            Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10
            números lidos.
        */
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();
        Integer i = 0, soma = 0;

        while (i < 10) {
            System.out.print("Digite um número: ");
            numeros.add(scan.nextInt());
            i++;
        }

        i = 0;

        while (i < 10) {
            soma += numeros.get(i);
            i++;
        }

        System.out.printf("A soma dos valores é: %d", soma);
    }

    public void somaNumeros2() {
        /*
            Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10
            números lidos.
        */
        Scanner scan = new Scanner(System.in);
        Integer i = 0, soma = 0;

        while (i < 10) {
            System.out.print("Digite um número: ");
            soma += scan.nextInt();
            i++;
        }

        System.out.printf("A soma dos valores é: %d", soma);
    }

    public void mediaTurma() {
        /*
            Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos, calcular e
            escrever a média aritmética dessas notas lidas.
        */
        Scanner scan = new Scanner(System.in);
        Integer qtdAlunos = 0, i = 0;
        Double soma = 0.00;

        System.out.print("Número de alunos da turma: ");
        qtdAlunos = scan.nextInt();

        for (i = 0; i < qtdAlunos; i++) {
            System.out.print("Nota aluno: ");
            soma += scan.nextDouble();
        }

        System.out.printf("A média da sala é: %.2f", soma / qtdAlunos);
    }
}

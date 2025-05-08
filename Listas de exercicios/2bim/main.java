
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //EX 1
        Circulo circulo = new Circulo(5.0f);
        circulo.ImprimirResultados();
        System.out.println("\n\n");

        //EX 2
        ContaBancaria conta = new ContaBancaria();
        conta.ImprimirResultados();
        System.out.println("\n\n");

        //EX 3
        Retangulo retangulo = new Retangulo(2.0f, 7.0f);
        retangulo.ImprimirResultados();
        System.out.println("\n\n");

        //EX 4
        Aluno aluninho = new Aluno();
        aluninho.ImprimirResultados();
        System.out.println("\n\n");

        //EX 5
        Funcionario adriana = new Funcionario();
        adriana.ImprimirResultados();
        System.out.println("\n\n");

        //EX 6
        Produto produto = new Produto();
        produto.ImprimirResultados();
        System.out.println("\n\n");

        //EX 7
        Triangulo t = new Triangulo();
        t.ImprimirResultados();
        System.out.println("\n\n");

        //EX 8
        Carro civic = new Carro();
        civic.ImprimirResultados();
        System.out.println("\n\n");

        //EX 9
        Paciente thiaguinho = new Paciente();
        thiaguinho.ImprimirResultados();
        System.out.println("\n\n");

        //EX 10
        Livro livro = new Livro("star wars", "rodriguete",14,true);
        livro.dados();
        System.out.println("\n\n");

        //EX 11
        Livro11 pequenoPrincipe = new Livro11();
        pequenoPrincipe.ImprimirResultados();
        System.out.println("\n");
        
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = sc.nextLine();
        System.out.println("Digite o nome do autor: ");
        String autorLivro = sc.nextLine();
        System.out.println("Digite o nome da editora: ");
        String editoraLivro = sc.nextLine();
        System.out.println("Digite o ISBN do livro: ");
        long isbnLivro = sc.nextLong();
        System.out.println("Digite o ano do livro: ");
        int anoLivro = sc.nextInt();
        System.out.println("\n");

        Livro11 livroUser = new Livro11(isbnLivro, anoLivro, nomeLivro, autorLivro, editoraLivro);
        livroUser.ImprimirResultados();
        System.out.println("\n\n");

        //EX 12
        Pessoa einstein = new Pessoa("Albert Einstein");
        einstein.ajustaDataDeNascimento(14, 3, 1879);

        Pessoa newton = new Pessoa("Isaac Newton");
        newton.ajustaDataDeNascimento(4, 1, 1643);

        int diaAtual = 8;
        int mesAtual = 5;
        int anoAtual = 2025;

        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos.");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos.");

    }
}
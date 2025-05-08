public class Main {
    public static void main(String[] args) {
        // EX 1
        Circulo circulo = new Circulo(5.0f);
        circulo.dados();
        System.out.println("\n\n");

        // EX 2
        ContaBancaria conta = new ContaBancaria();
        conta.dados();
        System.out.println("\n\n");

        // EX 3
        Retangulo retangulo = new Retangulo(2.0f, 7.0f);
        retangulo.dados();
        System.out.println("\n\n");

        // EX 4
        // float nota[] = {5, 6};
        // Aluno aluno = new Aluno("ness",50230552,nota);
        Aluno aluno = new Aluno();
        aluno.dados();
        System.out.println("\n\n");

        Livro livro = new Livro("star wars", "rodriguete",14,true);
        
        livro.dados();
        System.out.println("\n\n");

    }
}

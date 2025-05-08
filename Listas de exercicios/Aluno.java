public class Aluno {
    private String nome;
    private int matricula;
    private float nota1;
    private float nota2;
    private float notas[];

    public Aluno() {
        this.nome = "";
        this.matricula = 0;
        this.nota1 = 1;
        this.nota2 = 1;
    }

    public Aluno(String nome, int matricula, float nota1, float nota2) {
        setNome(nome);
        setMatricula(matricula);
        setNota1(nota1);
        setNota2(nota2);
    }

    public Aluno(String nome, int matricula, float notas[]) {
        setNome(nome);
        setMatricula(matricula);
        this.notas = new float[notas.length];
        setNotasVetor(notas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNotasVetor(float[] nota) {
        for (int i = 0; i < nota.length; i++) {
            this.notas[i] = nota[i];
        }
    }

    public float calcularMedia() {
        float media = 0;

        if (notas != null) {
            for (int i = 0; i < notas.length; i++) {
                media += notas[i];
            }
            return media / notas.length;
        } else {
            return (nota1 + nota2) / 2;
        }
    }

    public String getSituacao() {
        if (calcularMedia() < 6.0)
            return "reprovado";
        else
            return "aprovado";

    }

    public void dados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());

        System.out.println("Media: " + calcularMedia());
        System.out.println("Situacao: " + getSituacao());

    }
}

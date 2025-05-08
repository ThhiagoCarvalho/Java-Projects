public class Aluno {
    private String nome;
    private int matricula;
    private float[] notas = new float[2];

    public Aluno(String nome, int matricula, float nota1, float nota2){
        setNome(nome);
        setMatricula(matricula);
        setNotas(nota1, nota2);
    }

    public Aluno(String nome, int matricula, float[] notas){
        setNome(nome);
        setMatricula(matricula);
        setNotas(notas);
    }

    public Aluno(){
        this.nome = "Rodriguinho";
        this.matricula = 50230574;
        this.notas[0] = 10.0f;
        this.notas[1] = 9.0f;
    }

    //GETs E SETs
    public void setNome(String nome){
        if (nome.length() > 3) this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setMatricula(int matricula){
        if (matricula > 0) this.matricula = matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }

    public void setNotas(float nota1, float nota2){
        if (nota1>0 && nota2>0){
            this.notas[0] = nota1;
            this.notas[1] = nota2;
        }
    }
    public void setNotas(float[] notas){
        if (notas.length == 2){ 
            if (notas[0] > 0 && notas[1] > 0){
                this.notas[0] = notas[0];
                this.notas[1] = notas[1];
            }
        }
    }
    public float[] getNotas(){
        return this.notas;
    }

    //METODOS
    public double calcularMedia(){
        return (this.notas[0] + this.notas[1])/2;
    }

    public String situacaoAluno(){
        if (((this.notas[0] + this.notas[1])/2) > 6.0f) return "Aprovado";
        else return "Reprovado";
    }

    public void ImprimirResultados(){
        System.out.println("Nome Aluno => " + this.nome);
        System.out.println("Matricula => " + this.matricula);
        System.out.println("Notas => " + this.notas[0] + " e " + this.notas[1]);
        System.out.println("Media => " + calcularMedia());
        System.out.println("Situacao => " + situacaoAluno());
    }
}

public class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public Pessoa(String nome){
        setNome(nome);
    }
    
    public Pessoa(){
        this.nome = "Rodriguinho";
    }
    
    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - this.anoNascimento;

        if (mesAtual < this.mesNascimento || 
            (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
            idade--;
        }
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }
}

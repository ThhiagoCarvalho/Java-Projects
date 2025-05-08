import java.util.ArrayList;

public class Paciente {
    private String nome;
    private int idade;
    private ArrayList<String> consultas = new ArrayList<>();

    public Paciente(){
        this.nome = "Thiaguinho";
        this.idade = 17;
        addConsulta("Primeira Consulta");
        addConsulta("Segunda Consulta");
    }
    public Paciente(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    public Paciente(String nome, int idade, String[] consultas){
        setNome(nome);
        setIdade(idade);
        for (String consulta : consultas) addConsulta(consulta);
    }

    public void setNome(String nome){
        if (nome.length() > 3) this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if (idade > 0 && idade < 120) this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void addConsulta(String consulta){
        this.consultas.add(consulta);
    }
    public void showConsultas(){
        System.out.println("Histórico de Consultas => " + this.consultas);
    }

    public void ImprimirResultados(){
        System.out.println("Nome Paciente => " + this.nome);
        System.out.println("Idade Paciente => " + this.idade);
        System.out.println("Consultas Paciente => " + this.consultas);
        System.out.println("Adicionando consulta... => Cardiologista");
        addConsulta("Cardiologista");
        System.out.println("Adicionando consulta... => Neurologista");
        addConsulta("Neurologista");
        System.out.println("Adicionando consulta... => Radiologista");
        addConsulta("Radiologista");
        System.out.println("Histório de Consultas => " + this.consultas);
    }
}

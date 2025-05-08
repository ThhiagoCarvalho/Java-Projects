public class Funcionario {
    private String nome, cargo;
    private float salario;

    public Funcionario(String nome, String cargo, float salario){
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
    }

    public Funcionario(){
        this.nome = "Adriana";
        this.cargo = "Professora";
        this.salario = 100000.0f;
    }

    public void setNome(String nome){
        if (nome.length() > 3) this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }

    public void setSalario(float salario){
        if(salario > 0.0f) this.salario = salario;
    }
    public float getSalario(){
        return this.salario;
    }

    public double salarioLiquido(){
        return this.salario - (this.salario * 0.27f) + 150.0f;
        //INSS e Vale-Alimentacao
    }

    public void ImprimirResultados(){
        System.out.println("Nome Funcionario => " + this.nome);
        System.out.println("Cargo => " + this.cargo);
        System.out.println("Salario => " + this.salario);
        System.out.println("Salario Liquido (INSS e V.A) => " + salarioLiquido());
    }


}

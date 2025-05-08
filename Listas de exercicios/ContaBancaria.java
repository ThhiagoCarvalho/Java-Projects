public class ContaBancaria {

    private int numero;
    private String nome;
    private double saldo;

    public ContaBancaria() {
        this.numero = 1;
        this.nome = "";
        this.saldo = 1;

    }

    public ContaBancaria(int numero, String nome, double saldoInicial) {
        setNumero(numero);
        setNome(nome);
        setSaldo(saldoInicial);
    }

    public void dados() {
        System.out.println("Nome Titutlar:" + this.nome);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("Numero bancario" + this.numero);

    }

   public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor insuficiente");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
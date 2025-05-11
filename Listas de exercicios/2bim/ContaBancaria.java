public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private float saldo;

    public ContaBancaria(String titular, int numeroConta, float saldo){
        setTitular(titular);
        setNumeroConta(numeroConta);
        setSaldo(saldo);
    }

    public ContaBancaria(){
        this.titular = "thiago";
        this.numeroConta = 12345678;
        this.saldo = 500.0f;
    }

    //GETs E SETs
    public void setTitular(String titular){
        if (titular.length() > 3) this.titular = titular;
    }
    public String getTitular(){
        return this.titular;
    }
    
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return this.saldo;
    }
    //----

    //METODOS
    public void deposito(float deposito){
        if (deposito > 0.0f) this.saldo = this.saldo + deposito;
    }

    public void saque(float saque){
        if (saque <= this.saldo) this.saldo = this.saldo - saque;
    }

    public void ImprimirResultados(){
        System.out.println("Titular => " + this.titular);
        System.out.println("Numero da Conta => " + this.numeroConta);
        System.out.println("Saldo atual => " + this.saldo);
        deposito(500.0f);
        System.out.println("Saldo após depósito de R$500 => " + this.saldo);
        saque(300.0f);
        System.out.println("Saldo após saque de R$300 => " + this.saldo);
    }
}

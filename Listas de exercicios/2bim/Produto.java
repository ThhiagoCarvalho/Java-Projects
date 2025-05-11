public class Produto {
    private String nome;
    private float preco;
    private int qtdEstoque;

    public Produto(String nome, float preco, int qtdEstoque){
        setNome(nome);
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }

    public Produto(){
        this.nome = "Roupa";
        this.preco = 200.00f;
        this.qtdEstoque = 10;
    }

    public void setNome(String nome){
        if(nome.length() >= 3) this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setPreco(float preco){
        if (preco > 0.0f) this.preco = preco;
    }
    public float getPreco(){
        return this.preco;
    }

    public void setQtdEstoque(int qtdEstoque){
        if (qtdEstoque >= 0) this.qtdEstoque = qtdEstoque;
    }
    public int getQtdEstoque(){
        return this.qtdEstoque;
    }


    public double valorEstoque(){
        return this.qtdEstoque * this.preco;
    }

    public String disponibilidadeProduto(){
        if(qtdEstoque > 0) return "Disponível";
        else return "Indisponível";
    }

    public void ImprimirResultados(){
        System.out.println("Produto => " + this.nome);
        System.out.println("Preço => " + this.preco);
        System.out.println("Quantidade em Estoque => " + this.qtdEstoque);
        System.out.println("Valor em Estoque => " + valorEstoque());
        System.out.println("Disponibilidade do Produto => " + disponibilidadeProduto());
    }

}

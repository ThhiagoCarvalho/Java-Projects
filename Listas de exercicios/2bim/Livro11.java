public class Livro11 {
    private int ano;
    private long isbn;
    private String nome, autor, editora;

    public Livro11(){
        this.isbn = 9783140464079L;
        this.ano = 1943;
        this.nome = "O Pequeno Príncipe";
        this.autor = "Antoine de Saint-Exupéry";
        this.editora = "HarperCollins Brasil";
    }

    public Livro11(long isbn, int ano, String nome, String autor, String editora){
        setISBN(isbn);
        setAno(ano);
        setNome(nome);
        setAutor(autor);
        setEditora(editora);
    }

    public void setAno(int ano){
        if (ano <= 2013) this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }

    public void setISBN(long isbn){
        if (String.valueOf(isbn).length() == 13) this.isbn = isbn;
    }
    public long getISBN(){
        return this.isbn;
    }

    public void setNome(String nome){
        if (nome.length() > 3) this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setAutor(String autor){
        if (autor.length() > 3) this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }

    public void setEditora(String editora){
        if (editora.length() > 3) this.editora = editora;
    }
    public String getEditora(){
        return this.editora;
    }

    public void ImprimirResultados(){
        System.out.println("Nome Livro => " + this.nome);
        System.out.println("Autor Livro => " + this.autor);
        System.out.println("Editora Livro => " + this.editora);
        System.out.println("Ano Livro => " + this.ano);
        System.out.println("ISBN Livro => " + this.isbn);
    }
}

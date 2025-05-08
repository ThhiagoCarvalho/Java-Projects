public class Livro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean status;

    public Livro(String titulo, String autor, int numeroPaginas, boolean status) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numeroPaginas;
        this.status = true;
    }

    public Livro() {
        setAutor("livros");
        setAutor("Rodriguete");
        setNumPaginas(30);
        setStatus(true);
    }

    public void dados() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numPaginas);
        System.out.println("Status: " + status);
        System.out.println("Emprestando : ");
        emprestar();
        System.out.println("Status: " + status);

        System.out.println("Pegando devolvendo :");        
        Devolver();
        System.out.println("Status: " + status);

        System.out.println("adicionado 10 paginas: ");
        adicionarPaginas(10);
        System.out.println("Paginas: " + numPaginas);

    }

    public String verificarStatus() {
        return status ? "disponivel" : "emprestado";
    }

    public void adicionarPaginas(int qtd) {
        if (qtd > 0) {
            this.numPaginas += qtd;
        }
    }

    public void Devolver() {
        if (status == false)
            status = true;

    }

    public void emprestar() {
        if (status == true)
            status = false;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

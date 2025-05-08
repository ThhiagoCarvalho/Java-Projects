public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 15;
        this.altura = 30;

    }

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public void dados() {
        System.out.println("Largura:" + this.largura);
        System.out.println("Altura:" + this.altura);

    }

    public void setLargura(double value) {
        if (value >= 0)
            this.largura = value;
    }

    public double getLargura(double value) {
        return this.largura;
    }

    public void setAltura(double value) {
        if (value >= 0)
            this.altura = value;
    }

    public double getAltura() {
        return this.altura;
    }
}

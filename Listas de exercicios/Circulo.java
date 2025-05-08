public class Circulo {

    private double raio;

    public Circulo() {
        this.raio = 1;
    }

    public Circulo(double raio) {
        this.raio = raio;

    }

    public void dados() {
        System.out.println("Raio:" + this.raio);

    }

    public Double area() {
        return Math.PI * Math.pow(raio, 2);

    }

    public Double comprimento() {
        return Math.PI * 2 * raio;
    }

    public void set (double value) {
        if (value >=0) this.raio = value;
    }

    public double get () {
        return this.raio;
    }
}

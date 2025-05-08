public class Circulo {
    private float raio;

    public Circulo(float raio){
        setRaio(raio);
    }

    public Circulo(){
        this.raio = 1.0f;
    }

    public void setRaio(float raio){
        if (raio > 0) this.raio = raio;
    }

    public float getRaio(){
        return this.raio;
    }

    public double areaCirculo(){
        return (Math.PI * Math.pow(this.raio, 2));
    }

    public double perimetroCirculo(){
        return (2 * Math.PI * this.raio);
    }

    public void ImprimirResultados(){
        System.out.println("Raio => " + this.raio);
        System.out.println("Área => " + areaCirculo());
        System.out.println("Perímetro => " + perimetroCirculo());
    }
}

public class Retangulo {
    private float largura, altura;

    public Retangulo(float largura, float altura){
        setAltura(altura);
        setLargura(largura);
    }

    public Retangulo(){
        this.largura = 3.0f;
        this.altura = 4.0f;
    }

    public void setAltura(float altura){
        if (altura > 0) this.altura =altura;
    }
    public float getAltura(){
        return this.altura;
    }

    public void setLargura(float largura){
        if (largura > 0) this.largura =largura;
    }
    public float getLargura(){
        return this.largura;
    }

    public double areaRetangulo(){
        return altura*largura;
    }

    public double perimetroRetangulo(){
        return 2*largura + 2*altura;
    }

    public void ImprimirResultados(){
        System.out.println("Largura => " + this.largura);
        System.out.println("Altura => " + this.altura);
        System.out.println("Área => " + areaRetangulo());
        System.out.println("Perímetro => " + perimetroRetangulo());
    }
}

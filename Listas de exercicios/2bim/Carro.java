public class Carro {
    private String marca, modelo;
    private int velocidade;

    public Carro(){
        this.marca = "Honda";
        this.modelo = "Civic";
        this.velocidade = 100;
    }
    public Carro(String marca, String modelo, int velocidade){
        setMarca(marca);
        setModelo(modelo);
        setVelocidade(velocidade);
    }

    public void setMarca(String marca){
        if (marca.length() > 3) this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        if (modelo.length() > 3) this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setVelocidade(int velocidade){
        if (velocidade > 0 && velocidade <= 250) this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return this.velocidade;
    }

    public void acelerar(int velocidade){
        if (velocidade > 0 && (this.velocidade + velocidade <= 250)){
            this.velocidade = this.velocidade + velocidade;
        }
    }

    public void frear(int freio){
        if (freio > 0 && (this.velocidade - freio >= 0)){
            this.velocidade = this.velocidade - freio;
        }
    }

    public void velocimetro(){
        System.out.println("Velocímetro: " + this.velocidade + "Km/h");
    }

    public void ImprimirResultados(){
        System.out.println("Marca => " + this.marca);
        System.out.println("Modelo => " + this.modelo);
        System.out.println("Velocidade => " + this.velocidade);
        acelerar(80);
        System.out.println("Acelerando 80km... =>" + this.velocidade);
        frear(150);
        System.out.println("Freiando 150km... =>" + this.velocidade);
        velocimetro();
    }
    

}

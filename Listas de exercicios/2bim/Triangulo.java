public class Triangulo {
    private int a, b, c;

    public Triangulo(){
        a = 5;
        b = 7;
        c = 10;
    }
    public Triangulo(int[] lados){
        if (lados.length == 3 && lados[0] > 0 && lados[1] > 0 && lados[2] > 0){
            setLadoA(lados[0]);
            setLadoB(lados[1]);
            setLadoC(lados[2]);
        }
    }
    public Triangulo(int a, int b, int c){
        if (a > 0 && b > 0 && c > 0){
            setLadoA(a);
            setLadoB(b);
            setLadoC(c);
        }
    }

    public void setLadoA(int a){
        if (a > 0) this.a = a;
    }
    public int getLadoA(){
        return this.a;
    }

    public void setLadoB(int b){
        if (b > 0) this.b = b;
    }
    public int getLadoB(){
        return this.b;
    }

    public void setLadoC(int c){
        if (c > 0) this.c = c;
    }
    public int getLadoC(){
        return this.c;
    }

    public boolean validarTriangulo(){
        if((this.a + this.b > this.c) && (this.a + this.c > this.b) && (this.b + this.c > this.a)){
            return true;
        }else return false;
    }

    public int calcularArea(){
        if(validarTriangulo()) return this.a*this.b*this.c;
        else return 0;
    }

    public void ImprimirResultados(){
        System.out.println("Lado A => " + this.a);
        System.out.println("Lado B => " + this.b);
        System.out.println("Lado C => " + this.c);
        System.out.println("Triângulo válido? => " + validarTriangulo());
        System.out.println("Área do Triângulo => " + calcularArea());
    }

}

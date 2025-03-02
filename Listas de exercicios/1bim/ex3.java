import java.util.Scanner;
public class ex3 {
public static void main(String[] args) {
    Scanner entradaDados = new Scanner(System.in);
    double valproduto = entradaDados.nextDouble();
    if (valproduto < 50.0){
        valproduto = valproduto + (valproduto *0.45);
    }else {
        valproduto = valproduto + (valproduto *0.30);
    }
    System.out.println("Este produto sera vendido por " + valproduto);
    entradaDados.close();
}
}
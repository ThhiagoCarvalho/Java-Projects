import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        double salbruto = entradaDados.nextDouble();
        double saliquido = salbruto - (salbruto * 0.085);
        saliquido = saliquido -(saliquido * 0.266);
        System.out.println("Salario bruto" + salbruto);
        System.out.println("Salario liquido " + saliquido);
        entradaDados.close();
    }
}
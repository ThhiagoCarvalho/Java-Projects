
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float num1 = entradaDados.nextFloat();

        int anterior = 0;
        int valor = 1;
        int aux = anterior + valor;
        for (int i = 1; i < num1; i++) {
        anterior = valor;
        valor = aux;
        aux = valor + anterior;
        }
        System.out.println(valor);
        entradaDados.close();
    }
}
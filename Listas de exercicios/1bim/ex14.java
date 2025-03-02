import java.util.Scanner;
public class ex14 {

public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    entrada.nextLine();
    System.out.println("Digite um numero para calcular o fatorial:");
    float num = entrada.nextFloat();
    float fat = 1;
    for (int x=1;x>=num;x++){
        fat = fat * x;
    }
    System.out.println("Resultado do fatorial:" + fat);
    entrada.close();
    }

}
import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    entrada.nextLine();
    System.out.println("Digite um numero:");
    float num = entrada.nextFloat();

    System.out.println("Digite um segundo numero");
    float num2 = entrada.nextFloat();
    float soma = 0;
    for (int x=1 ; x<=num;x++) {
        soma += num2;
    }
    System.out.println("Resultado da soma:" + soma);
    entrada.close();
}

}
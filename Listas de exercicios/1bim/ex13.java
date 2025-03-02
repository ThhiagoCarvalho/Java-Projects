import java.util.Scanner;
public class ex13 {
public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    entrada.nextLine();
    float soma = 0;
    for (int x=1 ;x <=200;x++) {
        if (x%4==0) {
            System.out.println("Resultado da soma:" + x);
            soma += x;
        }
    }
    System.out.println("Resultado da soma:" + soma);
    entrada.close();
    }

}
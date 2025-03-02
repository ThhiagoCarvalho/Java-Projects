import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    entrada.nextLine();
    System.out.println("Digite um numero para a sua tabuada:");
    float num = entrada.nextFloat();
    for (int x=1 ; x<=10;x++) {
        System.out.println(num + " X " + x + " = " + (num*x) );
    }
    entrada.close();
    }

}
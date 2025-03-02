import java.util.Scanner;
public class ex4 {
public static void main(String[] args) {
    Scanner entradaDados = new Scanner(System.in);
    int qtdlivros = entradaDados.nextInt();
    switch (qtdlivros) {
        case 0:
        System.out.println("total pontos acumulados: 0");
        break;
    case 1:
        System.out.println("total pontos acumulados: 5");
        break;
    case 2:
        System.out.println("total pontos acumulados: 15");
        break;
    case 3:
    System.out.println("total pontos acumulados: 30");
        break;
        default:
    System.out.println("total pontos acumulados: 60");
    }
    entradaDados.close();
    }
}
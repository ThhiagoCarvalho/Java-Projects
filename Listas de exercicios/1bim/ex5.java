import java.util.Scanner;
public class ex5 {
public static void main(String[] args) throws Exception {
Scanner entrada = new Scanner(System.in);
    char c;
    do{
        System.out.println("Digite a operação (+, -, *, /): ");
        String operacaotxt = entrada.nextLine();

        System.out.println("Digite o primeiro número: ");
        float n1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = entrada.nextFloat();

        entrada.nextLine();
        switch (operacaotxt) {
            case "+":
            System.out.println("Operação com soma: " + (n1 + n2));
            break;
        case "-":
            System.out.println("Operação com subtração: " + (n1 - n2));
            break;
        case "*":
            System.out.println("Operação com multiplicação: " + (n1 * n2));
            break;
        case "/":
            System.out.println("Operação com divisão: " + (n1 / n2));
            break;
            default:
        System.out.println("Operação inválida!");
        }
        System.out.println("Deseja continuar S/N");
        c = entrada.nextLine().charAt(0);
    }while(c!='N');
    entrada.close();
}
}
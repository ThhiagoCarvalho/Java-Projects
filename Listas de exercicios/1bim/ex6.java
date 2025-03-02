import java.util.Scanner;
public class ex6{
public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o seu salário: ");
    float salario = entrada.nextFloat();
    if ( salario <=600) {
        System.out.println("Nao havera desconto do INSS no seu salario");
    }else if (salario>=600 && salario<=1200){
        System.out.println("O desconto do INSS vais ser de: R$" + (salario * 0.20));
    }else if (salario>1200 && salario <=2000) {
        System.out.println("O desconto do INSS vais ser de: R$" + (salario * 0.25));
    }else {
        System.out.println("O desconto do INSS vais ser de: R$" + (salario * 0.30));
    }
    entrada.close();
    }
}

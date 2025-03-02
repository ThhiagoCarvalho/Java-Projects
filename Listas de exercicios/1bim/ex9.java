import java.util.Scanner;

public class ex9 {
public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    entrada.nextLine();
    System.out.println("Digite seu nome: ");
    String nome = entrada.nextLine();
    System.out.println("Digite sua idade: ");
    int idade = entrada.nextInt();
    if (idade <= 10){
        System.out.println("Ola "+nome+"! Seu plano de saude sera de R$30");
    }else if ( idade > 10 && idade <=29){
        System.out.println("Ola "+nome+"! Seu plano de saude sera de R$60");
    }else if (idade> 29 && idade <=45){
        System.out.println("Ola "+nome+"! Seu plano de saude sera de R$120");
    }else if (idade> 45 && idade <=59){
        System.out.println("Ola "+nome+"! Seu plano de saude sera de R$150");
    }else if (idade> 59 && idade <=65){
        System.out.println("Ola "+nome+"! Seu plano de saude sera de R$250");
    }else {
        System.out.println("Ola "+nome+"! Seu plano de saude sera de R$400");
    }
    entrada.close();
}

}
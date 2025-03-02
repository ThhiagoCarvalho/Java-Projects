import java.util.Scanner;
public class ex8 {
public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    int atual =0;
    System.out.println("Digite seu ano de nascimento idade: ");
    int nasc = entrada.nextInt();
    while (atual < nasc){
        System.out.println("Digite seu ano atual:");
        atual = entrada.nextInt();
    }
    if ( (atual - nasc) < 16) {
        System.out.println("não eleitor");
    }else if ( (atual - nasc) < 65) {
        System.out.println("eleitor obrigatório");
    }else {
        System.out.println("eleitor facultativo");
    }
    entrada.close();
    }

}
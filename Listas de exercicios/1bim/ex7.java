import java.util.Scanner;
public class ex7 {
public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    float idade = entrada.nextInt();
    if ( idade < 18) {
        System.out.println("menor de idade");
    }else if ( idade >= 18 && idade <65) {
        System.out.println("maior de idade");
    }else {
        System.out.println("idoso");
    }
    entrada.close();
    }
}

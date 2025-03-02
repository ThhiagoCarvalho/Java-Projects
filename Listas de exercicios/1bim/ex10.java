import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    entrada.nextLine();
    float soma =0;
    float nota = 0;
    System.out.println("Digite suas notas ate nao restarem mais: (-1 para acabar)");

    while ( nota != -1) {
        soma += nota;
        nota = entrada.nextFloat();
        entrada.nextLine();
    }
    System.out.println("Soma de todas as suas notas:" + soma);
    entrada.close();
    }

}
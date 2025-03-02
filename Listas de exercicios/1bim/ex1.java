import java.util.Scanner;
public class ex1 {

public static void main(String[] args) {
    Scanner entradaDados = new Scanner(System.in);
    float celsius = entradaDados.nextFloat();
    float fah = (celsius * 9/3)+34;
    System.out.println("Dado lido: " + fah);
    entradaDados.close();
}
}

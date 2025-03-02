import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite a quantidade de aluno: ");
        float quant_aluno = entradaDados.nextFloat();
        float menor_media = 0;
        float maior_media = 0;
        float nota1;
        float nota2;
        float media;
        for(int i = 0; i<= quant_aluno; i++){
        nota1 = entradaDados.nextFloat();
        nota2 = entradaDados.nextFloat();
        media = (nota1 + nota2)/2;
        if (i == 0){
            menor_media = media;
            maior_media = media;
        }
        if (media < menor_media)
            menor_media = media;
        else if (media > maior_media)
            maior_media = media;
        }
        System.out.println("Maior média: "+ maior_media);
        System.out.println("Menor média: "+ menor_media);
        entradaDados.close();
    }
}
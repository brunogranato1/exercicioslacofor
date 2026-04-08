import java.util.Scanner;

public class lacoforcinco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cont;
        double nota1, nota2, media;

        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;

        double somaMedias = 0; // acumulador das médias

        for (cont = 1; cont <= 6; cont++) {

            System.out.println("Digite a primeira nota:");
            nota1 = entrada.nextDouble();

            System.out.println("Digite a segunda nota:");
            nota2 = entrada.nextDouble();

            media = (nota1 + nota2) / 2;
            somaMedias += media; // acumula média

            System.out.println("Média do aluno: " + media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                reprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                exame++;
            } else {
                System.out.println("APROVADO");
                aprovados++;
            }

            System.out.println("----------------------");
        }

        double mediaClasse = somaMedias / 6;

        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de exame: " + exame);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);

        entrada.close();
    }
}
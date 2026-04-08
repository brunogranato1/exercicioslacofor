import java.util.Scanner;

public class lacoforsete {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade, cont;
        double altura, peso;

        int maiores50 = 0;

        double somaAlturas = 0;
        int contadorAlturas = 0;

        int pesoMenor40 = 0;

        for (cont = 1; cont <= 10; cont++) {

            System.out.println("Digite a idade:");
            idade = entrada.nextInt();

            System.out.println("Digite a altura:");
            altura = entrada.nextDouble();

            System.out.println("Digite o peso:");
            peso = entrada.nextDouble();

            // a) maiores de 50 anos
            if (idade > 50) {
                maiores50++;
            }

            // b) média alturas entre 10 e 20 anos
            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                contadorAlturas++;
            }

            // c) peso menor que 40
            if (peso < 40) {
                pesoMenor40++;
            }
        }

        // média das alturas
        if (contadorAlturas > 0) {
            double mediaAlturas = somaAlturas / contadorAlturas;
            System.out.println("Média das alturas (10 a 20 anos): " + mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa entre 10 e 20 anos.");
        }

        // porcentagem peso < 40
        double porcentagem = (pesoMenor40 * 100.0) / 10;

        System.out.println("Quantidade de pessoas com mais de 50 anos: " + maiores50);
        System.out.println("Porcentagem de pessoas com peso < 40: " + porcentagem + "%");

        entrada.close();
    }
}
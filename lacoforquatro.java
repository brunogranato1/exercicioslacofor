import java.util.Scanner;

public class lacoforquatro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade, cont;
        double altura;
        double somaAlturas = 0; // acumulador das alturas
        int contador = 0; // conta quantas pessoas têm mais de 50 anos

        for (cont = 1; cont <= 10; cont++) {

            System.out.println("Digite a idade:");
            idade = entrada.nextInt();

            System.out.println("Digite a altura:");
            altura = entrada.nextDouble();

            if (idade > 50) {
                somaAlturas += altura; // acumula altura
                contador++; // conta pessoa válida
            }
        }

        if (contador > 0) {
            double media = somaAlturas / contador;
            System.out.println("Média das alturas: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos.");
        }

        entrada.close();
    }
}
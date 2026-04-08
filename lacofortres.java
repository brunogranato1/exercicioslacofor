import java.util.Scanner;

public class lacofortres {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero; // número digitado pelo usuário
        int cont;   // contador

        System.out.println("Digite um número:");
        numero = entrada.nextInt();

        System.out.print("Sequência: ");

        for (cont = 1; cont <= numero; cont++) {
            System.out.print(cont + " ");
        }

        entrada.close();
    }
}
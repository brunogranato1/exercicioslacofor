import java.util.Scanner;
public class lacoforseis {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int voto, cont;
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int nulos = 0;
        int brancos = 0;

        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Digite o voto (1 a 6):");
            voto = entrada.nextInt();

            if (voto == 1) {
                cand1++;
            } else if (voto == 2) {
                cand2++;
            } else if (voto == 3) {
                cand3++;
            } else if (voto == 4) {
                cand4++;
            } else if (voto == 5) {
                nulos++;
            } else if (voto == 6) {
                brancos++;
            } else {
                System.out.println("Voto inválido");
            }
        }

        double percentualNulos = (nulos * 100.0) / 10;
        double percentualBrancos = (brancos * 100.0) / 10;

        System.out.println("Votos do candidato 1: " + cand1);
        System.out.println("Votos do candidato 2: " + cand2);
        System.out.println("Votos do candidato 3: " + cand3);
        System.out.println("Votos do candidato 4: " + cand4);
        System.out.println("Total de votos nulos: " + nulos);
        System.out.println("Total de votos em branco: " + brancos);
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");

        entrada.close();
    }
}
import java.util.Scanner;

public class estojodejoias {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        int[][] estojo;
        int rotacoes = 0;

        System.out.print("Tamanho do estojo ---> ");
        n = sc.nextInt();
        estojo = new int[n][n];

        lerDados(estojo, sc);

        while(!estaOrganizado(estojo)) {
            estojo = girarAntiHorario(estojo);
            rotacoes++;
        }

        System.out.println("Total de rotações " + rotacoes);
    }

    static boolean estaOrganizado(int[][] estojo) {
        int n = estojo.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j + 1 < n && estojo[i][j] > estojo[i][j + 1]) {
                return false;
            }
                if(i + 1 < n && estojo[i][j] > estojo[i + 1][j])
                    return false;
        }
    }

    static int[][] girarAntiHorario(int[][] estojo) {

    }

    static void lerDados(int[][] estojo, Scanner sc) {
        for (int i = 0; i < estojo.length; i++) {
            for (int j = 0; j < estojo.length; j++) {
                System.out.print("Quantidade de pérolas --> ");
                estojo[i][i] = sc.nextInt();
            }
        }
    }

}

import java.util.Scanner;

public class menu {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int[][] x = null;

        do {
            System.out.println("1. Informar matriz");
            System.out.println("2. Imprimir a matriz");
            System.out.println("3. Maior do triângulo superior");
            System.out.println("4. Maior do triângulo inferior");
            System.out.println("5. Finalizar");
            System.out.print(">> ");
            opcao = sc.nextInt();
            if(opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida");
            }
            else {
                switch (opcao) {
                    case 1:
                        x = informarMatriz(sc);
                        break;
                    case 2:
                        imprimir(x);
                        break;
                    case 3:
                        trianguloSuperior(x);
                        break;
                    case 4:
                        trianguloInferior(x);
                }
            }
            System.out.println();
        } while(opcao != 5);
    }

    static void trianguloSuperior(int[][] x) {
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if(i < j) {
                    if(x[i][j] > maior) {
                        maior = x[i][j];
                    }
                }
            }
        }
        System.out.println("Maior valor do triângulo superior = " + maior);
    }

    static void trianguloInferior(int[][] x) {
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if(i > j) {
                    if(x[i][j] > maior) {
                        maior = x[i][j];
                    }
                }
            }
        }
        System.out.println("Maior valor do triângulo inferior = " + maior);
    }

    static void imprimir(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] informarMatriz(Scanner sc) {
        int n;
        System.out.print("Informe a ordem da matriz --> ");
        n = sc.nextInt();
        int[][] x = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor --> ");
                x[i][j] = sc.nextInt();
            }
        }
        return x;
    }
}

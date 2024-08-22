import java.util.Scanner;

public class Matriz {

    public static int[][] criarMatrizRecursiva(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        int valor = 1;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = valor++;
            }
        }
        return matriz;
    }

    //recursividade
    public static void mostrarMatrizRecursiva(int[][] matriz, int linha, int coluna) {
        if (linha >= matriz.length) { // condição base: se a linha for maior ou igual ao número de linhas, termina a recursão
            return;
        }
        if (coluna < matriz[linha].length) { // se a coluna for valida e exibe o elemento
            System.out.print(matriz[linha][coluna] + "  ");
            mostrarMatrizRecursiva(matriz, linha, coluna + 1); // recursividade para próxima coluna
        } else { // se chegar no final da linha, pula pra proxima linha
            System.out.println();
            mostrarMatrizRecursiva(matriz, linha + 1, 0); // recursividade pra próxima linha e primeira coluna
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = sc.nextInt();

        System.out.println("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = criarMatrizRecursiva(linhas, colunas);
        System.out.println("Matriz criada:");
        mostrarMatrizRecursiva(matriz, 0, 0);
    }
}

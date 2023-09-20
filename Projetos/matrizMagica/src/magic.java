import java.util.Scanner;

public class magic {
    static int matriz[][] = new int[3][3];
    static int magico[][] = new int[3][3];
    static int somas[][] = new int[4][2];
    static Scanner teclado = new Scanner(System.in);

    public static void inserirValores(){
        System.out.println("Inserção dos valores nos elementos");
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Linha " + linha + " | Coluna " + coluna);
                System.out.print("Insira o valor: ");
                matriz[linha][coluna] = teclado.nextInt();
            }
        }
    }

    public static void mostrarValores(){
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print("|" + matriz[linha][coluna] + "|");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int somaLinha(int linha){
        int soma = 0;
        for (int coluna = 0; coluna < matriz.length; coluna++){
            soma += matriz[linha][coluna];
        }
        return soma;
    }

    public static int somaColuna(int coluna){
        int soma = 0;
        for (int linha = 0; linha < matriz.length; linha++){
            soma += matriz[linha][coluna];
        }
        return soma;
    }

    public static int somaDiagonal(int diagonal){
        int soma = 0;
        if (diagonal == 1){
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][i];
            }
            return soma;
        }
        else {
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][matriz.length - 1 - i];
            }
            return soma;
        }
    }

    public static void magico() {
        boolean veredito = true;
        // Gerar matriz somas
        somas[0][0] = somaLinha(0);
        somas[0][1] = somaLinha(1);
        somas[1][0] = somaLinha(2);
        somas[1][1] = somaColuna(0);
        somas[2][0] = somaColuna(1);
        somas[2][1] = somaColuna(2);
        somas[3][0] = somaDiagonal(1);
        somas[3][1] = somaDiagonal(2);

        // Verificação
        for (int linha = 0; linha < somas.length; linha++){
            for (int coluna = 0; coluna < somas[linha].length;coluna++){
                if (somas[linha][coluna] != somas[0][0]){
                    veredito = false;
                    linha = somas.length;
                    break;
                }
            }
        }

        // Veredito
        if (veredito == true){
            System.out.println("É mágico");
        }
        else {
            System.out.println("Não é mágico");
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("-------------------");
            System.out.println("1 - Inserir valores");
            System.out.println("2 - Mostrar valores");
            System.out.println("3 - É mágico?");
            System.out.println("9 - Fim");
            System.out.println("Escolha sua opção:");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    inserirValores();
                    break;
                case 2:
                    mostrarValores();
                    break;
                case 3:
                    magico();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        }
    }
}
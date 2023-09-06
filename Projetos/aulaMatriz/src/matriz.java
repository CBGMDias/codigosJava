import java.util.Scanner;

public class matriz{
    static int matriz[][] = new int[4][4];
    static Scanner teclado = new Scanner(System.in);

    /* observe que no 'for', o .lenght muda para a coluna, já que a ordem da matriz é primeiro a linha e depois
    a coluna, para que seja possível trabalhar na coluna, usa-se a [linha] primeiro e depois o .lenght
     */
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
                System.out.print("Linha " + linha + " | Coluna " + coluna + " | Valor: ");
                System.out.println(matriz[linha][coluna]);
            }
        }
    }

    public static void mostrarSomaColuna(){
        int coluna = (matriz[0].length);
        int soma = 0;
        while (coluna < 0 || coluna > matriz[0].length - 1){
            System.out.println("Insira o índice da coluna para a soma (0 - " + (matriz[0].length - 1) + "):");
            coluna = teclado.nextInt();
        }
        for (int linha = 0; linha < matriz.length; linha++){
            soma += matriz[linha][coluna];
        }
        System.out.println("Soma da coluna " + coluna + ": " + soma);
    }

    public static void mostrarSomaLinha(){
        int linha = (matriz.length);
        int soma = 0;
        while (linha < 0 || linha > matriz.length - 1){
            System.out.println("Insira o índice da linha para a soma (0 - " + (matriz.length - 1) + "):");
            linha = teclado.nextInt();
        }
        for (int coluna = 0; coluna < matriz[0].length; coluna++){
            soma += matriz[linha][coluna];
        }
        System.out.println("Soma da linha " + linha + ": " + soma);
    }

    public static void mostrarSomaDiagonal(){
        int diagonal = 0;
        int soma = 0;
        while (diagonal != 1 && diagonal != 2){
            System.out.println("Qual diagonal deseja calcular?");
            System.out.println("1 - Primária");
            System.out.println("2 - Secundária");
            diagonal = teclado.nextInt();
            switch (diagonal){
                case 1:
                    for (int lc = 0; lc < matriz.length; lc++){
                        soma += matriz[lc][lc];
                    }
                    System.out.println("Soma da diagonal primária: " + soma);
                    break;
                case 2:
                    int coluna = (matriz[0].length - 1);
                    for (int linha = 0; linha < matriz.length;linha++){
                        soma += matriz[linha][coluna];
                        coluna--;
                    }
                    System.out.println("Soma da diagonal secundária: " + soma);
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        }
    }

    public static void mostrarSomaTotal(){
        int soma = 0;
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                soma += matriz[linha][coluna];
            }
        }
        System.out.println("Soma total: " + soma);
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("-------------------");
            System.out.println("1 - Inserir valores");
            System.out.println("2 - Mostrar valores");
            System.out.println("3 - Somar coluna");
            System.out.println("4 - Somar linha");
            System.out.println("5 - Somar diagonal");
            System.out.println("6 - Somar total");
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
                    mostrarSomaColuna();
                    break;
                case 4:
                    mostrarSomaLinha();
                    break;
                case 5:
                    mostrarSomaDiagonal();
                    break;
                case 6:
                    mostrarSomaTotal();
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

import java.util.Scanner;
//feito por Cristhian Braun

public class vetor {
    static int vetor[] = new int[5];
    static Scanner teclado = new Scanner(System.in);

    public static void inserirValores(){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Insira o valor do índice " + i + ":");
            vetor[i] = teclado.nextInt();
        }
    }

    public static void mostrarValores(){
        System.out.println("Valores do vetor:");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

    public static void buscarValor(){
        int i = vetor.length;
        while (i < 0 || i > vetor.length - 1) {
            System.out.println("Insira o índice para a busca (0 - " + (vetor.length - 1) + "):");
            i = teclado.nextInt();
        }
        System.out.println("Valor do índice " + i + ":");
        System.out.println(vetor[i]);
    }

    public static void removerValor(){
        int i = vetor.length;
        int opcao = 0;

        while (i < 0 || i > vetor.length - 1) {
            System.out.println("Insira o índice para a remoção (0 - " + (vetor.length - 1) + "):");
            i = teclado.nextInt();
        }
        vetor[i] = 0;
        System.out.println("Valor removido.");

        while (opcao != 1 && opcao != 2){
            System.out.println("Deseja acrescentar outro valor no lugar?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor para o índice " + i + ":");
                    vetor[i] = teclado.nextInt();
                    System.out.println("Valor alterado.");
                    break;
                case 2:
                    System.out.println("Valor removido.");
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("-------------------");
            System.out.println("1 - Inserir valores");
            System.out.println("2 - Mostrar valores");
            System.out.println("3 - Buscar um elemento pelo índice");
            System.out.println("4 - Remover um elemento pelo índice");
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
                    buscarValor();
                    break;
                case 4:
                    removerValor();
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

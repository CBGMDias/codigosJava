import java.util.Scanner;

public class GerarNovoVetor {
    /*
    Ler o array (vetor) 'A', e gerar o array 'B' com a regra:
    numero par, soma 10
    numero impar multiplica por 2
     */

    static Scanner teclado = new Scanner(System.in);

    static int A[] = {2, 3, 5, 4, 9, 10, 11, 7};
    static int B[] = new int[8];
    static int C[] = new int[8];
    static int D[] = new int[16];

    public static void gerarVetorB(){
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 == 0) {
                System.out.println(A[i] + " é par");
                B[i] = A[i] + 10;
            }
            else {
                System.out.println(A[i] + " é ímpar");
                B[i] = A[i] * 2;
            }
        }
    }

    public static void gerarVetorC(){
        for (int i = 0; i < A.length; i++){
            C[i] = A[i] - B[i];
        }
        System.out.print("Vetor C gerado");
    }

    public static void gerarVetorD(){
        int x = 0;
        for (int i = 0; i < A.length; i++){
            D[x] = A[i];
            x += 2;
        }

        x = 1;

        for (int i = 0; i < B.length; i++){
            D[x] = B[i];
            x += 2;
        }
        System.out.print("Vetor D gerado");
    }

    public static void mostraB(){
        System.out.println("Os valores de B são:");
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
    }

    public static void mostraC(){
        System.out.println("Os valores de C são:");
        for (int i = 0; i < C.length; i++){
            System.out.print(C[i] + " ");
        }
    }

    public static void mostraD(){
        System.out.println("Os valores de D são:");
        for (int i = 0; i < D.length; i++){
            System.out.print(D[i] + " ");
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println(" ");
            System.out.println("-------------------");
            System.out.println("1 - Gerar B");
            System.out.println("2 - Mostrar B");
            System.out.println("3 - Gerar C");
            System.out.println("4 - Mostrar C");
            System.out.println("5 - Gerar D");
            System.out.println("6 - Mostrar D");
            System.out.println("9 - Fim");
            System.out.println("Escolha sua opção");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    gerarVetorB();
                    break;
                case 2:
                    mostraB();
                    break;
                case 3:
                    gerarVetorC();
                    break;
                case 4:
                    mostraC();
                    break;
                case 5:
                    gerarVetorD();
                    break;
                case 6:
                    mostraD();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção incorreta");
            }
        }
    }
}
import java.util.Scanner;

public class satisfacao {

    static Scanner teclado = new Scanner(System.in);

    static int votos[] = new int[20];
    static int numeroVotos[] = new int[5];

    public static void inserirVotos() {
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Insira seu nível de satisfação da comida:");
            System.out.println("1 - Péssimo");
            System.out.println("2 - Ruim");
            System.out.println("3 - Mediano");
            System.out.println("4 - Bom");
            System.out.println("5 - Excelente");
            System.out.print("Voto número " + (i + 1) + ": ");

            votos[i] = teclado.nextInt();

            if (votos[i] > 5 || votos[i] < 1){
                i -= 1;
                System.out.println("\nOPÇÃO INCORRETA, INSIRA NOVAMENTE!");
            }
        }
    }

    public static void mostrarVotos(){
        for (int i = 0; i < votos.length; i++){
            if (votos[i] == 1){
                numeroVotos[0] += 1;
            }
            else if (votos[i] == 2){
                numeroVotos[1] += 1;
            }
            else if (votos[i] == 3){
                numeroVotos[2] += 1;
            }
            else if (votos[i] == 4){
                numeroVotos[3] += 1;
            }
            else if (votos[i] == 5){
                numeroVotos[4] += 1;
            }
            else{
                System.out.println("NÃO HÁ VOTOS REGISTRADOS");
                i = votos.length;
            }
        }

        System.out.println("1 - Votos péssimos: " + numeroVotos[0] + " votos");
        System.out.println("2 - Votos ruins: " + numeroVotos[1] + " votos");
        System.out.println("3 - Votos medianos: " + numeroVotos[2] + " votos");
        System.out.println("4 - Votos bons: " + numeroVotos[3] + " votos");
        System.out.println("5 - Votos excelentes: " + numeroVotos[4] + " votos");
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("-------------------");
            System.out.println("1 - Inserir votos");
            System.out.println("2 - Mostrar votos");
            System.out.println("9 - Fim");
            System.out.println("Escolha sua opção.");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    inserirVotos();
                    break;
                case 2:
                    mostrarVotos();
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
import java.util.Arrays;
import java.util.Scanner;

public class artilheiros {
    static Scanner teclado = new Scanner(System.in);
    static String gol[] = new String[50];
    static int art[]  = new int[50];

    public static void registrarGol(){
        for (int i = 0; i < gol.length; i++){
            if (gol[i] == null){
                System.out.println("Nome do jogador que fez o gol:");
                gol[i] = teclado.nextLine();
                break;
            }
        }
    }

    public static void mostrarArtilheiros(){
        for (int i = 0; i < gol.length; i++){
            for (int x = 0; x < gol.length; x++){
                if (gol[i].equals(gol[x])){
                    art[i] += 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("");
            System.out.println("1 - Registrar gol");
            System.out.println("2 - Mostar artilheiro(s)");
            System.out.println("9 - Fim");
            System.out.println("Digite sua opção:");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
                case 1:
                    registrarGol();
                    break;
                case 2:
                    mostrarArtilheiros();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
            }
        }
    }

}

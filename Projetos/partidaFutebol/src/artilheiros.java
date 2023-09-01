import java.util.Scanner;

public class artilheiros {
    static Scanner teclado = new Scanner(System.in);
    static String gol[] = new String[50];
    static String art[]  = new String[50];
    static int indice = 0;

    // Registra os gols
    public static void registrarGol(){
        for (int i = 0; i < gol.length; i++){
            if (gol[i] == null){
                System.out.println("Nome do jogador que fez o gol:");
                gol[i] = teclado.nextLine();
                break;
            }
        }
    }

    public static void mostrarArtilheiros() {
        int maxGols = 0;

        // Encontra o número máximo de gols
        for (int i = 0; i < gol.length; i++) {
            if (gol[i] != null) {
                int contador = 0;
                for (int j = 0; j < gol.length; j++) {
                    if (gol[i].equals(gol[j])) {
                        contador++;
                    }
                }
                if (contador > maxGols) {
                    maxGols = contador;
                }
            }
        }

        // Exibe os artilheiros com o número máximo de gols
        System.out.println("Artilheiros:");
        for (int i = 0; i < gol.length; i++) {
            if (gol[i] != null) {
                int contador = 0;
                for (int j = 0; j < gol.length; j++) {
                    if (gol[i].equals(gol[j])) {
                        contador++;
                    }
                }
                if (contador == maxGols) {
                    boolean artilheiroJaExiste = false;
                    for (int k = 0; k < art.length; k++) {
                        if (art[k] != null && art[k].equals(gol[i])) {
                            artilheiroJaExiste = true;
                            break;
                        }
                    }
                    if (!artilheiroJaExiste) {
                        art[indice] = gol[i];
                        indice++;
                    }
                }
            }
        }

        // Exibe os artilheiros encontrados
        for (int i = 0; i < indice; i++) {
            System.out.println(art[i]);
        }
    }

    public static void main(String[] args) {
        // Menu
        int opcao = 0;
        while (opcao != 9){
            System.out.println("--------------------");
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
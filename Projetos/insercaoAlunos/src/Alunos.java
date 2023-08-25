import java.util.Scanner;

//Inserção de alunos em duas UCs com menu para mostrar separadamente e em ambas.

public class Alunos {
    static String ucSub[] = new String[10];
    static String ucGp[] = new String[8];
    static Scanner teclado = new Scanner(System.in);

    public static void inserirAlunos(String uc[]){
        for (int x = 0; x < uc.length; x++){
            System.out.println("Nome:");
            uc[x] = teclado.nextLine();
        }
    }

    public static void mostrarAlunos(String uc[]){
        System.out.println("Alunos:");
        for (int x = 0; x < uc.length; x++){
            System.out.println(uc[x]);
        }
    }

    public static void mostrarAmbasUc(){
        for (int j = 0; j < ucSub.length; j++){
            for (int x = 0; x < ucGp.length; x++){
                if (ucSub[j].equals(ucGp[x])){
                    System.out.println(ucSub[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int opcao = 0, resposta;
        while(opcao != 9){
            System.out.println("1 - Inserir alunos na UC");
            System.out.println("2 - Mostrar alunos na UC");
            System.out.println("3 - Mostar alunos em ambas");
            System.out.println("9 - Fim");
            System.out.println("Digite sua opção");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("1 - Sub Rotina");
                    System.out.println("2 - Gerência de Projetos");
                    resposta = teclado.nextInt();
                    if (resposta == 1){
                        inserirAlunos(ucSub);
                    }
                    else{
                        inserirAlunos(ucGp);
                    }
                    break;
                case 2:
                    System.out.println("1 - Sub Rotina");
                    System.out.println("2 - Gerência de Projetos");
                    resposta = teclado.nextInt();
                    if (resposta == 1){
                        mostrarAlunos(ucSub);
                    }
                    else{
                        mostrarAlunos(ucGp);
                    }
                    break;
                case 3:
                    mostrarAmbasUc();
                    break;
            }
        }
    }
}
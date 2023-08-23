import java.util.Scanner;

public class Tempos {
    //definição do vetor (array)
    static double[] temp = new double[10];
    static Scanner teclado = new Scanner(System.in);

    //sub-rotina para inserção no vetor
    //void - sem retorno, apenas a execução
    public static void inserir() {
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Informe o elemento " + (i + 1));
            temp[i] = teclado.nextDouble();
        }
    }

    public static double soma() {
        double soma = 0; //essa variável é visível apenas na sub-rotina soma
        for (int i = 0; i < temp.length; i++) {
            soma += temp[i];
            //+= é a msm coisa que soma = soma + temp[i]
        }
        return soma;
    }

    //sub-rotina para mostrar os valores
    public static void mostrar(){
        for (int i=0; i<temp.length; i++){
            System.out.println("Elemento " + (i + 1) + " Indice " + i + " Valor " + temp[i]);
        }
    }

    //sub-rotina para retornar a média
    public static double media(){
        return soma() / temp.length;
    }

    public static double maior(){
        double maior = 0;
        for (int i=0; i<temp.length; i++){
            if (temp[i] > maior){
                maior = temp[i];
            }
        }
        return maior;
    }

    public static double menor(){
        double menor = temp[0];
        for (int i=0; i<temp.length; i++){
            if (temp[i] < menor){
                menor = temp[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("1 - Inserir");
            System.out.println("2 - Mostra soma");
            System.out.println("3 - Mostrar valores");
            System.out.println("4 - Media");
            System.out.println("5 - Maior valor");
            System.out.println("6 - Menor Valor");
            System.out.println("9 - Fim");
            opcao = teclado.nextInt();
            switch (opcao) { //escolha
                case 1:
                    inserir();
                    break;
                case 2:
                    System.out.println("A soma é " + soma());
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    System.out.println("A media é " + media());
                    break;
                case 5:
                    System.out.println("O maior número é " + maior());
                    break;
                case 6:
                    System.out.println("O menor número é " + menor());
                    break;
                case 9:
                    System.out.println("Finalizado com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}

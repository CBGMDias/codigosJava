import java.util.Scanner;

public class somas {

    /*
    Faça uma sub-rotina "somaEntre" que receba como parâmetro dois números
    inteiros e retornar a soma dos números inteiros existentes entre eles.
    */

    static Scanner teclado = new Scanner(System.in);

    public static int somaEntre(int inicio, int fim){
        int soma = 0;
        System.out.print("Soma: " + inicio);
        soma += inicio;
        for (int i = inicio + 1; i <= fim; i++){
            System.out.print(" + " + i);
            soma += i;
        }
        System.out.print(" = ");
        return soma;
    }

    public static int fatorial(int numero){
        int fat = 1;
        System.out.print("Fatorial: 1");
        for (int i = 2; i <= numero; i++){
            System.out.print(" * " + i);
            fat *= i;
        }
        System.out.print(" = ");
        return fat;
    }

    public static void main(String[] args) {
        System.out.println(somaEntre(1,10));
        System.out.println(fatorial(5));
    }
}
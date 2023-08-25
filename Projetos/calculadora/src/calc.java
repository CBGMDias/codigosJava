import java.util.Scanner;

public class calc {
    static Scanner teclado = new Scanner(System.in);

    public static double calculo(double n1, double n2, char op){
        if (op == '+'){
            return n1 + n2;
        }
        else if (op == '-'){
            return n1 - n2;
        }
        else if (op == '/'){
            return n1 / n2;
        }
        else if (op == '*'){
            return n1 * n2;
        }
        else{
            System.out.println("Símbolo inválido.");
            return 0;
        }
    }

    public static void main(String[] args) {
        double num1, num2;
        char ope;

        System.out.print("Digite o primeiro número: ");
        num1 = teclado.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextDouble();

        teclado.nextLine();
        System.out.println("\nAdição +");
        System.out.println("Subtração -");
        System.out.println("Divisão /");
        System.out.println("Multiplicação *");
        System.out.print("Digite o símbolo da operação correspondente: ");
        ope = teclado.nextLine().charAt(0);

        System.out.print("Resultado: ");
        System.out.println(calculo(num1,num2,ope));
    }
}
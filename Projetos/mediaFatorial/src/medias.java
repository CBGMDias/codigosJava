public class medias {
    /*
    Faça uma subrotina "media" que tenha como parâmetros três notas e uma letra.
    Se o valor da letra é A, retorne a média aritmética.
    Se o valor da letra é P, retorne a média ponderada com pesos, 1, 3 e 6
     */

    public static double soma(double n1, double n2, double n3, char letra) {

        double media = 0;
        if (letra == 'A') {
            media = (n1 + n2 + n3) / 3;
        } else if (letra == 'P') {
            media = (n1 + n2 * 3 + n3 * 6) / 10;
        } else {
            System.out.println("Letra inválida");
        }
        return media;
    }

    public static void main(String[] args) {
        System.out.println(soma(0,5,10,'P'));
    }
}
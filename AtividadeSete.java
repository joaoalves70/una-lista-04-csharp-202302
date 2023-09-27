import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int n1, n2, menorNumero, maiorNumero;
        Scanner ler = new Scanner(System.in);
        int numero, pares = 0, impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}

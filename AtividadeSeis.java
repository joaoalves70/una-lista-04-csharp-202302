import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int n1, n2, menorNumero, maiorNumero;
        Scanner ler = new Scanner(System.in);
        System.out.print("Por favor, digite o primeiro número inteiro: ");
        n1 = ler.nextInt();

        System.out.print("Certo, agora digite o segundo número inteiro: ");
        n2 = ler.nextInt();
        
        System.out.println("Os números no intervalo entre " + n1 + " e " + n2 + " são:");
        
        menorNumero = Math.min(n1, n2);
        maiorNumero = Math.max(n1, n2);

        
        for (int i = menorNumero; i <= maiorNumero; i++) {
            System.out.println(i);
        }
    }
}

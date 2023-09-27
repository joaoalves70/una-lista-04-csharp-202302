import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int totalNumeros = 5;
        int soma = 0;
        int numero;
        double media;
        
        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero = ler.nextInt();
            soma += numero;
        }
        
        media = (double) soma / totalNumeros;
    
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
	}
}

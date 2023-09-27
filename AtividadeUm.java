// Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
// caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	  int x;
		System.out.println("Por favor, informe um número de 0 a 10: ");
		x = ler.nextInt();
		
		while (x > 10) {
		    System.out.println("Número inválido gentileza informar outro valor: ");
		    x = ler.nextInt();
		}
		
		System.out.println("Programa finalizado!");
	}
}

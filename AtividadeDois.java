//  Faça um programa que leia um nome de usuário e a sua senha e não aceite a
//  senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
//  pedir as informações.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    String senha, user;
	    
	    System.out.println("Gentileza informar seu nome de usuário: ");
	    user = ler.next();
	    
	    System.out.println("Certo, agora defina a sua senha, lembre-se de que a senha não pode ser igual ao nome de usuário.");
	    senha = ler.next();
	    
	    while (senha.equals(user)) {
	        System.out.println("ERRO: Senha e User não podem ser iguais");
	        System.out.println("Gentileza informar uma nova senha: ");
	        senha = ler.next();
	    }
	    
	    System.out.println("Seu usúario e senha foram cadastrados!");
	}
}

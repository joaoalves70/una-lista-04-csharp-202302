// Faça um programa que leia e valide as seguintes informações:
// Nome: maior que 3 caracteres;
// Idade: entre 0 e 150;
// Salário: maior que zero;
// Sexo: 'f' ou 'm';
// Estado Civil: 's', 'c', 'v', 'd'; 


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    String nome;
	    char civil, sexo;
	    int idade;
	    double salario;
	    
	    do {
    		System.out.println("Por favor me informe seu nome (o nome precisa ter mais que 3 caracteres): ");
    		nome = ler.next();
    	} while (nome.length() <=3);
		
		do {
    		System.out.println("Certo agora me informe sua idade: ");
    		idade = ler.nextInt();
    	} while (idade <=0 || idade >150);
		
		do { 
		    System.out.print("Ok, agora me informe seu salário: R$ ");
		    salario = ler.nextDouble();
		} while (salario <= 0);
		
		do {
		    System.out.println("Me informe seu estado civil, utilize S para solteiro, C para Casado, D para divorciado e V para viúvo: ");
		    civil = ler.next().charAt(0);
		} while (civil != 'S' && civil != 'C' && civil != 'D' && civil != 'V');
		
		do {
		    System.out.println("Certo, agora me informe seu sexo, use M para masculino e F para Feminino");
		    sexo =ler.next().charAt(0);
		} while (sexo != 'M' && sexo != 'F');
		
		System.out.println("Todos os dados estão válidos, segue:");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Sálario: R$ "+salario);
		System.out.println("Estado Civil: "+civil);
		System.out.println("Sexo: "+sexo);
	}
}

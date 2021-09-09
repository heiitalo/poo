package br.com.orientacaoobjeto;

import java.util.Scanner;

public class ProgramaCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("prezado cliente, por favor digite o seu nome: ");
		cliente1.setNome(entrada.next());
	    
	    System.out.println("Digite o seu CPF: ");
	    cliente1.setCpf(entrada.next());
	    
	    System.out.println("Por favor digite o seu endereço: ");
	    cliente1.setEndereco(entrada.next());
	    
	    System.out.println("Por ultimo, informe a sua idade: ");
	    cliente1.setIdade(entrada.nextInt());
	    
	    System.out.println("=====================================================================");
	    
	    System.out.println("Prezado " + cliente1.getNome() + " seu cadastro foi efetuado com sucesso");
	    System.out.println("CPF: " + cliente1.getCpf());
	    System.out.println("Endereço: " + cliente1.getEndereco());
	    System.out.println("Idade: " + cliente1.getIdade());
	    
	    System.out.println();
		
		
		
		
		
		

	}

}

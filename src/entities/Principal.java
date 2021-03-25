package entities;
import java.util.ArrayList;
import entities.Cliente;
import java.util.Iterator;
import java.util.Scanner;
import services.ListarClientes;

import entities.enums.Status;

public class Principal {
	
	public static void menuPrincipal(ArrayList<Cliente> clientes) {
	
	
		
	boolean sair;
			
	Cliente cliente = new Cliente();
	ListarClientes lista = new ListarClientes();
	
	System.out.print("Sistema de Gestão de Academias" + "\n" + "------------------" + "\n");
	
	int opcao = 0;
	
	while (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 4 ) {
		
		Scanner option = new Scanner(System.in);
		Scanner option2 = new Scanner(System.in);
	
		System.out.println("####### MENU PRINCIPAL ######");
		System.out.println("\n ESCOLHA A OPÇÃO DESEJADA:");
		System.out.println("1 - CADASTRO");
		System.out.println("2 - LISTAR CLIENTES");
		System.out.println("3 - CONTAR CLIENTES ATIVOS/INATIVOS");
		System.out.println("4 - SAIR");
		
		//DEBUG
		//System.out.print("\n OPÇÃO ESCOLHIDA: " + opcao + "\n Verdadeiro: " + (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) + "\n");
				
		System.out.print("-->");
					
		
		
		
		while(! option.hasNext()) {System.out.print("! \n");}
		opcao = Integer.parseInt(option.next());
		option.reset();
		
		if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
			System.out.print("INSIRA UMA OPÇÃO VÁLIDA! \n");
			
		} else {
			switch (opcao) {
			
			//CADASTRO DE CLIENTES
			case 1:
				cliente.cadastrarCliente(clientes);
				
				break;
				//LISTAGEM DE CLIENTES
			case 2:
				lista.listar(clientes);
				
				break;
				//CONTAGEM DE ATIVOS E INATIVOS
			case 3:
				int countAtivo = 0;
				int countInativo = 0;
				Iterator<Cliente> iterator = clientes.iterator();
				while (iterator.hasNext()) {
					Cliente proxCliente = iterator.next();
					if (proxCliente.getStatus().equals(Status.ATIVO)) {
						countAtivo ++;
					} else if (proxCliente.getStatus().equals(Status.INATIVO)) {
						countInativo ++;
						
					}
					
				}
				System.out.println("########## ATIVOS/INATIVOS ##########" + countAtivo);
				System.out.println("CLIENTES ATIVOS: " + countAtivo);
				System.out.println("CLIENTES INATIVOS: " + countInativo);
				System.out.println(" --------------------------------");
				
				
				break;
				
			case 4:
				
								
				String opcaoSair = "";
				
				while (opcaoSair != "S" && opcaoSair != "N") {
				
					System.out.println("DESEJA SAIR? (S/N)");
					
					opcaoSair = option2.next().toUpperCase();
					
					
					if ((opcaoSair).equals("S")) {
						
						sair = true;
						System.out.println("SAINDO!");	
						System.exit(0);;
						
					} else if((opcaoSair).equals("N")) {
						
						break;
					
					} else {
						
						System.out.println("INSIRA UMA OPÇÃO VÁLIDA!");						
					
					}
								
				}
				break;
							
			}
			
		}
		
		opcao = 0;
	}
	
		
	}
	
}

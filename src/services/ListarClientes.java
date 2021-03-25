package services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import entities.Cliente;
import entities.enums.Status;

public class ListarClientes {
	
	public void listar(ArrayList<Cliente> clientes) {
		
		//DEBUG
		//System.out.print(clientes);
		
		Iterator<Cliente> iterator = clientes.iterator();
		while (iterator.hasNext()) {
			Cliente proxCliente = iterator.next();
			
			System.out.println("\n ###### CLIENTE  ######");
			System.out.println("NOME: " + proxCliente.getNome());
			System.out.println("CPF: " + proxCliente.getCpf());
			System.out.println("IDADE: " + proxCliente.getIdade());
			System.out.println("PESO: " + proxCliente.getPeso());
			System.out.println("ALTURA: " + proxCliente.getAltura());
			System.out.println("STATUS: " + proxCliente.getStatus());
			System.out.println("PACOTE: " + proxCliente.getPacote());
			System.out.println("------------------------------------------------ \n");
			
		}
		
	}

}

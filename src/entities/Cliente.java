package entities;
import java.util.ArrayList;
/**
 * 
 */
import java.util.Scanner;

import entities.enums.Status;
/**
 * @author bruno
 *
 */
public class Cliente {

	/**
	 * @param args
	 */
	
	private String nome;
	private String cpf;
	private Integer idade;
	private Double peso;
	private Double altura;
	private String pacote;
	private Status status;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, Integer idade, Double peso, Double altura, Status status, String pacote) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.pacote = pacote;
		this.status = status;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	
	
	public void cadastrarCliente(ArrayList<Cliente> clientes) {
		
		Scanner scanner = new Scanner(System.in);
		
		Pacotes pacote =  new Pacotes();
		String planoLight = pacote.getLight();
		String planoFull = pacote.getFull();
		String planoTop = pacote.getTop();
		
		System.out.println("###### CADASTRO ######");
		System.out.println("");
		System.out.print("NOME: ");
		this.nome = scanner.nextLine();
		System.out.print("CPF: ");
		this.cpf = scanner.next();
		System.out.print("IDADE: ");
		this.idade = Integer.parseInt(scanner.next());
		System.out.print("PESO: ");
		this.peso = Double.parseDouble(scanner.next());
		System.out.print("ALTURA: ");
		this.altura = Double.parseDouble(scanner.next());
		
		int statusNum = 0;
		
		/*Validação de opção*/
		
		while (statusNum != 1 && statusNum != 2) {
			System.out.println("DIGITE O STATUS DO ALUNO: (1 - ATIVO/2 - INATIVO)");
			System.out.print("-->");
			statusNum = scanner.nextInt();
				if (statusNum != 1 && statusNum != 2){
					System.out.print("ESCOLHA UMA OPÇÃO VÁLIDA!");
				} else {
					break;
				}
		}
		
		
		if (statusNum == 1) {
			this.status = Status.valueOf("ATIVO");
		} else {
			this.status = Status.valueOf("INATIVO");
		}
		 
		/*Validação de Plano*/
		int planNum = 0;
		
		while (planNum != 1 && planNum != 2 && planNum != 3) {
			System.out.println("ESCOLHA O PLANO: ");
			System.out.println("");
			System.out.println("1 - LIGHT");
			System.out.println("2 - FULL");
			System.out.println("3 - TOP");
			System.out.print("--> ");
			planNum = scanner.nextInt();
				if (planNum != 1 && planNum != 2 && planNum != 3){
					System.out.println("ESCOLHA UMA OPÇÃO VÁLIDA!");
					
				} else {
					break;
				}
		}
		
		switch (planNum) {
		case 1 : 
			this.pacote = planoLight;
			break;
		case 2 : 
			this.pacote = planoFull;
			break;
		case 3 : 
			this.pacote = planoTop;
			break;
				
		}
		
		
		Cliente cliente = new Cliente(this.nome, this.cpf, this.idade, this.peso, this.altura, this.status, this.pacote);
		
		/*ADICIONAR CLIENTE À LISTA PRINCIPAL*/
		
		System.out.print("ADICIONANDO À LISTA...");
		clientes.add(cliente);
		
		System.out.println("");
		System.out.println("CLIENTE CADASTRADO!");
		System.out.println();
		System.out.println(cliente.toString() + "\n ---------------------------------------");
						
		scanner.reset();

	}
	
	
	
	@Override
	public String toString() {
		return "NOME: " + nome + "\n" + "CPF: " + cpf + "\n" + "IDADE: " + idade + "\n" + "PESO: " + peso + "\n" + "ALTURA: " + altura
				+  "\n" +"PACOTE: " + pacote + "\n" + "STATUS: " + status + "\n";
	}

	

}

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
	List<Cliente> clientes = new ArrayList<>();
	List<Produto> produtos = new ArrayList<>();
	
	private void exibirMenu(){
		System.out.println("\n\n");
		System.out.println("+-------------------------------------------+");
		System.out.println("|        Menu de Opções                     |");
		System.out.println("+-------------------------------------------+");
		System.out.println("| 01 - Cadastrar Cliente                    |");
		System.out.println("| 02 - Cadastrar Produto                    |");
		System.out.println("| 03 - Imprimir relatório de clientes       |");
		System.out.println("| 04 - Imprimir relatório de produtos       |");
		System.out.println("| 50 - Exibir o menu de opções              |");
		System.out.println("| 99 - Sair                                 |");
		System.out.println("+-------------------------------------------+");
	}
	
	private void cadastrarCliente(){
		Scanner leitor = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.print("ID do cliente: ");
		cliente.setIdCliente(leitor.nextInt());
		
		System.out.print("Nome do cliente: ");
		leitor.nextLine();// limpa o scanner
		cliente.setNomeCliente(leitor.nextLine());
		
		clientes.add(cliente);
		
		//leitor.close();
	}
	
	private void imprimirCliente(){
		for(Cliente cliente : clientes){
			System.out.println("\nId: " + cliente.getIdCliente());
			System.out.println("Nome: " + cliente.getNomeCliente());
			System.out.println("\n\n");
		}
	}
	
	public static void main(String[] args){
		short opcao = 50;
		Scanner leitor = new Scanner(System.in);
		Menu teste = new Menu();

		do{
			teste.exibirMenu();
		
			System.out.print("Opção escolhida: ");
			opcao = leitor.nextShort();
			
			switch(opcao){
				case 1:
					teste.cadastrarCliente();
					break;
				case 3:
					teste.imprimirCliente();
					break;
				case 50:
					teste.exibirMenu();
					break;
				default:
					teste.exibirMenu();
			}
		}while(opcao != 99);
	}
}
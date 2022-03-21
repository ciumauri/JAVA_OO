import java.io.*;

public class SistemaAeroporto{
	private Companhia c1;
	private BufferedReader reader;
	
	public static void main(String[] args) throws Exception{
		SistemaAeroporto sa = new SistemaAeroporto();
		sa.c1 = new Companhia();
		sa.reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Informe o nome da companhia:");
		sa.c1.setNomeCompanhia(sa.reader.readLine());
		System.out.println("Voo:");
		sa.c1.setNumeroVoo(sa.reader.readLine());
		sa.menu();
	}
	
	public void menu() throws Exception{
		String opcao = "";
		while(!opcao.equals("5")){
			System.out.println("\n-------------------------");
			System.out.println("[1] Cadastrar novo Vôo");
			System.out.println("[2] Listar Vôos");
			System.out.println("[3] Listar Passageiros");
			System.out.println("[4] Listar Assentos Vagos");
			System.out.println("[5] Sair");
			opcao = this.reader.readLine();
			
			if(opcao.equals("1")){
				this.cadastrarVoo();
			}else if(opcao.equals("2")){
				this.listarVoos();
			}else if(opcao.equals("3")){
				this.listarPassageiros();
			}else if(opcao.equals("4")){
				this.consultarVoo();
			}else if(opcao.equals("5")){
				System.out.println("Encerrando...");
			}else {
				System.out.println("Opcao invalida...");
			}
		}
	}
	
	public void cadastrarVoo(){
		try{
			Voo voo = new Voo();
			System.out.println("Código do voo:");
			String numVoo = this.reader.readLine();
			voo.setCodigoVoo(Integer.parseInt(numVoo));
			
			System.out.println("Quantidade de Assentos:");
			String assentos = this.reader.readLine();
			voo.setAssentoVoo(Integer.parseInt(assentos));			
			
			System.out.println("\n---------Passageiros--------");
			for(int i=0; i<186; i++){
				System.out.println("\n-----------------");
				System.out.println("Informe o nome do passageiro:");
				String nomePassageiro = this.reader.readLine();
				if(nomePassageiro.equals("")){
					break;
				}
				Passageiro passageiro = new Passageiro();
				passageiro.setNomePassageiro(nomePassageiro);
				
				System.out.println("Código do Passageiro:");
				String codPassageiro = this.reader.readLine();
				passageiro.setcodPassageiro(Integer.parseInt(codPassageiro));
				
				voo.setPassageiro(i, passageiro);
			}
			this.c1.setVoos(voo);
		}catch(Exception c1){
			System.out.println("formato invalido...");
		}
	}
	
	 public void listarVoos() throws Exception{}
	// 	System.out.println("------------------------");
	// 	System.out.println("Relatorio de Passa");
	// 	for(int i = 0; i < this.c1.getQtdeTurmas(); i++){
	// 		String linha = "Numero: " + this.c1.getTurma(i).getNumeroTurma();
			
	// 		System.out.print(linha);
			
	// 		linha = " - Curso: " + this.c1.getTurma(i).getNomeCurso();
	// 		System.out.print(linha);
			
	// 		linha = " - Ano: " + this.c1.getTurma(i).getAno();
	// 		System.out.print(linha + "\n");
	// 	}
	// }

	public void listarPassageiros() throws Exception{}
	
	 public void consultarVoo(){}
	// 	try{
	// 		System.out.println("------------------------");
	// 		System.out.println("Consulta de Turma");
	// 		System.out.println("Informe o numero da Turma: ");
	// 		int numTurma = Integer.parseInt(this.reader.readLine());
	// 		boolean achou = false;
			
	// 		for(int i = 0; i < this.c1.getQtdeTurmas(); i++){
	// 			Turma t = this.c1.getTurma(i);
	// 			if(t.getNumeroTurma() == numTurma){
	// 				System.out.println("Alunos da Turma:");
	// 				int pos = 0;
	// 				while(t.getAluno(pos) != null){
	// 					String linha = "Nome: " + t.getAluno(pos).getNome();
	// 					System.out.print(linha);
						
	// 					linha = " - Media: " + t.getAluno(pos).calcularMedia();
	// 					System.out.println(linha);
	// 					pos++;
	// 				}
	// 				achou = true;
	// 				break;
	// 			}
	// 		}
	// 		if(!achou){
	// 			System.out.println("Turma nao encontrada");
	// 		}
	// 	}catch(Exception c1){
	// 		System.out.println("formato invalido...");
	// 	}
	// }
	
	
}





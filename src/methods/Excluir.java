package methods;

import java.util.ArrayList;

import interfaces.LeituraTeclado;
import interfaces.Menu;
import locals.Escrever;
import locals.Ler;
import objects.Cliente;
import objects.Servico;

public class Excluir {
	//Vari�veis para leitura do arquivo de cadastros
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Servico> servicos = new ArrayList<Servico>();
	
	public static boolean cliente(String alvo) throws Exception{
		
		//Lendo o arquivo de cadastros
		clientes = Ler.clientes();
		
		
		//Percorre a lista contendo os cadastros de clientes
		for(Cliente c : clientes) {
			
			String nomec = c.getNome().toLowerCase().trim();
			String nomealvo = alvo.toLowerCase().trim();
			
			if (nomec.equals(nomealvo)) {
				
				System.out.println("\n*********************");
				System.out.println("CADASTRO SELECIONADO");
				System.out.println("*********************");
				System.out.println("Nome: "+c.getNome());
				System.out.println("Telefone: "+c.getTelefone());
				System.out.println("Data de nascimento: "+c.getNascimento());
				System.out.println("G�nero: "+c.getGenero());
				System.out.println("*********************");
				System.out.println("Deseja excluir o cadastro selecionado? 1-SIM 2-N�O");
				
				int escolha = 0;
				LeituraTeclado leitura = new LeituraTeclado();
				escolha = leitura.numero();
				
				if (escolha == 1) {
					clientes.remove(c);
					
					//Salva o clientes.ser
					Escrever.clientes(clientes);
					
					System.out.println("Cadastro exclu�do com sucesso!");
					System.out.println("Redirecionando para o Menu principal");
					System.out.println(".");
					System.out.println(".");
					System.out.println(".");
					
					return true;
				
				}
				else {
					Menu.mostrarMenu();
				}
				return true;
			}
			else {
				System.out.println("Cadastro n�o encontrado");
				System.out.println("Redirecionando para o Menu principal");
				System.out.println(".");
				System.out.println(".");
				System.out.println(".");
				return false;
			}
		}
		return false;
	}
	
	public static boolean servico(String alvo) throws Exception{
		
		//L� o arquivo de servicos
		servicos = Ler.servicos();
		
		
		//Percorre a lista contendo os cadastros de servicos
		for(Servico s : servicos) {
			if (s.getNome().toUpperCase() == alvo.toUpperCase()) {
				/*Se o nome do objeto sendo percorrido � igual ao 
				nome do objeto alvo, remove o objeto da lista*/
				servicos.remove(s);
				
				//Salva o servicos.ser
				Escrever.servicos(servicos);
				
				return true;
			}
		}
		return false;
	}
		
}


package objects;

import interfaces.Crud;


public class Cliente implements Crud{
	private String nome;
	private String telefone;
	private DataNasc nascimento;
	private int genero;
	
	public Cliente(String nome, String telefone, DataNasc nascimento, int genero) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public DataNasc getNascimento() {
		return nascimento;
	}
	public void setNascimento(DataNasc nascimento) {
		this.nascimento = nascimento;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}

	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}
	
	
}

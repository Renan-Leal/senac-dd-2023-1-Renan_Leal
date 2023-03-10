package model.vo.telefonia;

import java.util.List;

public class Cliente {
	
	private Integer idCliente;
	private String nome;
	private String cpf;
	private List<Telefone> telefones;
	private boolean statusAtivacao;
	private Endereco endereco;
	


	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Cliente(Integer idCliente, String nome, String cpf, List<Telefone> telefones, boolean statusAtivacao, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.telefones = telefones;
		this.statusAtivacao = statusAtivacao;
		this.endereco = endereco;
	}

	

	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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


	public List<Telefone> getTelefones() {
		return telefones;
	}


	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}


	public boolean isStatusAtivacao() {
		return statusAtivacao;
	}


	public void setStatusAtivacao(boolean statusAtivacao) {
		this.statusAtivacao = statusAtivacao;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", telefones=" + telefones + ", statusAtivacao="
				+ statusAtivacao + ", endereco=" + endereco + "]";
	}
	
	
	
	

}

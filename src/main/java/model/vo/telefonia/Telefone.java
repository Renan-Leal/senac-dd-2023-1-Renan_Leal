package model.vo.telefonia;

public class Telefone {
	
	private Integer idTelefone;
	private Integer idCliente;
	private String ddd;
	private String numero;
	private boolean statusAtivacao;
	private boolean movel;
	
	
	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Telefone(Integer idCliente, String ddd, String numero, boolean statusAtivacao, boolean movel) {
		super();
		this.idCliente = idCliente;
		this.ddd = ddd;
		this.numero = numero;
		this.statusAtivacao = statusAtivacao;
		this.movel = movel;
	}
	
	

	public Integer getIdTelefone() {
		return idTelefone;
	}


	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	
	


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public boolean isStatusAtivacao() {
		return statusAtivacao;
	}


	public void setStatusAtivacao(boolean statusAtivacao) {
		this.statusAtivacao = statusAtivacao;
	}


	public boolean isMovel() {
		return movel;
	}


	public void setMovel(boolean movel) {
		this.movel = movel;
	}



	
	

}

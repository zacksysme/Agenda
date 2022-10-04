package cadastro.aula1.model;

public class Contato {
	private String nome;
	private String telefone;
	private String sexo;
	private String observacao;
	
	public Contato(String nome, String telefone, String sexo, String observacao) {
		this.nome = nome;
		this.telefone = telefone;
		this.sexo = sexo;
		this.observacao = observacao;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
}

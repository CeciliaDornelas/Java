package provafinal;

public class P_juridica extends Pessoa {
	private String cnpj;
	
	public P_juridica() {
		
	}
	public P_juridica(String cnpj, String nome, double renda,int situacao, Endereco endereco, Conta conta) {
		super(nome,renda,situacao,endereco,conta);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}

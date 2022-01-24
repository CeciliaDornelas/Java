package provafinal;

public class P_fisica extends Pessoa{
	private String cpf,rg;
	
	public P_fisica() {
		
	}
	public P_fisica(String cpf, String rg, String nome, double renda,int situacao, Endereco endereco,Conta conta){
		super(nome,renda,situacao,endereco,conta);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
}

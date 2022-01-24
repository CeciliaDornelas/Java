package provafinal;

import java.util.Date;

public class movimento{
	private int tipo;
	private String datamovimentacao, horamovimentacao;
	private double valor; 
}
public class conta{
	private int numero;
	private Date data_abertura, data_encerramento;
	private int situacao = 1;
	private double saldo;
	private String senha;
	public static void sacar(double valor) {
		
	}
	public static void depositar(double valor) {
		
	}
	public static void transferir(double valor,Conta:conta) {
		
	}
}
public class pessoa{
	public String nome;
	public double renda;
	public int situacao;
	public pessoa(String_nome, String_renda, String_situação) {
		this.nome = nome;
		this.renda = renda;
		this.situacao = situacao;
	}
}
public class p_fisica extends pessoa{
	public p_fisica(String_nome, String_renda, String_situação) {
		super(_nome, _renda,_situacao);
	}
	private String cpf,rg;
}
public class p_juridica extends pessoa{
	public p_juridica(String_nome,, String_renda, String_situação) {
		super(_nome, _renda,_situacao);
	}
	private String cnpj;
}

public class endereço{
	private string rua,cep,bairro,cidade;
	private int numero;
}

public class banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

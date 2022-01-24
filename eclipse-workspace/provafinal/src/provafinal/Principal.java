package provafinal;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco("rua flores", "12345-678", "girassol", "raio de sol", 200);
		Endereco end2 = new Endereco("rua salgados", "87654-321", "coxinha", "catupiry", 22);
		
		Conta cont1 = new Conta(1240, "2021-09-10", "2022-12-20", 900, "112233");
		Conta cont2 = new Conta(1020, "2021-09-10" ,"2022-09-10", 1000, "11223344");
		
		P_fisica pf = new P_fisica("11122233345", "25678925", "Silvia", 200, 1, end1, cont1);
		P_juridica pj = new P_juridica("00012536548", "Livia", 200, 1, end2, cont2);
		
		
		ArrayList<Movimento> movs = new ArrayList();
		//pessoa fisica
		Movimento movs1 = new Movimento(2,"19-11-2021","12:07",500,pf);
		Movimento movs2 = new Movimento(2,"19-11-2021","12:08",500,pf);
		Movimento movs3 = new Movimento(1,"19-11-2021","12:10",200,pf);
		Movimento movs4 = new Movimento(1,"19-11-2021","12:12",200,pf);
		//pessoa juridica
		Movimento movs5 = new Movimento(2,"19-11-2021","12:13",1000,pj);
		Movimento movs6 = new Movimento(2,"19-11-2021","12:14",1000,pj);
		Movimento movs7 = new Movimento(3,"19-11-2021","12:15",500,pj);
		Movimento movs8 = new Movimento(3,"19-11-2021","12:16",500,pj);
		
		movs.add(movs1);
		movs.add(movs2);
		movs.add(movs3);
		movs.add(movs4);
		movs.add(movs5);
		movs.add(movs6);
		movs.add(movs7);
		movs.add(movs8);
		
		System.out.println("extratos:");
		System.out.println();
		
		for (Movimento m : movs) {
			
			if(m.getTipo() == 1) {
				double valor = m.getValor();
				double saldo = m.getPessoa().getConta().getSaldo();
				double res = m.getPessoa().getConta().sacar(saldo, valor);
				m.getPessoa().getConta().setSaldo(res);
				
				System.out.println("nome: "+m.getPessoa().getNome());
				System.out.println("numero da conta: "+m.getPessoa().getConta().getNumero());
				System.out.println("valor do saque: "+m.getValor());
				System.out.println("data: "+m.getData_movimentacao());
				System.out.println("hora: "+m.getHora_movimentacao());
				System.out.println("saldo atual:"+m.getPessoa().getConta().getSaldo());
				System.out.println();
			}
			else if(m.getTipo() == 2){
				double valor = m.getValor();
				double saldo = m.getPessoa().getConta().getSaldo();
				double res = m.getPessoa().getConta().depositar(saldo, valor);
				m.getPessoa().getConta().setSaldo(res);
				
				System.out.println("nome: "+m.getPessoa().getNome());
				System.out.println("numero da conta: "+m.getPessoa().getConta().getNumero());
				System.out.println("valor do deposito: "+m.getValor());
				System.out.println("data: "+m.getData_movimentacao());
				System.out.println("hora: "+m.getHora_movimentacao());
				System.out.println("saldo atual:"+m.getPessoa().getConta().getSaldo());
				System.out.println();
			}
			else if(m.getTipo() == 3){
				double valor = m.getValor();
				double saldo = m.getPessoa().getConta().getSaldo();
				double res = m.getPessoa().getConta().tansferir(saldo, valor);
				m.getPessoa().getConta().setSaldo(res);
				double saldo_destinatario = pf.getConta().getSaldo();
				double res_destinatario = m.getPessoa().getConta().depositar(saldo_destinatario, valor);
				pf.getConta().setSaldo(res_destinatario);
				
				System.out.println("nome: "+m.getPessoa().getNome());
				System.out.println("numero da conta: "+m.getPessoa().getConta().getNumero());
				System.out.println("valor da trasferencia: "+m.getValor());
				System.out.println("data: "+m.getData_movimentacao());
				System.out.println("hora: "+m.getHora_movimentacao());
				System.out.println("destinatario: "+pf.getNome());
				System.out.println("saldo atual:"+m.getPessoa().getConta().getSaldo());
				System.out.println();
			}
			
		}
	}
}

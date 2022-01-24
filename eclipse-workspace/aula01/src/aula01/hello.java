package aula01;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*HELLO WORD*/
		System.out.println("ola,Mund");
		
	/*EXERCICIO 01
		Scanner entrar = new Scanner(System.in);
		
		System.out.println("---calcular o custo de criacao dos colelhos--- ");
		System.out.println("digite o numero de coelhos para o calculo: ");
		int n_coelho = entrar.nextInt();
		
		double custo = (n_coelho*0.70) / 18+10;
		
		System.out.println("o cust para criar " + n_coelho + "eh: " + custo);*/
	
	/*EXERCICIO 02
		Scanner entrar = new Scanner(System.in);
		
		System.out.println("digite seu nome: ");
		String nome = entrar.nextLine();
		System.out.println("digite sua idade: ");
		int age = entrar.nextInt();
		System.out.println("digite sua primeria nota: ");
		double n1 = entrar.nextDouble();
		System.out.println("digite sua segunda nota: ");
		double n2 = entrar.nextDouble();
		System.out.println("digite sua terceira nota: ");
		double n3 = entrar.nextDouble();
		
		double med = (n1+n2+n3)/3;
		
		System.out.println("Ola,"+nome);
		System.out.println("Voce tem"+age);
		System.out.println("as notas digitadas foram: "+n1+"-"+n2+"-"+n3);
		System.out.println("entao sua media eh: "+med);*/
		
	/*EXERCICIO 03
		Scanner entrar = new Scanner(System.in);
		double Pi = 3.14;
		
		System.out.println("qual o raio da esfera: ");
		double r = entrar.nextDouble();
		
		double comprimento = 2*Pi*r;
		double area = Pi*(r*r);
		double volume = 0.75*Pi*r*r*r;
		
		System.out.println("valores:");
		System.out.println("raio = "+r);
		System.out.println("comprimento ="+comprimento);
		System.out.println("area ="+area);
		System.out.println("volume ="+volume);*/
	/*EXERCICIO 04
		Scanner entrar = new Scanner(System.in);
		
		System.out.println("digite seu salario: ");
		double sal = entrar.nextDouble();
		System.out.println("digite a quantidade de quilowats consumida na sua residencia: ");
		double qkw = entrar.nextDouble();
		
		double vkw = sal/5;
		double vresiden = vkw*qkw;
		double descont = vresiden*0.15;
		double vdescont = vresiden - descont;
		
		System.out.println("valor em reais por quilowatts: " + vkw);
		System.out.println("valor em reais por residencia: " + vresiden);
		System.out.println("valor em reais com 15 porcento de desconto: " + vdescont);*/
				
	/*EXERCICIO 05
		Scanner entrar = new Scanner(System.in);
		
		System.out.println("digite o numero de horas normais trabalhadas: ");
		int nhr = entrar.nextInt();
		System.out.println("digite o valor do salario minimo: ");
		double sal_min = entrar.nextDouble();
		System.out.println("digite o valor de horas extras trabalhadas: ");
		int nhrextra = entrar.nextInt();
		
		double val_nhr = 0.125 * sal_min;
		double val_nhrextra = 0.25	* sal_min;
		double sal_bruto = nhr * val_nhr;
		double add_hrextra = val_nhrextra * nhrextra;
		double sal = sal_bruto + add_hrextra;
		
		System.out.println("segundo as regras apresentadas o salario a ser pago eh "+ sal);*/
		
	/*EXERCICIO 06
		String s = "Principios da linguagem java";
		
		System.out.println("string: "+s);
		System.out.println("tamanho: "+s.length());
		System.out.println("primeiro caractere: "+s.charAt(0));
		System.out.println("primeiro e ultimo caractere: "+s.charAt(0)+s.charAt(s.length()-1));
		System.out.println("primeira palavra: "+s.substring(0,s.indexOf(" ")));*/
	
	/*EXERCICIO 07
		Scanner entrar = new Scanner(System.in);
		
		System.out.println("digite um telefone que contenha 11 digitos : ex.08393939393 ");
		var tel = entrar.nextLine();
		
		System.out.println("numero digitado: "+tel);
		System.out.println("DDD: "+tel.charAt(0)+tel.charAt(1)+tel.charAt(2));
		System.out.println("prefixo: "+tel.charAt(3)+tel.charAt(4)+tel.charAt(5)+tel.charAt(6));
		System.out.println("numero: "+tel.charAt(7)+tel.charAt(8)+tel.charAt(9)+tel.charAt(10));
		System.out.println("formatado: "+"("+tel.charAt(0)+tel.charAt(1)+tel.charAt(2)+") "+tel.charAt(3)+tel.charAt(4)+tel.charAt(5)+tel.charAt(6)+"-"+tel.charAt(7)+tel.charAt(8)+tel.charAt(9)+tel.charAt(10));*/
	
	/*EXERCICIO 08*/
		
	}

}

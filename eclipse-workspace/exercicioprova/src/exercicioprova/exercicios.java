package exercicioprova;

import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner entrar = new Scanner(System.in);
		double total_sal = 0;
		double total_filhos = 0;
		double maior = 0;
		int cont= 0;
		int i = 0;
	
		while( i == 0){
			System.out.println("digite o salario: ");
			double sal = entrar.nextDouble();
			System.out.println("quantos filhos?");
			int n_filhos = entrar.nextInt();
		
			cont = cont + 1;
			total_sal = total_sal + sal;
			total_filhos = total_filhos + n_filhos;
			if(sal>maior) {
				maior = sal;
			}
			System.out.println("quer continuar?");
			System.out.print("se sim digite 0 se nao digite 1: ");
			i = entrar.nextInt();
			System.out.println(" ");
		}
		double media_sal = total_sal/cont;
		double media_filhos = total_filhos/cont;
		
		System.out.println("media do salario de uma poplacao eh "+media_sal);
		System.out.println("media do numero de filhos de uma populacao eh"+media_filhos);
		System.out.println("o maior salario sera de "+maior);
	}*/
		/*Scanner entrar = new Scanner(System.in);
		int num[] = new int[6];
		int par[] = new int[6];
		int impar[] = new int[6];
		int quant_pares = 0;
		int quant_impares = 0;
		int cont_par = 0;
		int cont_impar = 0;
		int i;
		
		for(i=0;i<num.length;i++) {
			System.out.println("digite um numero inteiro: ");
			num[i] = entrar.nextInt();
			
			if(num[i]%2 == 0) {
				quant_pares ++;
				par[cont_par] = num[i];
				cont_par ++;
			}
			else {
				quant_impares ++;
				impar[cont_impar] = num[i];
				cont_impar ++;
			}
		}
		System.out.println("quantidade de numeros pares: "+quant_pares);
		System.out.println("numeros pares:");
		for(cont_par=0;cont_par<quant_pares;cont_par++) {
			System.out.print(par[cont_par]+" ");
		}
		System.out.println("");
		System.out.println("quantidade de numeros impares: "+quant_impares);
		System.out.println("numeros impares:");
		for(cont_impar=0;cont_impar<quant_impares;cont_impar++) {
			System.out.print(impar[cont_impar]+" ");
		}*/
		Scanner entrar = new Scanner(System.in);
		double sal = 0;
		int opc = 0;
		while(opc != 4) {
		System.out.println("--menu--");
		System.out.println("1. imposto");
		System.out.println("2. novo salario");
		System.out.println("3. classificacao");
		System.out.println("4. finalizar programa");
		System.out.print("digite o numero da opcao desejada: ");
		opc = entrar.nextInt();
		
		
		switch(opc) {
			case 1:
				System.out.print("digite o salario: ");
				sal = entrar.nextDouble();
				
				if(sal<500) {
					double imp = sal*5/100;
					System.out.print("O imposto sera de: "+imp);
				}else
				if(sal>=500 && sal<=850) {
					double imp = sal*10/100;
					System.out.print("O imposto sera de: "+imp);
				}else{
					double imp = sal*15/100;
					System.out.print("O imposto sera de: "+imp);
				}
				System.out.println(" ");
				break;
			case 2:
				System.out.print("digite o salario: ");
				sal = entrar.nextDouble();
				
				if(sal>1500) {
					double novo_sal = sal+25;
					System.out.print("seu novo salario eh: "+novo_sal);
				}else
				if(sal<=1500 && sal>=750) {
					double novo_sal = sal+50;
					System.out.print("seu novo salario eh: "+novo_sal);
				}else
				if(sal<750 && sal>=450) {
					double novo_sal = sal+75;
					System.out.print("seu novo salario eh: "+novo_sal);
				}else {
					double novo_sal = sal+100;
					System.out.print("seu novo salario eh: "+novo_sal);
				}
				System.out.println(" ");
				break;
			case 3:
				System.out.print("digite o salario: ");
			    sal = entrar.nextDouble();
				
				if(sal<=700) {
					System.out.print("mal remunerado");
				}else {
					System.out.print("bem remunarado");
				}
				
				break;
			case 4:
				break;
			default:
				System.out.print("opcao incorreta");
		}
		}
}
}

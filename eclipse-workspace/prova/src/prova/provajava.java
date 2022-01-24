package prova;

import java.util.Scanner;

public class provajava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrar = new Scanner(System.in);
		int idade;
		double soma = 0;
		int maior = 0;
		int i;
		
		for(i=0;i<2;i++){
			System.out.println("digite idade:");
			idade = entrar.nextInt();
			if(maior < idade) {
				maior = idade;
			}
			soma = soma+idade;
		}
		double media = soma/i;
		System.out.println("maior idade: "+ maior);
		System.out.println("media das idades: "+ media);
	}

}

package main;

import java.util.Scanner;

public class Pessoa {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
				//double nota1 = 0, nota2 = 0, media = 0;
				
				//entrada de dados
				//System.out.println("Digite a primeira e segunda nota do aluno:");
				//Scanner s = new Scanner(System.in);
				//nota1 = s.nextDouble();
				//nota2 = s.nextDouble();
				
				//cálculo da média
				//media = (nota1 + nota2)/2;
				 
				//System.out.println("A média é:" + media);
				
				
				// exemplos:
				
				//String s1 = "Exemplo de String";
				//int x = 5;
				//String s2 = "Idade de Ricardo =" + x;
				//int y = 5;
				//String s3 = "Respostas: x =" + x + "e y =" + y;
				//System.out.println(s3);
				
				// Ex:
				
				//String f1 = "Banana";
				//String f2 = "banana";
				//System.out.println("método equals = " + f1.equals(f2));
				//System.out.println("método equalsIgnoreCase = " + f1.equalsIgnoreCase(f2));
			
				// Exemplo Comando de Decisão em JAVA
				
				//int x = 15, y = 10;
				
				//if(x >= y) {
					//System.out.println("X é maior ou igual a Y.");
				//}
				//else {
					//System.out.println("X é menorque Y.");
				//}
				
				// Um quiosque de sorvete vende casquinhas somente nos sabores Chocolate
				// e Morango, não permitindo misturar os sabores num mesmo sorvete.
				//Faça um programa que solicite ao usuário que sabor ele quer
				//(digitando 1 para chocolate e 2 para morango", bem comom a quantidade
				//de bolas desejada desse sorvete. O programa deverá imprimir uma mensagem
				//  para o usuário de acordo com as seguintes regras:
				
				// °Sorvete de chocolate com mais de três bolas: "desconto de 10%";
				// °Sorvete de chocolate com 3 ou menos bolas: "desconto de 5 %";
				// °Sorvete de morango com qualquer quantidade de bolas : "sorvete sem
				//  desconto".
				
				// Primeira coisa em qualquer programa: declare as variáveis e coloque um
				// valor de inicialização nelas. que ne código vai ser 0 por se tratar de uma
				// variável numerica, se for uma string iniciar com [], se for lógica é false.
				
					int sabor = 0, qtd_bolas = 0;
					System.out.println("Digite o sabor:(1 - chocolate e 2 - morango)");
					Scanner s = new Scanner (System.in);
					// como o sabor é um valor inteiro escrevo nexInt, se a variável fosse uma
					//string/texto nextline. Existe um next para cada tipo de dado.
					sabor=s.nextInt();
					
					System.out.println("Digite a quantidade");
					qtd_bolas=s.nextInt();
					
					if(sabor == 1) {
						if(qtd_bolas >3)
							System.out.println("Desconto 10%. ");
						else
							System.out.println("Desconto 5%. ");
					}
					else
						System.out.println("Sorvete sem desconto. ");
					


	}

}

package Calcular;
import java.util.Scanner;

public class Base {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("Iniciando Calculo");
		
		exibirOpcoes();
		calcular();
	}
	
	public static void exibirOpcoes() {
		System.out.println("Selecione a Operacao Desejada");
		System.out.println("1 - Soma"); 
		System.out.println("2 - Subtracao");
		System.out.println("3 - Multiplicacao");
		System.out.println("4 - Divisao");
		System.out.println("5 - Porcentagem");
	}
	
	public static void calcular() {
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		System.out.println("Insira o primeiro numero");
		double valor1 = scanner.nextDouble();
		System.out.println("Insira o segundo numero");
		double valor2 = scanner.nextDouble();
		
		switch(opcao) {
	
		case 1:
			double resultadoSoma = soma(valor1, valor2);
			System.out.println("Resultado da soma: " + resultadoSoma);
			break;
		case 2:
			double resultadoSubtracao = subtracao(valor1, valor2);
			System.out.println("Resultado da subtracao: " + resultadoSubtracao);
			break;
		case 3:
			double resultadoMultiplicacao = multiplicacao(valor1, valor2);
			System.out.println("Resultado da multiplicacao " + resultadoMultiplicacao);
			break;
		case 4:
			double resultadoDivisao = divisao(valor1, valor2);
			System.out.println("Resultado da divisao " + resultadoDivisao);
			break;
		case 5:
			double resultadoPorcentagem = porcentagem (valor1, valor2);
			System.out.println("O resultado da porcentagem e: " + resultadoPorcentagem);
			break;
		default:
			System.out.println("Operacao Invalida");
			break;
		}
		scanner.close();
	}
	
	public static void obterEntradas () {
	}
	
	public static double soma(double valor1, double valor2) {
		double resultado = valor1 + valor2;
		return resultado;
	}
	
	public static double subtracao(double valor1, double valor2) {
		double resultado = valor1 - valor2;
		return resultado;
	}
	
	public static double multiplicacao(double valor1, double valor2) {
		double resultado = valor1 * valor2;
		return resultado;
	}
	
	public static double divisao(double valor1, double valor2) {
		double resultado = valor1 / valor2;
		return resultado;
	}	
	public static double porcentagem(double valorOriginal, double porcentagem) {
		double resultado = (valorOriginal * porcentagem) / 100;
		return resultado;
	}
}
import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		
		System.out.println("Digite o número do exercício (1-32) ou 0 para sair: ");
		opcao = entrada.nextInt();
		
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				Exercicios.ex1();
				break;
			case 2:
				Exercicios.ex2();
				break;
			case 3:
				Exercicios.ex3();
				break;
			case 4:
				Exercicios.ex4();
				break;
			case 5:
				Exercicios.ex5();
				break;
			case 6:
				Exercicios.ex6();
				break;
			case 7:
				Exercicios.ex7();
				break;
			case 8:
				Exercicios.ex8();
				break;
			case 9:
				Exercicios.ex9();
				break;
			case 10:
				Exercicios.ex10();
				break;
			case 11:
				Exercicios.ex11();
				break;
			case 12:
				Exercicios.ex12();
				break;
			case 13:
				Exercicios.ex13();
				break;
			case 14:
				Exercicios.ex14();
				break;
			case 15:
				Exercicios.ex15();
				break;
			case 16:
				Exercicios.ex16();
				break;
			case 17:
				Exercicios.ex17();
				break;
			case 18:
				Exercicios.ex18();
				break;
			case 19:
				Exercicios.ex19();
				break;
			case 20:
				Exercicios.ex20();
				break;
			case 21:
				Exercicios.ex21();
				break;
			case 22:
				Exercicios.ex22();
				break;
			case 23:
				Exercicios.ex23();
				break;
			case 24:
				Exercicios.ex24();
				break;
			case 25:
				Exercicios.ex25();
				break;
			case 26:
				Exercicios.ex26();
				break;
			case 27:
				Exercicios.ex27();
				break;
			case 28:
				Exercicios.ex28();
				break;
			case 29:
				Exercicios.ex29();
				break;
			case 30:
				Exercicios.ex30();
				break;
			case 31:
				Exercicios.ex31();
				break;
			case 32:
				Exercicios.ex32();
				break;
			}
			System.out.println("Digite o número do exercício (1-32) ou 0 para sair: ");
			opcao = entrada.nextInt();
		}
		System.out.println("Saindo do programa...");
		entrada.close();
	}

}

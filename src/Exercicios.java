import java.util.Scanner;

public class Exercicios {
	static Scanner entrada = new Scanner(System.in);

	public static void ex1() {
		System.out.println("Digite dois números: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();

		if (num1 > num2) {
			System.out.println("Maior número é: " + num1);
		} else if (num2 > num1) {
			System.out.println("Maior número é: " + num2);
		} else
			System.out.println("Os números são iguais.");
	}

	public static void ex2() {
		System.out.println("Digite um  número: ");
		int num1 = entrada.nextInt();
		if (num1 > 0) {
			System.out.println("Número é positivo.");
		} else if (num1 < 0) {
			System.out.println("O número é negativo");
		} else
			System.out.println("O número é 0");
	}

	public static void ex3() {
		System.out.println("Digite F ou M");
		String letra = entrada.next();
		if (letra.equals("F")) {
			System.out.println("Feminino");
		} else if (letra.equals("M")) {
			System.out.println("Masculino");
		} else
			System.out.println("Digite uma opção válida");
	}

	public static void ex4() {
		System.out.println("Digite uma ano com 4 dígitos: ");
		int ano = entrada.nextInt();
		if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano + " é bissexto");
		} else {
			System.out.println("O ano " + ano + " não é bissexto");
		}
	}

	public static void ex5() {
		System.out.println("Digite uma letra: ");
		String letra = entrada.next();
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("A letra digitada é uma vogal.");
		} else
			System.out.println("A letra digitada é uma consoante.");
	}

	public static void ex6() {
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		numero += 1;
		System.out.println("Número transformado em par ou impar: " + numero);
	}

	public static void ex7() {
		System.out.println("Digite três números: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();

		int maior = 0;
		int medio = 0;
		int menor = 0;

		if (num1 > num2 && num1 > num3) {
			maior = num1;
			if (num2 > num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}
		}

		if (num2 > num1 && num2 > num3) {
			maior = num2;
			if (num1 > num3) {
				medio = num1;
				menor = num3;
			} else {
				medio = num3;
				menor = num1;
			}
		}

		if (num3 > num2 && num3 > num1) {
			maior = num3;
			if (num1 > num2) {
				medio = num1;
				menor = num2;
			} else {
				medio = num2;
				menor = num1;
			}
		}
		System.out.println("Número em ordem descrescente: ");
		System.out.println(maior + " " + medio + " " + menor);
	}

	public static void ex8() {
		System.out.println("Digite duas notas do aluno: ");
		int nota1 = entrada.nextInt();
		int nota2 = entrada.nextInt();
		int media = (nota1 + nota2) / 2;
		if (media >= 7) {
			System.out.println("Aprovado!!");
		} else
			System.out.println("Reprovado!!");
	}

	public static void ex9() {
		System.out.println("Digite sua altura: ");
		float altura = entrada.nextFloat();
		System.out.println("Digite seu sexo: (F para feminino e M para masculino)");
		String sexo = entrada.next();
		System.out.println("Digite seu peso: ");
		float peso = entrada.nextFloat();

		if (sexo.equals("F")) {
			float pesoIdealF = (float) ((62.1 * altura) - 44.7);
			System.out.println("Seu peso ideal é " + pesoIdealF);
			if (peso > pesoIdealF) {
				System.out.println("Você está acima do peso ideal.");
			} else if (peso < pesoIdealF) {
				System.out.println("Você está abaixo do peso ideal.");
			} else
				System.out.println("Você está no peso ideal.");
		}
		if (sexo.equals("M")) {
			float pesoIdealM = (float) ((72.7 * altura) - 58);
			System.out.println("Seu peso ideal é " + pesoIdealM);
			if (peso > pesoIdealM) {
				System.out.println("Você está acima do peso ideal.");
			} else if (peso < pesoIdealM) {
				System.out.println("Você está abaixo do peso ideal.");
			} else
				System.out.println("Você está no peso ideal.");
		}

	}

	public static void ex10() {
		System.out.println("Digite três números ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		int maior = 0;
		int menor = 0;

		if (num1 > num2 && num1 > num3) {
			maior = num1;
			if (num2 > num3) {
				menor = num3;
			} else
				menor = num2;
		}

		if (num2 > num1 && num2 > num3) {
			maior = num2;
			if (num1 > num3) {
				menor = num3;
			} else
				menor = num1;
		}

		if (num3 > num2 && num3 > num1) {
			maior = num3;
			if (num1 > num2) {
				menor = num2;
			} else
				menor = num1;
		}
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);

	}

	public static void ex11() {
		System.out.println("Em que turno voccê estuda? Matutiono/Vespertino/Noturno");
		String turno = entrada.next();

		switch (turno) {
		case "M":
			System.out.println("Bom dia!");
			break;
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "N":
			System.out.println("Boa noite!");
			break;
		}

	}

	public static void ex12() {
		System.out.println("Digite o salário: ");
		float salario = entrada.nextFloat();

		System.out.println("Salário antes do reajuste: " + salario);
		if (salario <= 280) {
			System.out.println("Percentual de aumento aplicado: 20%");
			System.out.println("Valor do aumento: " + (salario * 0.20));
			System.out.println("Novo salário após o aumento: " + (salario * 1.20));
		}
		if (salario > 280 && salario <= 700) {
			System.out.println("Percentual de aumento aplicado: 15%");
			System.out.println("Valor do aumento: " + (salario * 0.15));
			System.out.println("Novo salário após o aumento: " + (salario * 1.15));
		}
		if (salario > 700 && salario <= 1500) {
			System.out.println("Percentual de aumento aplicado: 10%");
			System.out.println("Valor do aumento: " + (salario * 0.10));
			System.out.println("Novo salário após o aumento: " + (salario * 1.10));
		}
		if (salario > 1500) {
			System.out.println("Percentual de aumento aplicado: 5%");
			System.out.println("Valor do aumento: " + (salario * 0.05));
			System.out.println("Novo salário após o aumento: " + (salario * 1.05));
		}
	}

	public static void ex13() {
		System.out.println("Valor da hora: ");
		float valorHora = entrada.nextFloat();
		System.out.println("Horas trabalhadas no mês: ");
		float horasTrabalhadas = entrada.nextFloat();

		float salarioBruto = valorHora * horasTrabalhadas;
		float descontoInss = (float) (salarioBruto * 0.10);
		float fgts = (float) (salarioBruto * 0.11);
		float descontoIr = 0;

		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("FGTS 11% (Não descontado): " + fgts);
		System.out.println("INSS -10%: " + descontoInss);

		if (salarioBruto <= 900) {
			System.out.println("Isento de imposto de renda");
			System.out.println("Total de descontos: (INSS)%: " + descontoInss);
			System.out.println("Salário líquido: " + (salarioBruto - descontoInss));
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			descontoIr = (float) (salarioBruto * 0.05);
			System.out.println("Imposto de renda -5%: " + descontoIr);
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			descontoIr = (float) (salarioBruto * 0.10);
			System.out.println("Imposto de renda -10%: " + salarioBruto * 0.10);
		} else if (salarioBruto > 2500) {
			descontoIr = (float) (salarioBruto * 0.20);
			System.out.println("Imposto de renda -20%: " + salarioBruto * 0.20);
		}
		System.out.println("Total de descontos: (IR+INSS)%: " + (descontoInss + (descontoIr)));
		System.out.println("Salário líquido: " + (salarioBruto - (descontoInss + (descontoIr))));
	}

	public static void ex14() {
		System.out.println("Digite um número para um dia da semana: ");
		int num = entrada.nextInt();

		if (num == 1) {
			System.out.println("Domingo");
		} else if (num == 2) {
			System.out.println("Segunda");
		} else if (num == 3) {
			System.out.println("Terça");
		} else if (num == 4) {
			System.out.println("Quarta");
		} else if (num == 5) {
			System.out.println("Quinta");
		} else if (num == 6) {
			System.out.println("Sexta");
		} else if (num == 7) {
			System.out.println("Sábado");
		} else
			System.out.println("Dia da semana inválido");
	}

	public static void ex15() {
		System.out.println("Digite o preço de custo do produto: ");
		float preco = entrada.nextFloat();
		System.out.println("Digite o código de origem");
		int codigoOrigem = entrada.nextInt();

		System.out.println("Preço do produto: " + preco);
		if (codigoOrigem == 1) {
			System.out.println("Origem: Sul");
		} else if (codigoOrigem == 2) {
			System.out.println("Origem: Norte");
		} else if (codigoOrigem == 3) {
			System.out.println("Origem: Leste");
		} else if (codigoOrigem == 4) {
			System.out.println("Origem: Oeste");
		} else if (codigoOrigem == 5) {
			System.out.println("Origem: Nordeste");
		} else if (codigoOrigem == 6) {
			System.out.println("Origem: Nordeste");
		} else if (codigoOrigem == 7) {
			System.out.println("Origem: Centro-Oeste");
		} else if (codigoOrigem == 8) {
			System.out.println("Origem: Centro-Oeste");
		} else
			System.out.println("O produto é de origem importada");
	}

	public static void ex16() {
		System.out.println("Digite as notas do aluno: ");
		float nota1 = entrada.nextFloat();
		float nota2 = entrada.nextFloat();
		float nota3 = entrada.nextFloat();
		float media = (nota1 + nota2 + nota3) / 3;

		if (media >= 0 && media < 3) {
			System.out.println("Reprovado");
		} else if (media >= 3 && media < 7) {
			System.out.println("Em exame");
		} else if (media >= 7 && media <= 10) {
			System.out.println("Aprovado");
		}
	}

	public static void ex17() {
		System.out.println("Digite as notas do aluno: ");
		float nota1 = entrada.nextFloat();
		float nota2 = entrada.nextFloat();
		float media = (nota1 + nota2) / 2;

		System.out.println("Notas: " + nota1 + " e " + nota2);
		System.out.println("Média das notas: " + media);

		if (media >= 0 && media < 4) {
			System.out.println("Conceito E");
			System.out.println("Reprovado");
		} else if (media >= 4 && media < 6) {
			System.out.println("Conceito D");
			System.out.println("Reprovado");
		} else if (media >= 6 && media < 7.5) {
			System.out.println("Conceito C");
			System.out.println("Aprovado");
		} else if (media >= 7.5 && media < 9) {
			System.out.println("Conceito B");
			System.out.println("Aprovado");
		} else if (media >= 9 && media <= 10) {
			System.out.println("Conceito A");
			System.out.println("Aprovado");
		}
	}

	public static void ex18() {
		System.out.println("Os lados de um triângulo: ");
		float lado1 = entrada.nextFloat();
		float lado2 = entrada.nextFloat();
		float lado3 = entrada.nextFloat();

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Equilátero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
			System.out.println("Isósceles");
		} else
			System.out.println("Escaleno");
	}

	public static void ex19() {
		System.out.println("Informa o valor de A: ");
		double a = entrada.nextDouble();
		System.out.println("Informa o valor de B: ");
		double b = entrada.nextDouble();
		System.out.println("Informa o valor de C: ");
		double c = entrada.nextDouble();

		if (a != 0) {
			double delta = (b * b - (4 * a * c));
			if (delta >= 0) {
				if (delta > 0) {
					System.out.println("Existem duas raízes reais");
					double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
					double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.println("Primeira raiz = " + raiz1);
					System.out.println("Segunda raiz = " + raiz2);
				} else
					System.out.println("Delta idual a 0, uma raiz real: " + -b / (2 * a));
			} else
				System.out.println("Delta negativo, equação sem raizes reais");
		} else
			System.out.println("A == 0, não é uma esquação do segundo grau");

	}

	public static void ex20() {
		System.out.println("Digite uma ano: ");
		int ano = entrada.nextInt();
		if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano + " é bissexto");
		} else {
			System.out.println("O ano " + ano + " não é bissexto");
		}
	}

	public static void ex21() {
		System.out.println("Digite o dia: ");
		int dia = entrada.nextInt();
		System.out.println("Digite o mês: ");
		int mes = entrada.nextInt();
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		boolean bissexto;

		if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
			bissexto = true;
		} else {
			bissexto = false;
		}

		if (ano >= 0) {
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia >= 1 && dia <= 31) {
					System.out.println("Data válida: " + dia + "/" + mes + "/" + ano);
				} else
					System.out.println("Data inválida");
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia >= 1 && dia <= 30) {
					System.out.println("Data válida: " + dia + "/" + mes + "/" + ano);
				} else
					System.out.println("Data inválida");
			} else if (mes == 2) {
				if (bissexto) {
					if (dia >= 1 && dia <= 29) {
						System.out.println("Data válida: " + dia + "/" + mes + "/" + ano);
					} else
						System.out.println("Data inválida");
				} else {
					if (dia >= 1 && dia <= 28) {
						System.out.println("Data válida: " + dia + "/" + mes + "/" + ano);
					} else
						System.out.println("Data inválida");
				}
			} else
				System.out.println("Data inválida");

		} else
			System.out.println("Data inválida");
	}

	public static void ex22() {
		System.out.println("Digite um número inteiro menor que 1000: ");
		int num = entrada.nextInt();
		int centena = (int) (num / 100);
		int dezena = (int) ((num - (centena * 100)) / 10);
		int unidade = (int) (num - (centena * 100) - (dezena * 10));

		System.out.println("Número de centenas: " + centena);
		System.out.println("Número de dezenas: " + dezena);
		System.out.println("Número de unidades: " + unidade);
	}

	public static void ex23() {
		System.out.println("Digite as idades dos três alunos: ");
		double idade1 = entrada.nextDouble();
		double idade2 = entrada.nextDouble();
		double idade3 = entrada.nextDouble();
		double media = (idade1 + idade2 + idade3) / 3;

		if (media < 25) {
			System.out.println("Turma Jovem");
		} else if (media >= 25 && media <= 40) {
			System.out.println("Turma Adulta");
		} else if (media > 40) {
			System.out.println("Turma Idosa");
		}
	}

	public static void ex24() {
		System.out.println("Digite as notas do aluno: ");
		float nota1 = entrada.nextFloat();
		float nota2 = entrada.nextFloat();
		float nota3 = entrada.nextFloat();
		float media = (nota1 + nota2 + nota3) / 3;

		if (media < 7) {
			System.out.println("Reprovado, média: " + media);
		} else if (media > 7 && media < 10) {
			System.out.println("Aprovado, média: " + media);
		} else if (media == 10) {
			System.out.println("Aprovado com destinção, média: " + media);
		}
	}

	public static void ex25() {
		System.out.println("Digite o valor que deseja sacar");
		int saque = entrada.nextInt();
		int notas1 = 0;
		int notas5 = 0;
		int notas10 = 0;
		int notas50 = 0;
		int notas100 = 0;
		if (saque >= 10 && saque <= 600) {
			notas100 = saque / 100;
			saque = saque - (notas100 * 100);
			notas50 = saque / 50;
			saque = saque - (notas50 * 50);
			notas10 = saque / 10;
			saque = saque - (notas10 * 10);
			notas5 = saque / 5;
			saque = saque - (notas5 * 5);
			notas1 = saque;
		} else
			System.out.println("Valor de saque inválido!");

		System.out.println("Notas de 100: " + notas100);
		System.out.println("Notas de 50: " + notas50);
		System.out.println("Notas de 10: " + notas10);
		System.out.println("Notas de 5: " + notas5);
		System.out.println("Notas de 1: " + notas1);
	}

	public static void ex26() {
		System.out.println("Digite um número: ");
		double num = entrada.nextDouble();
		int numA = (int) Math.round(num);
		if (num == numA) {
			System.out.println("O número digitado é inteiro");
		} else
			System.out.println("O número digitado é decimal");
	}

	public static void ex27() {
		System.out.println("Digite dois números: ");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		System.out.println("Digite a operação que deseja realizar: (+,-,*,/)");
		String op = entrada.next();
		double resultado = 0;

		switch (op) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		}

		System.out.println("O resultado conforme a operação escolhida é: " + resultado);
		double resultadoA = Math.round(resultado);

		if (resultado > 0) {
			System.out.print("O resultado é positivo, ");
		} else
			System.out.print("O resultado é negativo, ");

		if (resultado % 2 == 0) {
			System.out.print("par");
		} else
			System.out.print("ímpar");

		if (resultado == resultadoA) {
			System.out.println(" e inteiro");
		} else
			System.out.println(" e decimal");
	}

	public static void ex28() {
		int soma = 0;
		System.out.println("RESPONDA COM S OU N");

		System.out.println("Telefonou para a vítima?");
		String r1 = entrada.next();
		if (r1.equals("S")) {
			soma += 1;
		}
		System.out.println("Esteve no local do crime?");
		String r2 = entrada.next();
		if (r2.equals("S")) {
			soma += 1;
		}
		System.out.println("Mora perto da vítima?");
		String r3 = entrada.next();
		if (r3.equals("S")) {
			soma += 1;
		}
		System.out.println("Devia para a vítima?");
		String r4 = entrada.next();
		if (r4.equals("S")) {
			soma += 1;
		}
		System.out.println("Já trabalhou com a vítima?");
		String r5 = entrada.next();
		if (r5.equals("S")) {
			soma += 1;
		}

		if (soma == 2) {
			System.out.println("Suspeito!");
		} else if (soma == 3 || soma == 4) {
			System.out.println("Cúmplice!");
		} else if (soma == 5) {
			System.out.println("Asssasino!");
		} else
			System.out.println("Inocente!");

	}

	public static void ex29() {
		System.out.println("Digite o tipo de combustível: (A para alcool e G para gasolina)");
		String tipo = entrada.next();
		System.out.println("Digite a quantidade de litros vendidos: ");
		double litros = entrada.nextDouble();
		double preco = 0;

		if (tipo.equals("A")) {
			preco = litros * 1.90;
			if (litros <= 20) {
				preco *= 0.97;
			} else if (litros > 20) {
				preco *= 0.95;
			}
		}
		if (tipo.equals("G")) {
			preco = litros * 2.50;
			if (litros <= 20) {
				preco *= 0.96;
			} else if (litros > 20) {
				preco *= 0.94;
			}
		}
		System.out.println("Valor a ser pago: " + preco);
	}

	public static void ex30() {
		System.out.println("Quantidade de morangos (Kg): ");
		double qntMorango = entrada.nextDouble();
		System.out.println("Quantidade de maçãs (Kg): ");
		double qntMaca = entrada.nextDouble();
		double valor = 0;

		if (qntMorango <= 5) {
			valor += qntMorango * 2.50;
		} else
			valor += qntMorango * 2.20;

		if (qntMaca <= 5) {
			valor += qntMaca * 1.80;
		} else
			valor += qntMaca * 1.50;

		if ((qntMorango + qntMaca) > 8 || valor > 25) {
			valor *= 0.90;
		}
		System.out.println("Valor final " + valor + " reais");
	}

	public static void ex31() {
		System.out.println("Tipo de carne: (F - File Duplo | A - Alcatra | P - Picanha)");
		String tipo = entrada.next();
		System.out.println("Quantidade de carne: ");
		double qnt = entrada.nextDouble();
		System.out.println("Vai pagar com cartão tabajara? (S - Sim, N - Não");
		String cartao = entrada.next();
		double valor = 0;

		System.out.println("Cumpom Fical");
		System.out.println("Quantidade de carne " + qnt + " kilos");

		if (tipo.equals("F")) {
			System.out.println("Tipo de carne: File Duplo");
			if (qnt <= 5) {
				valor = qnt * 4.90;
			} else
				valor = qnt * 5.80;
		} else if (tipo.equals("A")) {
			System.out.println("Tipo de carne: Alcatra");
			if (qnt <= 5) {
				valor = qnt * 5.90;
			} else
				valor = qnt * 8.80;
		} else if (tipo.equals("P")) {
			System.out.println("Tipo de carne: Picanha");
			if (qnt <= 5) {
				valor = qnt * 6.90;
			} else
				valor = qnt * 7.80;
		}

		if (cartao.equals("S")) {
			valor *= 0.95;
			System.out.println("Pago com o cartão Tabajara");
			System.out.println("Com desconto de " + (valor * 0.05) + " reais");
		}
		System.out.println("Valor final " + valor + " reais");
	}

	public static void ex32() {
		String respostas[] = new String[10];
		int nota = 0;
		for (int i = 0; i <= 9; i++) {
			System.out.println("Resposta da questão " + (i + 1) + ": (responda com letra minúscula)");
			respostas[i] = entrada.next();
		}

		for (int i = 0; i <= 9; i++) {
			if (i == 0) {
				System.out.println("Respota do aluno para questão 1: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 1: a");
				if (respostas[i].equals("a")) {
					nota += 1;
				}
			}
			if (i == 1) {
				System.out.println("Respota do aluno para questão 2: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 2: a");
				if (respostas[i].equals("a")) {
					nota += 1;
				}
			}
			if (i == 2) {
				System.out.println("Respota do aluno para questão 3: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 3: b");
				if (respostas[i].equals("b")) {
					nota += 1;
				}
			}
			if (i == 3) {
				System.out.println("Respota do aluno para questão 4: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 4: b");
				if (respostas[i].equals("b")) {
					nota += 1;
				}
			}
			if (i == 4) {
				System.out.println("Respota do aluno para questão 5: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 5: c");
				if (respostas[i].equals("c")) {
					nota += 1;
				}
			}
			if (i == 5) {
				System.out.println("Respota do aluno para questão 6: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 6: c");
				if (respostas[i].equals("c")) {
					nota += 1;
				}
			}
			if (i == 6) {
				System.out.println("Respota do aluno para questão 7: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 7: d");
				if (respostas[i].equals("d")) {
					nota += 1;
				}
			}
			if (i == 7) {
				System.out.println("Respota do aluno para questão 8: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 8: d");
				if (respostas[i].equals("d")) {
					nota += 1;
				}
			}
			if (i == 8) {
				System.out.println("Respota do aluno para questão 9: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 9: e");
				if (respostas[i].equals("e")) {
					nota += 1;
				}
			}
			if (i == 9) {
				System.out.println("Respota do aluno para questão 10: " + respostas[i]);
				System.out.println("Respota do gabarito para questão 10: e");
				if (respostas[i].equals("e")) {
					nota += 1;
				}
			}
		}
		System.out.println("Nota do aluno: " + nota);
	}

}

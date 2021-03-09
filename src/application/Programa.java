package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.ContratoPorHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelDoTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Entre om o nome do Departamento");

		String nomeDoDepartamento = sc.nextLine();

		System.out.print("Digite os dados do Funcionário ");
		System.out.println("Nome: ");
		String nomeDoFuncionario = sc.nextLine();
		System.out.println("Nivel : ");
		String nivelDoFuncionario = sc.nextLine();
		System.out.println("Salário Base: ");
		double salarioBase = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeDoFuncionario, NivelDoTrabalhador.valueOf(nivelDoFuncionario),
				salarioBase, new Departamento(nomeDoDepartamento));

		System.out.print("Quantos contratos o funcionário vai possuir: ");
		int numerosDeContratos = sc.nextInt();
		for (int i = 1; i <= numerosDeContratos; i++) {
			System.out.println("Insira a data do contrato  # :  " + i);
			System.out.print("DATA DD/MM/AAAA :");
			Date DataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (horas) ");
			int duracaoHoras = sc.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(DataContrato, valorPorHora, duracaoHoras);
			trabalhador.adicionarContrato(contrato);

		}

		sc.close();

	}

}

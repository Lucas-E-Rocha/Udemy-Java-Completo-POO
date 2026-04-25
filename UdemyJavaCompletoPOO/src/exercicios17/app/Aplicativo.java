package exercicios17.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicios17.entities.Contract;
import exercicios17.entities.Installment;
import exercicios17.services.ContractService;
import exercicios17.services.PaypalService;

public class Aplicativo {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre so dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Valor do contrato: ");
		double valor = sc.nextDouble();
		
		Contract contract = new Contract(numero, date, valor);
		
		System.out.println("Entre com o número de parcelas: ");
		int months = sc.nextInt();


		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, months);

		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment.toString());
		}

		sc.close();
	}
}

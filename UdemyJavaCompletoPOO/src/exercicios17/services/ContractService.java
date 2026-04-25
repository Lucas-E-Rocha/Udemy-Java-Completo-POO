package exercicios17.services;

import java.util.Calendar;

import exercicios17.entities.Contract;
import exercicios17.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	private Calendar calendar = Calendar.getInstance();

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		calendar.setTime(contract.getDate());
		double baseAmount = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double interest = onlinePaymentService.interest(baseAmount, i);
			double paymentFee = onlinePaymentService.paymentFee(interest + baseAmount);
			calendar.setTime(contract.getDate());
			calendar.add(Calendar.MONTH, i);
			contract.getInstallments().add(new Installment(calendar.getTime(), baseAmount + interest + paymentFee));
		}
	}

}

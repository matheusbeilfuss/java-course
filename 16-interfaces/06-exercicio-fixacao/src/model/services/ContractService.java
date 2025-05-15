package model.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		
		List<Installment> installments = new ArrayList<Installment>();
		
		for (int i = 0; i < months; i++) {
			Double installmentWithInterest = onlinePaymentService.interest((contract.getTotalValue() / months), i + 1);
			Double installmentWithFee = onlinePaymentService.paymentFee(installmentWithInterest);
			
			LocalDate dueDate = contract.getDate().plusMonths(i + 1);
			
			Installment installment = new Installment(dueDate, installmentWithFee);
			installments.add(installment);
		}
		
		contract.setInstallments(installments);
	}
}

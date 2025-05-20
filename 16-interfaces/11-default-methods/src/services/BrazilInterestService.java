package services;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() { // esse método não pode ser padrão, porque depende do valor da variável do serviço. A interface não armazena estado e não pode ter construtor 
		return interestRate;
	}
}
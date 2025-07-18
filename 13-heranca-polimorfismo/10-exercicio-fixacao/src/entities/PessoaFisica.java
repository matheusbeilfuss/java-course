package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica() {
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calculoImposto() {
		Double imposto;
		if (super.getRendaAnual() < 20000.00) {
			imposto = super.getRendaAnual() * 0.15;
		} else {
			imposto = super.getRendaAnual() * 0.25;
		}
		return imposto - (gastosSaude * 0.5);
	}
}

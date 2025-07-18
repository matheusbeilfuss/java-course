package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double calculoImposto() {
		Double imposto;
		if (numeroFuncionarios <= 10) {
			imposto = super.getRendaAnual() * 0.16;
		} else {
			imposto = super.getRendaAnual() * 0.14;
		}
		return imposto;
	}
	
	
}

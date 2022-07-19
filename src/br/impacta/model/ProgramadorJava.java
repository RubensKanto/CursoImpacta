package br.impacta.model;

public class ProgramadorJava extends Programador {

	private String certificacaoOracle;

	public String getCertificacaoOracle() {
		return certificacaoOracle;
	}

	public void setCertificacaoOracle(String certificacaoOracle) {
		this.certificacaoOracle = certificacaoOracle;
	}

	@Override
	public double calcularSalario(int horasTrabalhadas) {
		double salarioCalculo = horasTrabalhadas * 50;
		return salarioCalculo;
	}
	
	@Override
	public double retornaHoraTrabalhada(double salario) {
		double horaTrabalhada = salario / 50;
		return horaTrabalhada;
		
	}
	
}
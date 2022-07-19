package br.impacta.model;

public class ProgramadorPhp extends Programador {
	
private String certificacaoPhp;

	
	
	public String getCertificacaoPhp() {
	return certificacaoPhp;
}



public void setCertificacaoPhp(String certificacaoPhp) {
	this.certificacaoPhp = certificacaoPhp;
}



	@Override
	public double calcularSalario(int horasTrabalhadas) {
		double salarioCalculo = horasTrabalhadas * 80;
		return salarioCalculo;
	}
	
	@Override
	public double retornaHoraTrabalhada(double salario) {
		double horaTrabalhada = salario / 80;
		return horaTrabalhada;
		
	}
	
	

}

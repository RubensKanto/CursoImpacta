package br.impacta.model;

public class Programador {

	private String matricula;
	private String nome;
	private double salario;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalario(int horasTrabalhadas) {
		double salarioCalculo = horasTrabalhadas * 7.5;
		return salarioCalculo;
		
	}

	public double retornaHoraTrabalhada(double salario) {
		double horaTrabalhada = salario / 7.5;
		return horaTrabalhada;
		
	}
	
	
}

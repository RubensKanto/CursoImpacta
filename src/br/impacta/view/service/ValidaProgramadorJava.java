package br.impacta.view.service;

import javax.swing.JTextField;


import br.impacta.model.ProgramadorJava;
import br.impacta.repository.RepositorioProgramadorJava;



public class ValidaProgramadorJava {

	public String validarProgramadorJava(ProgramadorJava programadorJava, RepositorioProgramadorJava repositorioProgramadorJava,JTextField horaTrabalhadaTextField) {
		String mensagemErro = null;
		
		if(!verificaAlfabeto(programadorJava.getNome())) {
			mensagemErro = "Nome Invalido - Verifique o Alfabeto!!";
			return mensagemErro;
		}
				
		if(programadorJava.getNome().length() > 20){
			mensagemErro = "Maximo de 20 caracteres para o nome do Programador Java!";
			return mensagemErro;
		}
		
				
		if(!validaInteiro(horaTrabalhadaTextField.getText())) {
			mensagemErro = "A hora trabalhada deve ser um Inteiro!!";
			return mensagemErro;
			
		}

		if(!verificaAlfabeto(programadorJava.getNome())) {
			mensagemErro = "Nome Invalido - Verifique o Alfabeto!!";
			return mensagemErro;
		}
				
		if(programadorJava.getNome().length() > 20){
			mensagemErro = "Maximo de 20 caracteres para o nome do Programador Java!";
			return mensagemErro;
		
		}
		
		return mensagemErro;
		
	}
	
	
	public boolean validaInteiro(String stringInt) {
	
		 int quantidadeDecimal = 10;
		 
		 if(stringInt.isEmpty()) {
			return false;
		 }
		
		 int i;
		 int quantidadeDeCaracteres = stringInt.length();
		 
		 for(i = 0; i < quantidadeDeCaracteres; i++){
			 if(i == 0 && stringInt.charAt(i) == '-' ) {
				 return false;
			 }
			 
			 if(((Character.digit(stringInt.charAt(i), quantidadeDecimal)) < 0)) {
				 return false;
			 }
			
			 
		 }
		
		return true;
		
	}
	
	public boolean verificaAlfabeto(String stringAlfabeto) {
		boolean alfabeto = false;
		
		int i;
		int quantidadeDeCaracteres = stringAlfabeto.length();
		
		for(i = 0; i < quantidadeDeCaracteres; i++) {
			
			if(Character.isAlphabetic(stringAlfabeto.charAt(i))) {
				alfabeto = true;
			}else {
				alfabeto = false;
			}
			
			
		}
		
		
		return alfabeto;
	}
	
	
	
}

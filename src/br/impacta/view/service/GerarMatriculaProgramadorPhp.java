package br.impacta.view.service;


import br.impacta.repository.RepositorioProgramadorPhp;

public class GerarMatriculaProgramadorPhp {
	
	RepositorioProgramadorPhp repositorioProgramadorPhp = new RepositorioProgramadorPhp();
	public String gerarMatriculaProgramadorPhp() {
		String matriculaGerada = null;
		int quantidadeProgramadorPhps = repositorioProgramadorPhp.listarProgramadorPhp().size();
		quantidadeProgramadorPhps++;
		
		matriculaGerada = ("PROPH00" +quantidadeProgramadorPhps++);
		
		return matriculaGerada;
	}
	

}

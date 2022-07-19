package br.impacta.repository;

import java.util.List;

import br.impacta.model.ProgramadorPhp;

public interface InterfaceProgramadorPhp {

	//metodos obrigatorios
	public boolean salvarProgramadorPhp(ProgramadorPhp programadorPhp);
	public List<ProgramadorPhp> listarProgramadorPhp();
	public boolean deletarProgramadorPhp(String matricula);
	public ProgramadorPhp buscarProgramadorPhp(String matricula);
	public boolean alterarProgramadorPhp(ProgramadorPhp programadorPhpNovo, ProgramadorPhp programadorPhpAtual);

	
	
	
}

package br.impacta.repository;

import java.util.ArrayList;
import java.util.List;


import br.impacta.model.ProgramadorPhp;

import br.impacta.persistence.dao.ProgramadorPhpDao;

public class RepositorioProgramadorPhp  implements InterfaceProgramadorPhp{

	
	List<ProgramadorPhp> listaDeProgramadorPhpes = new ArrayList<>();
	ProgramadorPhpDao programadorPhpDao = new ProgramadorPhpDao();
	
	
	@Override
	public boolean salvarProgramadorPhp(ProgramadorPhp programadorPhp) {
		
			boolean salvo;
			
		
		
			salvo =	programadorPhpDao.salvaNoBanco(programadorPhp);
			
		
		
		return salvo;
	}

	@Override
	public List<ProgramadorPhp> listarProgramadorPhp() {
		
		return programadorPhpDao.BuscarListaProgramadorPhp();
	}

	@Override
	public boolean deletarProgramadorPhp(String matricula) {
		
		boolean deletado = programadorPhpDao.deletarPelaMatricula(matricula);
		
		return deletado;
	}

	@Override
	public ProgramadorPhp buscarProgramadorPhp(String matricula) {
		
		for(ProgramadorPhp programadorPhp:programadorPhpDao.BuscarListaProgramadorPhp()) {
			if(programadorPhp.getMatricula().equals(matricula)) {
				
				
				return programadorPhp;
			}
			
		}
		
		return null;
	}

	@Override
	public boolean alterarProgramadorPhp(ProgramadorPhp programadorPhpAtual, ProgramadorPhp programadorPhpNovo) {
		
		boolean alterado = programadorPhpDao.alterarProgramadorPhpNoBanco(programadorPhpNovo);
		
		return alterado;
		
	}

	
	
	
}









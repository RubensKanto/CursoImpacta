package br.impacta.repository;

import java.util.ArrayList;
import java.util.List;

import br.impacta.model.ProgramadorJava;
import br.impacta.persistence.dao.ProgramadorJavaDao;



public class RepositorioProgramadorJava implements InterfaceProgramadorJava{

		
		List<ProgramadorJava> listaDeProgramadorJavaes = new ArrayList<>();
		ProgramadorJavaDao programadorJavaDao = new ProgramadorJavaDao();
		
		
		@Override
		public boolean salvarProgramadorJava(ProgramadorJava programadorJava) {
			
				boolean salvo;
				
			
			
				salvo =	programadorJavaDao.salvaNoBanco(programadorJava);
				
			
			
			return salvo;
		}

		@Override
		public List<ProgramadorJava> listarProgramadorJava() {
			
			return programadorJavaDao.BuscarListaProgramadorJava();
		}

		@Override
		public boolean deletarProgramadorJava(String matricula) {
			
			boolean deletado = programadorJavaDao.deletarPelaMatricula(matricula);
			
			return deletado;
		}

		@Override
		public ProgramadorJava buscarProgramadorJava(String matricula) {
			
			for(ProgramadorJava programadorJava:programadorJavaDao.BuscarListaProgramadorJava()) {
				if(programadorJava.getMatricula().equals(matricula)) {
					
					
					return programadorJava;
				}
				
			}
			
			return null;
		}

		@Override
		public boolean alterarProgramadorJava(ProgramadorJava programadorJavaAtual, ProgramadorJava programadorJavaNovo) {
			
			boolean alterado = programadorJavaDao.alterarProgramadorJavaNoBanco(programadorJavaNovo);
			
			return alterado;
			
		}

		
		
		
	}

	
	
	
	
	
	


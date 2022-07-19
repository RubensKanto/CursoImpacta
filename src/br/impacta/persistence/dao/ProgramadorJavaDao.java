package br.impacta.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.impacta.model.ProgramadorJava;
import br.impacta.persistence.ConexaoBanco;



public class ProgramadorJavaDao {
	
	
public boolean salvaNoBanco(ProgramadorJava programadorJava) {
		
		boolean salvo;
	
		String sql = "INSERT INTO programadorjava (matricula, nome, salario, certificacaooracle) VALUES(?,?,?,?)";
	
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.criaConexaoComMySql();
			
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			pstm.setString(1,programadorJava.getMatricula());
			pstm.setString(2,programadorJava.getNome());
		
			pstm.setDouble(3,programadorJava.getSalario());
			pstm.setString(4,programadorJava.getCertificacaoOracle());
			
			pstm.execute();
			
			System.out.println("ProgramadorJava Salvo com Sucesso!!");
			salvo = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro na DAO - SALVAR");
			salvo = false;
		}finally {
			
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
					
				}
			}catch(Exception e){
				
				e.printStackTrace();
				
			}
			
		}
		
		return salvo;
		
	}


	public List<ProgramadorJava> BuscarListaProgramadorJava(){
	
		String sql = "SELECT * FROM programadorjava";
		List<ProgramadorJava> programadorJavas = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = ConexaoBanco.criaConexaoComMySql();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			rset = 	pstm.executeQuery();
			
			while(rset.next()) {
				ProgramadorJava programadorJava = new ProgramadorJava();
				
				
				
				programadorJava.setMatricula(rset.getString("matricula"));
				programadorJava.setNome(rset.getString("nome"));
				programadorJava.setSalario(rset.getDouble("salario"));
				programadorJava.setCertificacaoOracle(rset.getString("CertificacaoOracle"));
				programadorJavas.add(programadorJava);
		
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu problema no listar!!");
		}finally {
			
			 
				try {
					if(rset != null) {
						rset.close();
					}
					
					if(pstm != null) {
						pstm.close();
					}
					
					if(conn != null) {
						conn.close();
					}
					
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
		}
		
		return programadorJavas;
	
	}
	
	public boolean deletarPelaMatricula(String matricula) {
		String sql = "DELETE FROM programadorjava WHERE matricula = ?";
		
		boolean deletado = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConexaoBanco.criaConexaoComMySql();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, matricula);
			pstm.execute();
			deletado = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro no deletar.");
		}finally {
			try {
				if(pstm != null) {
					pstm.close();	
				}
				
				if(conn != null) {
					conn.close();	
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Deu erro na hora de fechar conexão");
			}
			
			
		}
		return deletado;
		
		
	}
	
	
	public boolean alterarProgramadorJavaNoBanco(ProgramadorJava programadorJava) {
		String sql = "UPDATE programadorjava SET matricula = ?,nome = ?, salario = ?, certificacaooracle = ?  WHERE matricula = ? ";
	
		boolean alterado = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConexaoBanco.criaConexaoComMySql();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, programadorJava.getMatricula());
			pstm.setString(2, programadorJava.getNome());
			pstm.setDouble(3,programadorJava.getSalario());	
			pstm.setString(4, programadorJava.getCertificacaoOracle());
			
			pstm.setString(5, programadorJava.getMatricula());

			
			pstm.execute();
			alterado = true;
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu erro no UPDATE");
		}finally {
			try {
				if(pstm != null) {
					pstm.close();	
				}
				
				if(conn != null) {
					conn.close();	
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Deu erro na hora de fechar conexão");
			}
			
			
		}
		return alterado;
		
	}
	

}

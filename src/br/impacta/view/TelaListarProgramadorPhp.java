package br.impacta.view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.impacta.model.ProgramadorPhp;
import br.impacta.view.controller.TelaListarProgramadorPhpControle;



public class TelaListarProgramadorPhp {
	
public void apresentarListaProgramadorPhp(List<ProgramadorPhp> listaDeProgramadorPhps, JFrame frameMenuInicialProgramadorPhp) {
		
		
		int quantidadeDeLinhas = listaDeProgramadorPhps.size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][4];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(ProgramadorPhp programadorPhp:listaDeProgramadorPhps ) {
			
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorPhp.getMatricula();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorPhp.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = String.valueOf(programadorPhp.getSalario());
			
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorPhp.getCertificacaoPhp();
			
			posicaoColuna = 0;
			posicaoLinha++;
		}
		
		String colunasTitulos[] = {"Matricula","Nome","Salario","Certificacao"}; 
		
		
		JFrame frameListarProgramadorPhp = new JFrame();
		frameListarProgramadorPhp.setSize(500,600);
		
		JTable tabelaProgramadorPhp = new JTable(tabelaString, colunasTitulos);
		tabelaProgramadorPhp.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarProgramadorPhp = new JScrollPane(tabelaProgramadorPhp);
		JPanel panelListarProgramadorPhp = new JPanel();
		
		panelListarProgramadorPhp.add(scrollPaneListarProgramadorPhp);
		
		JButton buttonListarProgramadorPhp = new JButton("Voltar para Menu Programador Php");
		panelListarProgramadorPhp.add(buttonListarProgramadorPhp);
	
		frameListarProgramadorPhp.add(panelListarProgramadorPhp);
		frameListarProgramadorPhp.setVisible(true);
		
		TelaListarProgramadorPhpControle telaListarProgramadorPhpControle = new TelaListarProgramadorPhpControle(frameMenuInicialProgramadorPhp,frameListarProgramadorPhp);
		buttonListarProgramadorPhp.addActionListener(telaListarProgramadorPhpControle);
	}
	
	
	

}

package br.impacta.view;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.impacta.model.ProgramadorJava;
import br.impacta.view.controller.TelaListarProgramadorJavaControle;


public class TelaListarProgramadorJava {

	public void apresentarListaProgramadorJava(List<ProgramadorJava> listaDeProgramadorJavas, JFrame frameMenuInicialProgramadorJava) {
		
		
		int quantidadeDeLinhas = listaDeProgramadorJavas.size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][4];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(ProgramadorJava programadorJava:listaDeProgramadorJavas ) {
			
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorJava.getMatricula();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorJava.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = String.valueOf(programadorJava.getSalario());
			
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorJava.getCertificacaoOracle();
			
			posicaoColuna = 0;
			posicaoLinha++;
		}
		
		String colunasTitulos[] = {"Matricula","Nome","Salario","Certificacao"}; 
		
		
		JFrame frameListarProgramadorJava = new JFrame();
		frameListarProgramadorJava.setSize(500,600);
		
		JTable tabelaProgramadorJava = new JTable(tabelaString, colunasTitulos);
		tabelaProgramadorJava.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneListarProgramadorJava = new JScrollPane(tabelaProgramadorJava);
		JPanel panelListarProgramadorJava = new JPanel();
		
		panelListarProgramadorJava.add(scrollPaneListarProgramadorJava);
		
		JButton buttonListarProgramadorJava = new JButton("Voltar para Menu Programador Java");
		panelListarProgramadorJava.add(buttonListarProgramadorJava);
	
		frameListarProgramadorJava.add(panelListarProgramadorJava);
		frameListarProgramadorJava.setVisible(true);
		
		TelaListarProgramadorJavaControle telaListarProgramadorJavaControle = new TelaListarProgramadorJavaControle(frameMenuInicialProgramadorJava,frameListarProgramadorJava);
		buttonListarProgramadorJava.addActionListener(telaListarProgramadorJavaControle);
	}
	
	
	
	
}

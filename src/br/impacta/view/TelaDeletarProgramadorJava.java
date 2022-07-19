package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorJava;
import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.controller.TelaDeletarProgramadorJavaControle;



public class TelaDeletarProgramadorJava {

public void apresentarDeletarProgramadorJava(RepositorioProgramadorJava repositorioProgramadorJava, JFrame frameMenuInicialProgramadorJava) {
		
		
		
		int quantidadeDeLinhas = repositorioProgramadorJava.listarProgramadorJava().size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][4];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(ProgramadorJava programadorJava:repositorioProgramadorJava.listarProgramadorJava()) {
			
			
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
		
		
		JFrame frameDeletarProgramadorJava = new JFrame();
		frameDeletarProgramadorJava.setSize(500,600);
		
		JTable tabelaProgramadorJava = new JTable(tabelaString, colunasTitulos);
		tabelaProgramadorJava.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneDeletarProgramadorJava = new JScrollPane(tabelaProgramadorJava);
		JPanel panelDeletarProgramadorJava = new JPanel();
		
		JLabel matriculaLabel = new JLabel("Digite a Matricula para deletar:");
		panelDeletarProgramadorJava.add(matriculaLabel);
		
		JTextField matriculaField = new JTextField(10);
		panelDeletarProgramadorJava.add(matriculaField);
		
		
		panelDeletarProgramadorJava.add(scrollPaneDeletarProgramadorJava);
		
		JButton buttonDeletarProgramadorJava = new JButton("Deletar Programador Java");
		panelDeletarProgramadorJava.add(buttonDeletarProgramadorJava);
	
		frameDeletarProgramadorJava.add(panelDeletarProgramadorJava);
		frameDeletarProgramadorJava.setVisible(true);
		
		TelaDeletarProgramadorJavaControle telaDeletarProgramadorJavaControle = new TelaDeletarProgramadorJavaControle(repositorioProgramadorJava, frameMenuInicialProgramadorJava, frameDeletarProgramadorJava, matriculaField);
		buttonDeletarProgramadorJava.addActionListener(telaDeletarProgramadorJavaControle);
	}
	
}

package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TelaDeletarProgramadorPhpControle;



public class TelaDeletarProgramadorPhp {

public void apresentarDeletarProgramadorPhp(RepositorioProgramadorPhp repositorioProgramadorPhp, JFrame frameMenuInicialProgramadorPhp) {
		
		
		
		int quantidadeDeLinhas = repositorioProgramadorPhp.listarProgramadorPhp().size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][4];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(ProgramadorPhp programadorPhp:repositorioProgramadorPhp.listarProgramadorPhp()) {
			
			
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
		
		
		JFrame frameDeletarProgramadorPhp = new JFrame();
		frameDeletarProgramadorPhp.setSize(500,600);
		
		JTable tabelaProgramadorPhp = new JTable(tabelaString, colunasTitulos);
		tabelaProgramadorPhp.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneDeletarProgramadorPhp = new JScrollPane(tabelaProgramadorPhp);
		JPanel panelDeletarProgramadorPhp = new JPanel();
		
		JLabel matriculaLabel = new JLabel("Digite a Matricula para deletar:");
		panelDeletarProgramadorPhp.add(matriculaLabel);
		
		JTextField matriculaField = new JTextField(10);
		panelDeletarProgramadorPhp.add(matriculaField);
		
		
		panelDeletarProgramadorPhp.add(scrollPaneDeletarProgramadorPhp);
		
		JButton buttonDeletarProgramadorPhp = new JButton("Deletar Programador Php");
		panelDeletarProgramadorPhp.add(buttonDeletarProgramadorPhp);
	
		frameDeletarProgramadorPhp.add(panelDeletarProgramadorPhp);
		frameDeletarProgramadorPhp.setVisible(true);
		
		TelaDeletarProgramadorPhpControle telaDeletarProgramadorPhpControle = new TelaDeletarProgramadorPhpControle(repositorioProgramadorPhp, frameMenuInicialProgramadorPhp, frameDeletarProgramadorPhp, matriculaField);
		buttonDeletarProgramadorPhp.addActionListener(telaDeletarProgramadorPhpControle);
	}
	
	
}
